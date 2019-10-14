package com.gmall.user.mapper;

import com.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

public interface UserMemberMapper extends Mapper<UmsMember> {

    UmsMember getFirstUser();
}
