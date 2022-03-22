package com.guli.springboot_learn.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 如果将所有的配置都集中到 application.properties 或 application.yml 中，
 * 那么这个配置文件会十分的臃肿且难以维护，
 * 因此通常会将与 Spring Boot 无关的配置（例如自定义配置）提取出来，写在一个单独的配置文件中，
 * 并在对应的 JavaBean 上使用 @PropertySource 注解指向该配置文件
 *
 * @PropertySource 只对 properties 文件可以进行加载
 * 修改支持yml https://www.cnblogs.com/suizhikuo/p/13273257.html
 */
@PropertySource(value = "classpath:person2.properties") // 指向对应的配置文件
@Component
@ConfigurationProperties(prefix = "person2")
public class Person2 {

    private String lastName;
    private  Integer age;
    private Boolean boss;
    private Date brith;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    public Person2() {
    }

    public Person2(String lastName, Integer age, Boolean boss, Date brith, Map<String, Object> maps, List<Object> lists, Dog dog) {
        this.lastName = lastName;
        this.age = age;
        this.boss = boss;
        this.brith = brith;
        this.maps = maps;
        this.lists = lists;
        this.dog = dog;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", brith=" + brith +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
