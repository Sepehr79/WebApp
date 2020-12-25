/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author NP-soft
 */
@Entity
@Table(name = "User")
public class User implements Serializable {
    
    @Id
    @Column(name = "email")
    private String email;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "lastName")
    private String lastName;
    
    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(String name, String lastName, int age, String email, String password) {
        this.email = email;
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }   

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", age=" + age + ", name=" + name + ", lastName=" + lastName + ", password=" + password + '}';
    }
    
}
