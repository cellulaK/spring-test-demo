package com.hhx.self.selfEditor;

import java.beans.PropertyEditorSupport;

/**
 * @author kai·yang
 * @Date 2023/3/10 15:06
 *
 *
 *
 * 自定义属性编辑器
 *
 * 完成bean属性特殊处理
 *
 *
 */
public class SelfEditor extends PropertyEditorSupport {

    /**
     * Sets the property value by parsing a given String.  May raise
     * java.lang.IllegalArgumentException if either the String is
     * badly formatted or if this kind of property can't be expressed
     * as text.
     *
     * 通过解析给定的字符串设置属性值。如果 String 格式错误或此类属性不能表示为文本，则可能引发 java.lang.IllegalArgumentException
     *
     * @param text
     * @throws IllegalArgumentException
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Address address = new Address();
        String [] textArray = text.trim().split("_");
        address.setProvince(textArray[0]);
        address.setCity(textArray[1]);
        address.setTown(textArray[2]);
        this.setValue(address);
    }


}
