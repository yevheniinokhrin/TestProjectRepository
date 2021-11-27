package com.nokhrin.springtestproj.repository;

import com.nokhrin.springtestproj.model.MyUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRoleRepository extends JpaRepository <MyUserRole,Long> {
    MyUserRole findByRole(String role);

}
