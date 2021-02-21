package com.mason.mailuser.service.impl;


import com.mason.mailuser.entity.UmsMember;
import com.mason.mailuser.mapper.UmsMemberMapper;
import com.mason.mailuser.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2021-02-20
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {
    @Autowired
    private UmsMemberMapper memberMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> list = this.memberMapper.selectList(null);
        return list;
    }
}
