package com.guli.springboot_learn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用到 @Component 注解来添加组件到容器中;
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能;
 *
 * @ConfigurationProperties：告诉 SpringBoot 将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person"：配置文件中哪个下面的所有属性进行一一映射;
 *
 */
@Component
//@ConfigurationProperties(prefix = "person1")
public class Person1 {

    /**
     * @Value 和 @ConfigurationProperties 注解都能读取配置文件中的属性值并绑定到 JavaBean 中，但两者存在以下不同:
     *   1. 使用位置不同
     *      - @ConfigurationProperties：标注在 JavaBean 的类名上
     *      - @Value：标注在 JavaBean 的属性上
     *   2. 功能不同
     *      - @ConfigurationProperties：用于批量绑定配置文件中的配置
     *      - @Value：只能一个一个的指定需要绑定的配置
     *   3. 松散绑定支持不同
     *      - @ConfigurationProperties：支持松散绑定（松散语法），例如实体类 Person 中有一个属性为 lastName，那么配置文件中的属性名支持以下写法：
     *          person.firstName
     *          person.first-name
     *          person.first_name
     *          PERSON_FIRST_NAME
     *      - @Value：不支持松散绑定
     *   4. SpEL 支持不同
     *      - @ConfigurationProperties：不支持 SpEL 表达式
     *      - @Value：支持 SpEL 表达式
     *   5. 复杂类型封装
     *      - @ConfigurationProperties：支持所有类型数据的封装，例如 Map、List、Set、以及对象等
     *      - @Value：只支持基本数据类型的封装，例如字符串、布尔值、整数等类型
     *   6. 应用场景不同
     *      - 若只是获取配置文件中的某项值，则推荐使用 @Value 注解
     *      - 若专门编写了一个 JavaBean 来和配置文件进行映射，则建议使用 @ConfigurationProperties 注解
     */
    @Value("${person1.lastName}")
    private String lastName;
    @Value("${person1.age}")
    private  Integer age;
    @Value("${person1.boss}")
    private Boolean boss;
    @Value("${person1.brith}")
    private Date brith;

    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    public Person1() {
    }

    public Person1(String lastName, Integer age, Boolean boss, Date brith, Map<String, Object> maps, List<Object> lists, Dog dog) {
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
        return "Person1{" +
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
