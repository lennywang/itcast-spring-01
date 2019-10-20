package com.itcast.b_create;

import com.itcast.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 **/
public class Demo {

    @Test
    public void func1()
    {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/b_create/applicationContext.xml");
//        System.out.println("------------------------------");
//        User user = (User) applicationContext.getBean("user");
//        System.out.println(user);
        //@Deprecated
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/itcast/b_create/applicationContext.xml"));
        User user = (User) beanFactory.getBean("user");
        Assert.assertEquals("test",user.getName());

    }
    @Test
    public void func2()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/b_create/applicationContext.xml");
        System.out.println("------------------------------");
        User user = (User) applicationContext.getBean("user2");
        System.out.println(user);
    }
    @Test
    public void func3()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/b_create/applicationContext.xml");
        System.out.println("------------------------------");
        User user = (User) applicationContext.getBean("user3");
        System.out.println(user);
    }

    @Test
    public void func4()
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/b_create/applicationContext.xml");
        System.out.println("-------------------------------");
        User user = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        System.out.println(user==user2);
        applicationContext.close();
    }


}
