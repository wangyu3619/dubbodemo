package com.deepexi.hello.controller;

import cn.hutool.core.bean.BeanUtil;
import com.deepexi.hello.domain.eo.User;
import com.deepexi.hello.service.UserService;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import io.swagger.annotations.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ws.rs.*;

/**
 * @author wangyu
 * 2019/03/19 17:40
 */
@Service
@Path("/api/v1/user")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Api("用户相关api")
public class UserController {

    @Resource
    private UserService userService;

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    @ApiOperation("根据Id获取用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "id", dataType = "int", required = false, value = "id", defaultValue = "1")
    })
    public Payload getItem(@PathParam("id") String id) {
        return new Payload(userService.getById(id));
    }

    @GET
    @Path("/page/{page}/{size}/{age}")
    @ApiOperation("按年龄筛选，分页获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "id", dataType = "int", required = false, value = "第几页", defaultValue = "1"),
            @ApiImplicitParam(paramType = "path", name = "size", dataType = "int", required = false, value = "每页数据条数", defaultValue = "10"),
            @ApiImplicitParam(paramType = "path", name = "age", dataType = "int", required = false, value = "年龄", defaultValue = "0"),
    })
    @ApiResponses({@ApiResponse(code = 400, message = "请求参数没填好")})
    public Payload getUserList(@PathParam("page") @DefaultValue("1") Integer page,
                               @PathParam("size") @DefaultValue("10") Integer size,
                               @PathParam("age") @DefaultValue("0") Integer age) {
        return new Payload(userService.getUserList(page, size, age));
    }

    @POST
    @Path("/")
    public Payload createItem(User user) {
        User userBuff = new User();
        BeanUtil.copyProperties(user, userBuff);
        return userService.save(userBuff) ? new Payload(userBuff) : new Payload(null);
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload updateProductById(@PathParam("id") String id, User user) {
        User userTarget = userService.getById(id);
        if (userTarget == null) {
            return new Payload(null);
        }
        user.setId(id);
        userService.save(user);
        return new Payload(user);
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload deleteProductById(@PathParam("id") String id) {
        return new Payload(userService.removeById(id));
    }
}
