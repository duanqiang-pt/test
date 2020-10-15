package com.zhongsheng.component.where;


import com.zhongsheng.component.enums.WhereTypeEnum;

/**
 * 关于and关键字的条件
 * 
 * 动态查询条件单元，一个该类的对象表示一个判断分支。
 * 例如：…… AND a=1 就是一个该类的对象
 * @version 1.0
 */
public class AndItem {
    
    
    /*
     * where条件匹配的类型，例如fieldName =就为：EQUAL_TO
     */
    private WhereTypeEnum whereType;
    
    /*
     * 需要进行比对的字段名
     */
    private String fieldName;

    /*
     * 查询条件对应值
     */
    private Object value;

    /*
     * 查询条件对应第二值，如between中的第二个值
     */
    private Object secondValue;
    
	/**
     * 基本构造器
     * @param whereType     where条件匹配的类型
     * @param fieldName     要进行对比的字段名
     * @param value             要进行过滤的字段值
     */
    public AndItem(WhereTypeEnum whereType,String fieldName,Object value) {
        this.whereType = whereType;
        this.fieldName = fieldName;
        this.value = value;
    }
    
    /**
     * 为between而设计的构造器
     * @param whereType     where条件匹配的类型
     * @param fieldName     要进行对比的字段名
     * @param value             要进行过滤的字段值
     * @param secondValue	要进行过滤的第二个字段值
     */
    public AndItem(WhereTypeEnum whereType,
    				String fieldName,Object value,Object secondValue) {
    	this(whereType,fieldName,value);
    	this.secondValue = secondValue;
    }
    
    

    public WhereTypeEnum getWhereType() {
        return whereType;
    }

    public void setWhereType(WhereTypeEnum whereType) {
        this.whereType = whereType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Object secondValue) {
        this.secondValue = secondValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

}
