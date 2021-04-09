package com.tj.universal.jwt.controller;

import com.tj.universal.entity.ResultDto;
import com.tj.universal.jwt.entity.SysUser;
import com.tj.universal.jwt.service.UserService;
import com.tj.universal.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author TJ
 * @description TODO
 * @date 2020/11/30 19:08
 **/

@RestController
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private UserService userService;

    /**
     * 方法名：作用：登陆校验密码
     * 输入 username password  用户名，密码
     * 输出：code: 状态码   1 为认证成功 0 为用户不存在 -1 为密码不一致 -2 表示程序错误
     *       success:  true or false 执行成功或失败
     *       result：只在认证成功时返回，包含用户的全部信息
     *       messsage:
     *
     *
     */
    @PostMapping(value = "/account")
    public ResultDto toLogin(@RequestBody SysUser user) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        try {
            // 根据账号查询到用户密码
            SysUser sysUser = userService.getUserInfoByLoginName(user.getAccount());
            if (sysUser != null) {
                String dbPassWord = user.getPassword();
                // 对比密码
                if (bCryptPasswordEncoder.matches(dbPassWord,sysUser.getPassword())) {
                    //创建token
                    if (user.getPassword().equals(dbPassWord)) {
                        String token = JwtUtil.generateToken(user.getAccount());
                        // 获取相应权限
                        Map<String,String> map = new HashMap<>();
                        map.put("token",token);
                        // 此处分为预约人和审批人，审批人用openId，预约人用账号
                        return ResultDto.success(map);
                    } else {
                        return ResultDto.fail("登陆失败,密码错误");
                    }
                } else {
                    return ResultDto.fail("登陆失败,密码错误");
                }
            } else {
                return ResultDto.fail("账号不存在/无效账号");
            }
        } catch (Exception e) {
            return ResultDto.fail("未知错误");
        }
    }


    @PostMapping(value = "/test")
    public ResultDto test() {
        return ResultDto.success("测试");
    }


}
