package com.nokhrin.springtestproj.service;

import com.nokhrin.springtestproj.model.MyUserRole;

import java.util.List;

public interface MyUserRoleService {

    void addAppUserRole(MyUserRole myUserRole);
    List<MyUserRole> listAppUserRole();
    MyUserRole getAppUserRole(String role);
}
