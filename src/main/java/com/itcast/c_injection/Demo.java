package com.itcast.c_injection;

import com.itcast.bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 **/
public class Demo {

    @Test
    public void fun1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/c_injection/applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void fun2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/c_injection/applicationContext.xml");
        User user = (User) applicationContext.getBean("user2");
        System.out.println(user);
    }

    @Test
    public void fun3(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/c_injection/applicationContext.xml");
        User user = (User) applicationContext.getBean("user3");
        System.out.println(user);
    }

    @Test
    public void fun4(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/c_injection/applicationContext.xml");
        User user = (User) applicationContext.getBean("user4");
        System.out.println(user);
    }

    @Test
    public void fun5(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/itcast/c_injection/applicationContext.xml");
        CollectionBean bean = (CollectionBean) applicationContext.getBean("collectionbean");
        System.out.println(bean);
    }

}
