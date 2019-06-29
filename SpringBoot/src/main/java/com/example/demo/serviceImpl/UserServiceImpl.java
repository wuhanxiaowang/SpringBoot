package com.example.demo.serviceImpl;

import com.example.demo.entity.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wy
 * @since 2019-06-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
