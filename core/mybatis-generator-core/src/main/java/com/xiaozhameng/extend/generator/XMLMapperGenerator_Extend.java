package com.xiaozhameng.extend.generator;

import com.xiaozhameng.extend.SelectByConditionElementGenerator;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.XMLMapperGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.AbstractXmlElementGenerator;

/**
 * Created by VULCAN on 2017/4/8.
 * sql 的xml文件扩展
 */
public class XMLMapperGenerator_Extend extends XMLMapperGenerator{

    public XMLMapperGenerator_Extend (){
        super();
    }

    /**
     * mapper.xml 文件接口的方法
     */
    public void mapperMethodInit(XmlElement answer){
//        addResultMapWithoutBLOBsElement(answer);
//        addResultMapWithBLOBsElement(answer);
//        addExampleWhereClauseElement(answer);
//        addMyBatis3UpdateByExampleWhereClauseElement(answer);
//        addBaseColumnListElement(answer);
//        addBlobColumnListElement(answer);
//        addSelectByExampleWithBLOBsElement(answer);
//        addSelectByExampleWithoutBLOBsElement(answer);
//        addSelectByPrimaryKeyElement(answer);
//        addDeleteByPrimaryKeyElement(answer);
//        addDeleteByExampleElement(answer);
//        addInsertElement(answer);
//        addInsertSelectiveElement(answer);
//        addCountByExampleElement(answer);
//        addUpdateByExampleSelectiveElement(answer);
//        addUpdateByExampleWithBLOBsElement(answer);
//        addUpdateByExampleWithoutBLOBsElement(answer);
//        addUpdateByPrimaryKeySelectiveElement(answer);
//        addUpdateByPrimaryKeyWithBLOBsElement(answer);
//        addUpdateByPrimaryKeyWithoutBLOBsElement(answer);

        // 增加resultMap
        addResultMapWithoutBLOBsElement(answer);
        // 增加baseColumnList
        addBaseColumnListElement(answer);

        // 增加----新增方法
        addInsertSelectiveElement(answer);
        // 增加----根据主键更新的方法
        addUpdateByPrimaryKeySelectiveElement(answer);
        // 增加----根据主键删除的方法
        addDeleteByPrimaryKeyElement(answer);

        // 自定义方法
        addSelectByConditionElement(answer);

    }

    /**
     * 自定义sql方法调用
     * @param parentElement
     */
    protected void addSelectByConditionElement(XmlElement parentElement) {
        if (introspectedTable.getRules().generateSelectByPrimaryKey()) {
            AbstractXmlElementGenerator elementGenerator = new SelectByConditionElementGenerator();
            initializeAndExecuteGenerator(elementGenerator, parentElement);
        }
    }

}
