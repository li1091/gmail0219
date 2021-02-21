package com.mason.mailuser.controller;

import com.mason.mailuser.entity.UmsMember;
import com.mason.mailuser.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UmsMemberService memberService;

    @GetMapping("/")
    public String demo(){
        return "gmail-0219";
    }

    @GetMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return this.memberService.getAllUser();
    }
}
