package com.zyk.web.controller.login;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyk.common.login.LoginService;
import com.zyk.module.LoginUserDTO;
import com.zyk.web.base.BaseController;
import com.zyk.web.base.Result;
import com.zyk.web.util.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 登陆Controller
 *
 * @author zhouyuankai
 */

@Api(tags = "登陆管理")
@RequestMapping("/sys/loginManage")
@RestController
public class LoginController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @Reference
    private LoginService loginService;

    @ApiOperation("用户登陆")
    @ApiImplicitParam(name = "loginUser", value = "登陆用户实体", required = true, paramType = "LoginUserDTO")
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Result queryOne(@Valid @RequestBody LoginUserDTO loginUser){
        log.info("queryOne method!");
        log.info("----"+loginUser.getUserName()+" || "+loginUser.getPassWord()+" || "+loginUser.getCode());
        loginService.loginMethod(loginUser.getUserName(),loginUser.getPassWord());
        return Results.successWithData("");
    }

}
