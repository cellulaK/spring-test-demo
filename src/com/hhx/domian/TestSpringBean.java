package com.hhx.domian;

import com.hhx.entity.User;
import com.hhx.self.selfEditor.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kai·yang
 * @Date 2023/3/9 10:56
 */
public class TestSpringBean {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Customer bean = context.getBean(Customer.class);
        System.out.println(bean.toString());


    }
}
