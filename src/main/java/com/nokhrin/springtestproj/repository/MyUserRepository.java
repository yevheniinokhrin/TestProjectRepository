package com.nokhrin.springtestproj.repository;

import com.nokhrin.springtestproj.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {

    MyUser findById(long id);
    MyUser findByLastName(String lastName);
    MyUser findByEmail(String lastName);

}
