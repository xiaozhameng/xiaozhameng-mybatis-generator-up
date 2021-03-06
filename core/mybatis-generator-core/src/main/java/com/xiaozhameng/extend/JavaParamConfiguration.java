package com.xiaozhameng.extend;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.TypedPropertyHolder;

import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

/**
 * 自定义业务对象
 * Created by xiaozhameng on 2017/4/7.
 */
public class JavaParamConfiguration extends TypedPropertyHolder {

    private String baseDAO; // baseDAO类路径
    private String baseService; // baseService类路径
    private String buildType; // 1.dao层 2.service层 3.control层

    private String mapperExt; // dao文件后缀配置

    public JavaParamConfiguration() {
        super();
    }

    public String getBaseDAO() {
        return baseDAO;
    }

    public void setBaseDAO(String baseDAO) {
        this.baseDAO = baseDAO;
    }

    public String getBaseService() {
        return baseService;
    }

    public void setBaseService(String baseService) {
        this.baseService = baseService;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public String getMapperExt() {
        return mapperExt;
    }

    public void setMapperExt(String mapperExt) {
        this.mapperExt = mapperExt;
    }

    public XmlElement toXmlElement() {
        XmlElement answer = new XmlElement("javaParam"); //$NON-NLS-1$

        if (baseDAO != null) {
            answer.addAttribute(new Attribute("baseDAO", baseDAO)); //$NON-NLS-1$
        }

        if (baseService != null) {
            answer.addAttribute(new Attribute("baseService", baseService)); //$NON-NLS-1$
        }

        if (buildType != null) {
            answer.addAttribute(new Attribute("buildType", buildType)); //$NON-NLS-1$
        }

        if (mapperExt != null) {
            answer.addAttribute(new Attribute("mapperExt", mapperExt)); //$NON-NLS-1$
        }

        addPropertyXmlElements(answer);

        return answer;
    }

    public void validate(List<String> errors, String contextId) {

        if (!stringHasValue(baseDAO)) {
            errors.add(getString("ValidationError.12", //$NON-NLS-1$
                    "JavaParamConfiguration", contextId)); //$NON-NLS-1$
        }

        if (!stringHasValue(baseService)) {
            errors.add(getString("ValidationError.13", //$NON-NLS-1$
                    "JavaParamConfiguration", contextId)); //$NON-NLS-1$
        }

        if (!stringHasValue(buildType)) {
            errors.add(getString("ValidationError.14", //$NON-NLS-1$
                    "JavaParamConfiguration", contextId)); //$NON-NLS-1$
        }

    }
}
