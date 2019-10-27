package com.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UmsMember;
import com.gmall.bean.UmsMemberReceiveAddress;
import com.gmall.service.UserService;
import com.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.user.mapper.UserMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @creatdate 2019-10-06 16:11
 */
@Service
public class UseServiceImpl implements UserService {

    @Autowired
    public UserMemberMapper userMemberMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> useList = userMemberMapper.selectAll();
        return useList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUserById(String id) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(id);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
