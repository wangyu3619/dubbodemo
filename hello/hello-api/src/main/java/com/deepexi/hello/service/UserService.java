package com.deepexi.hello.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.deepexi.hello.domain.eo.User;
import com.deepexi.util.pageHelper.PageBean;

/**
 * @author wangyu
 * 2019/03/19 17:36
 */
public interface UserService extends IService<User> {
    /**
     * @param page 分页页码
     * @param size 分页大小
     * @param age 筛选条件
     * @return
     */
    PageBean getUserList(Integer page,Integer size,Integer age);
}
