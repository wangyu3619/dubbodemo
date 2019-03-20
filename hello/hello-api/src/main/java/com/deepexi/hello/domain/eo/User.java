package com.deepexi.hello.domain.eo;

/**
 * @author wangyu
 * 2019/03/19 17:32
 */
public class User extends SuperEntity{

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
