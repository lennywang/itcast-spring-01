package com.itcast.c_injection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 *
 **/
public class CollectionBean {
    private Object[] arr;
    private List list;
    private Map map;
    private Properties properties;

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public CollectionBean() {
    }

    public CollectionBean(Object[] arr, List list, Map map, Properties properties) {
        this.arr = arr;
        this.list = list;
        this.map = map;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
