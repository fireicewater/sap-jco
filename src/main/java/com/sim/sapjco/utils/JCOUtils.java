package com.sim.sapjco.utils;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoTable;
import com.sim.sapjco.annotations.JcoEntity;
import com.sim.sapjco.annotations.JcoField;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 11:21
 */
@Component
@Slf4j
public class JCOUtils {

    @Autowired
    private JCoDestination jCoDestination;

    /**
     * @param tClass
     * @param <T>
     * @return
     */
    public <T> List<T> getObject(Class<T> tClass) {
        final JcoEntity jcoEntity = tClass.getAnnotation(JcoEntity.class);
        List<T> result = new ArrayList<>();
        //TODO 定义全局异常
        if (Objects.isNull(jcoEntity)) {
            return result;
        }
        try {
            final JCoFunction function = jCoDestination.getRepository().getFunction(jcoEntity.interfaceName());
            function.execute(jCoDestination);
            final JCoTable table = function.getTableParameterList().getTable(0);
            final Field[] fields = tClass.getDeclaredFields();
            //TODO 字表获取后续测试后开发
            for (int i = 0; i < table.getNumColumns(); i++) {
                table.setRow(i);
                final T t = tClass.newInstance();
                BeanWrapper beanWrapper = new BeanWrapperImpl(t);
                for (Field field : fields) {
                    final String name = field.getName();
                    final JcoField jcoField = field.getAnnotation(JcoField.class);
                    beanWrapper.setPropertyValue(name, table.getValue(jcoField.fieldname()));
                }
                result.add(t);
            }
        } catch (Exception e) {
            log.error("jco通讯失败", e);
        }
        return result;
    }


}
