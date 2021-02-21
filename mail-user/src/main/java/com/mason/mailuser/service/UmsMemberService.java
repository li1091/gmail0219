package com.mason.mailuser.service;



import com.mason.mailuser.entity.UmsMember;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2021-02-20
 */
public interface UmsMemberService extends IService<UmsMember> {

    List<UmsMember> getAllUser();

}
