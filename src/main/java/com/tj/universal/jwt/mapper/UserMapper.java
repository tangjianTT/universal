package com.tj.universal.jwt.mapper;

import com.tj.universal.jwt.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author TJ
 * @description TODO
 * @date 2020/12/25 9:56
 **/
@Mapper
public interface UserMapper {


    SysUser getUserInfoByLoginName(String account);

}
