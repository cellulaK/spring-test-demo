package com.hhx.self.selfEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.CustomEditorConfigurer;


/**
 * @author kai·yang
 * @Date 2023/3/10 15:22
 *
 *
 * 自定义属性编辑器 注册器
 *
 */
public class SelfEditorRegistry extends CustomEditorConfigurer implements PropertyEditorRegistrar {


    /**
     * 注册自定义属性编辑器到 给定的 { PropertyEditorRegistry }注册器
     * @param registry
     */

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Address.class, new SelfEditor());
    }

}
