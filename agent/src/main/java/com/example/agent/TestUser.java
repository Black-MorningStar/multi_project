package com.example.agent;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestUser {
    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
