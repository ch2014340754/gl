package com.gmall.user.action;

import com.gmall.bean.UmsMember;
import com.gmall.bean.UmsMemberReceiveAddress;
import com.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @creatdate 2019-10-06 16:12
 */
@Controller
public class UserAction {

   @Autowired
    public UserService service;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
     List<UmsMember> userList =  service.getAllUser();
        return userList;
    }

    @RequestMapping("getaddressById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getaddressById( String Id){
        List<UmsMemberReceiveAddress> user = service.getUserById(Id);
        return user;
    }
}
