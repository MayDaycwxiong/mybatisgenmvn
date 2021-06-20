package com.infinite.life.mybatisgenmvn;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

/**
 * MyBatis注释生成器
 */
public class CommentGenerator extends DefaultCommentGenerator {
    /**
     * 由于默认实现类中的可配参数都没有提供给子类可以访问的方法，这里要定义一遍
     */
    private boolean suppressAllComments;

    /**
     * 同上
     */
    private boolean addRemarkComments;

    /**
     * 获取用户配置的参数
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        suppressAllComments = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
        addRemarkComments = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
    }

    /**
     * 给生成的实体类添加注释
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass,
                                     IntrospectedTable introspectedTable) {
        if (suppressAllComments || !addRemarkComments) {
            return;
        }

        topLevelClass.addJavaDocLine("/**");
        String remarks = introspectedTable.getRemarks();
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));
            for (String remarkLine : remarkLines) {
                topLevelClass.addJavaDocLine(" * " + remarkLine);
            }
        }
        topLevelClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(" */");
    }

    /**
     * 给字段添加注释
     */
    @Override
    public void addFieldComment(Field field,
                                IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        //如果阻止生成所有注释，直接返回
        if (suppressAllComments) {
            return;
        }
        //文档注释开始
        field.addJavaDocLine("/**");
        //获取数据库字段的备注信息
        String remarks = introspectedColumn.getRemarks();
        //根据参数和备注信息判断是否添加备注信息
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            String[] remarkLines = remarks.split(System.lineSeparator());
            for (String remarkLine : remarkLines) {
                field.addJavaDocLine(" * " + remarkLine);
            }
        }
        //由于 Java 对象名和数据库字段名可能不一样，注释中保留数据库字段名
        field.addJavaDocLine(" * " + introspectedColumn.getActualColumnName());
        field.addJavaDocLine(" */");

        //swagger注解
        StringBuilder annotation = new StringBuilder()
                .append("@ApiModelProperty")
                .append("(value = \"").append(introspectedColumn.getRemarks()).append("\", ")
                .append("required = ").append(introspectedColumn.isNullable() ? "false" : "true");
        annotation.append(")");
        field.addAnnotation(annotation.toString());

        //自研api注解
//        StringBuilder annotation = new StringBuilder()
//                .append("@ApiField")
//                .append("(description = \"").append(introspectedColumn.getRemarks()).append("\", ")
//                .append("required = ").append(introspectedColumn.isNullable() ? "false" : "true").append(", ")
//                .append("maxLength = \"").append(introspectedColumn.getLength()).append("\"");
//        if (introspectedColumn.getDefaultValue() != null) {
//            annotation.append(", defaultValue = \"").append(introspectedColumn.getDefaultValue()).append("\"");
//        }
//        annotation.append(")");
//        field.addAnnotation(annotation.toString());
    }

    /**
     * 给getter方法添加注释
     */
    @Override
    public void addGetterComment(Method method,
                                 IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }

//        method.addJavaDocLine("/**");
//        StringBuffer sb = new StringBuffer();
//        sb.append(" * @return the value of ");
//        sb.append(introspectedTable.getFullyQualifiedTable());
//        sb.append('.');
//        sb.append(introspectedColumn.getActualColumnName());
//        method.addJavaDocLine(sb.toString());
//        method.addJavaDocLine(" */");
    }

    /**
     * 给setter方法添加注释
     */
    @Override
    public void addSetterComment(Method method,
                                 IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }

//        method.addJavaDocLine("/**");
//        Parameter parm = method.getParameters().get(0);
//        StringBuilder sb = new StringBuilder();
//        sb.append(" * @param ");
//        sb.append(parm.getName());
//        sb.append(" the value for ");
//        sb.append(introspectedTable.getFullyQualifiedTable());
//        sb.append('.');
//        sb.append(introspectedColumn.getActualColumnName());
//        method.addJavaDocLine(sb.toString());
//        method.addJavaDocLine(" */");
    }

    /**
     * 给mapper接口中的方法添加注释
     */
    @Override
    public void addGeneralMethodComment(Method method,
                                        IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
    }
}
