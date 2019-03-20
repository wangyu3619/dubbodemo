package com.deepexi.hello.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deepexi.hello.domain.eo.User;
import com.deepexi.hello.extension.AppRuntimeEnv;
import com.deepexi.hello.mapper.ProductMapper;
import com.deepexi.hello.mapper.UserMapper;
import com.deepexi.hello.service.UserService;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyu
 * 2019/03/19 17:38
 */
@Component
@Service(version = "${demo.service.version}")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public PageBean getUserList(Integer page, Integer size, Integer age) {
        PageHelper.startPage(page, size);
        List<User> userList = userMapper.selectPageVo(age);
        return new PageBean<>(userList);
    }
}
