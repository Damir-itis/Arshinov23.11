package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // для всех сущностей пишем эту аннотацию
public class User {  // в домейне мы пишем сущности, классы, которые отобразятся базой данных в таблицу

    @Id// В каждой сущности пишем id, который говорит, что этот объект уникальный
    @GeneratedValue(strategy = GenerationType.AUTO) // пишем каким образом будем обновлять id, то есть каждый раз +1
    private Long id;

    private String firstName; // Поля - это наши колонки в таблице
    private String lastName;

    //private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
