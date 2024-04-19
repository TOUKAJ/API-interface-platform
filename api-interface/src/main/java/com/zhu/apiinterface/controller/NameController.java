package com.zhu.apiinterface.controller;
import com.zhu.apiclientsdk.model.User;
import com.zhu.apiinterface.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//模拟接口，不具有实际意义
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "Get " + name;
    }

    @PostMapping("/post")
    public  String getNameByPost(String name){
        return "POST "+name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user){
        return user.getName();
    }
}
