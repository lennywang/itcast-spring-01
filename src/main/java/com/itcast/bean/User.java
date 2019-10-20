package com.itcast.bean;

/**
 *
 **/
public class User {
    private String name="test";
    private Integer age;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User() {
        System.out.println("User()");
    }

    public User(Integer name, Car car) {
        System.out.println("User(String name, Car car)");
        this.name = name+"";
        this.car = car;
    }

    public User(Car car,String name){
        System.out.println("User(Car car,String name)");
        this.name=name ;
        this.car = car;
    }

    public User(String name, Integer age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public void init()
    {
        System.out.println("我是初始化方法");
    }

    public void destory()
    {
        System.out.println("我是销毁方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
