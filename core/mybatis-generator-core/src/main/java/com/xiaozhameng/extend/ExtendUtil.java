package com.xiaozhameng.extend;

import org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator;
import org.mybatis.generator.config.Context;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Properties;

/**
 * Created by VULCAN on 2017/4/8.
 */
public class ExtendUtil {






    public static void parseJavaParam(Context context, Node node,Properties attributes){
//        JavaParamConfiguration javaParamConfiguration = new JavaParamConfiguration();
//
//        context.setJavaParamConfiguration(javaParamConfiguration);
//
////        Properties attributes = parseAttributes(node);
//        String baseDAO = attributes.getProperty("baseDAO"); //$NON-NLS-1$
//        String baseService = attributes.getProperty("baseService"); //$NON-NLS-1$
//        String buildType = attributes.getProperty("buildType"); //$NON-NLS-1$
//        String mapperExt = attributes.getProperty("mapperExt"); // 增加自定义参数填充
//
//        javaParamConfiguration.setBaseDAO(baseDAO);
//        javaParamConfiguration.setBaseService(baseService);
//        javaParamConfiguration.setBuildType(buildType);
//        javaParamConfiguration.setMapperExt(mapperExt);
//
//        NodeList nodeList = node.getChildNodes();
//
//        return nodeList;
//        for (int i = 0; i < nodeList.getLength(); i++) {
//            Node childNode = nodeList.item(i);
//
//            if (childNode.getNodeType() != Node.ELEMENT_NODE) {
//                continue;
//            }
//
//            if ("property".equals(childNode.getNodeName())) { //$NON-NLS-1$
//                parseProperty(javaParamConfiguration, childNode);
//            }
//        }
    }

}
