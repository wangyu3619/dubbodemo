package com.deepexi.hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.hello.domain.eo.Product;
import com.deepexi.hello.domain.eo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangyu
 * 2019/03/19 17:39
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 分页查询
     *
     * @param age 年龄筛选条件
     * @return
     */
    List<User> selectPageVo(@Param("age") Integer age);
}
