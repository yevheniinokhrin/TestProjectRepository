package com.nokhrin.springtestproj.service;


import com.nokhrin.springtestproj.model.MyUser;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MyUserService {

    void addMyUser(MyUser myUser);

    void editMyUser(MyUser myUser);

    List<MyUser> listMyUsers();

    void removeMyUser(long id);

    MyUser getMyUser(long id);

    MyUser getByLastName(String lastName);

    MyUser getByEmail(String lastName);
}
