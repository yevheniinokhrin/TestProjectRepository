package com.nokhrin.springtestproj.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<MyUserRole> appUserRole = new HashSet<MyUserRole>(0);

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<MyUserRole> getAppUserRole() {
        return appUserRole;
    }

    public void setAppUserRole(Set<MyUserRole> appUserRole) {
        this.appUserRole = appUserRole;
    }
}
