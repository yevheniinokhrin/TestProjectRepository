package com.nokhrin.springtestproj.service;


import com.nokhrin.springtestproj.model.MyUserRole;
import com.nokhrin.springtestproj.repository.MyUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserRoleServiceImpl implements MyUserRoleService {

    @Autowired
    MyUserRoleRepository myUserRoleRepository;

    @Override
    public void addAppUserRole(MyUserRole myUserRole) {
        myUserRoleRepository.save(myUserRole);
    }

    @Override
    public List<MyUserRole> listAppUserRole() {
        return myUserRoleRepository.findAll();
    }

    @Override
    public MyUserRole getAppUserRole(String role) {
        return myUserRoleRepository.findByRole(role);
    }
}
