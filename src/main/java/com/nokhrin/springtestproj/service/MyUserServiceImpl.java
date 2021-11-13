package com.nokhrin.springtestproj.service;

import com.nokhrin.springtestproj.model.MyUser;
import com.nokhrin.springtestproj.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private MyUserRepository myUserRepository;

    @Transactional
    @Override
    public void addMyUser(MyUser myUser) {
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
}
