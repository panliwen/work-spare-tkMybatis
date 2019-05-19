package com.example.demo.entity;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author huangxl
 * @create 2018-11-08 21:00
 */

@Table(name = "t_user_1")
public class User11 {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
