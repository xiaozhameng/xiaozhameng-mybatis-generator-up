package com.xiaozhameng.extend.generator;

import com.xiaozhameng.extend.SelectByConditionMethodGenerator;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.AbstractJavaMapperMethodGenerator;

/**
 * Created by xiaozhaeng on 2017/4/8.
 * Dao 接口生成方法的扩展
 */
public class JavaMapperGenerator_Extend extends JavaMapperGenerator{

    public JavaMapperGenerator_Extend(){
        super();
    }

    /**
     * Dao 接口中生成方法的扩展
     */
    public void daoMethodInit(Interface interfaze){

//        addCountByExampleMethod(interfaze);
//        addDeleteByExampleMethod(interfaze);
//        addDeleteByPrimaryKeyMethod(interfaze);
//        addInsertMethod(interfaze);
//        addInsertSelectiveMethod(interfaze);
//        addSelectByExampleWithBLOBsMethod(interfaze);
//        addSelectByExampleWithoutBLOBsMethod(interfaze);
//        addSelectByPrimaryKeyMethod(interfaze);
//        addUpdateByExampleSelectiveMethod(interfaze);
//        addUpdateByExampleWithBLOBsMethod(interfaze);
//        addUpdateByExampleWithoutBLOBsMethod(interfaze);
//        addUpdateByPrimaryKeySelectiveMethod(interfaze);
//        addUpdateByPrimaryKeyWithBLOBsMethod(interfaze);
//        addUpdateByPrimaryKeyWithoutBLOBsMethod(interfaze);

        // 根据主键删除记录的方法
        addDeleteByPrimaryKeyMethod(interfaze);
        // 新增方法
        addInsertSelectiveMethod(interfaze);
        // 根据主键更新的方法
        addUpdateByPrimaryKeySelectiveMethod(interfaze);

        // 自定义的Dao方法
        addSelectByConditionElement(interfaze);

    }

    /**
     * 自定义Dao的方法
     * @param interfaze
     */
    protected void addSelectByConditionElement(Interface interfaze) {
        if (introspectedTable.getRules().generateSelectByPrimaryKey()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new SelectByConditionMethodGenerator(false);
            initializeAndExecuteGenerator(methodGenerator, interfaze);
        }
    }

}
