package com.nokhrin.springtestproj.service;
/*
import com.nokhrin.springtestproj.model.MyUser;
import com.nokhrin.springtestproj.model.MyUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("myAppUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    MyUserService myUserService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        MyUser myUser = myUserService.getByEmail(email);
        List<GrantedAuthority> grantedAuthorities = buildUserAuthority(myUser.getAppUserRole());
        return buildUserForAuthentication(myUser,grantedAuthorities);
    }


    private User buildUserForAuthentication(MyUser myUser, List<GrantedAuthority> authorities){
        return new User(myUser.getEmail(), myUser.getPassword(), true, true,true,true,authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<MyUserRole> appUserRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
        // Build user's authorities
        for (MyUserRole appUserRole : appUserRoles) {
            setAuths.add(new SimpleGrantedAuthority(appUserRole.getRole()));
        }
        List<GrantedAuthority> result = new ArrayList<GrantedAuthority>(setAuths);
        return result;
    }
}
*/