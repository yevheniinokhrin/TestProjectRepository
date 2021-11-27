package com.nokhrin.springtestproj.service;

import com.nokhrin.springtestproj.model.MyUser;
import com.nokhrin.springtestproj.repository.MyUserRepository;
import com.nokhrin.springtestproj.repository.MyUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private MyUserRepository myUserRepository;
    @Autowired
    private MyUserRoleRepository myUserRoleRepository;

    @Transactional
    @Override
    public void addMyUser(MyUser myUser) {
        myUser.getAppUserRole().add(myUserRoleRepository.findByRole("ROLE_USER"));
        myUser.setPassword(hashPassword(myUser.getPassword()));
        myUserRepository.save(myUser);
    }

    @Override
    @Transactional
    public void editMyUser(MyUser myUser) {
        myUserRepository.save(myUser);
    }

    @Override
    @Transactional
    public List<MyUser> listMyUsers() {
        return myUserRepository.findAll();
    }

    @Override
    @Transactional
    public void removeMyUser(long id) {
        myUserRepository.deleteById(id);
    }

    @Override
    public MyUser getMyUser(long id) {
        return myUserRepository.findById(id);
    }

    @Override
    public MyUser getByLastName(String lastName) {
        return myUserRepository.findByLastName(lastName);
    }

    @Override
    public MyUser getByEmail(String email) {
        return myUserRepository.findByEmail(email);
    }

    private String hashPassword(String password){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
}
