package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName MyUserDetailsService
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 17:55
 * @ModifyDate 2019/8/17 17:55
 * @Version 1.0
 */
@Component
public class MyUserDetailsService implements UserDetailsService {
    @Resource
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userDao.selectById(1);

        return new org.springframework.security.core.userdetails.User(s,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
