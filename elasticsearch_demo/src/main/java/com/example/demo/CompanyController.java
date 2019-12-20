package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.jpa.ComRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
    @Autowired
    private CompanyESRepository companyESRepository;
    @Autowired
    private ComRepository comRepository;

    @GetMapping("/get")
    public String get(){
        Iterable<Company> companies = companyESRepository.findAll();
        System.out.println(companies);
        return JSON.toJSONString("==");
    }

    //使用@RequestBody获取asiox传递的参数，否则接受不到
    @CrossOrigin
    @PostMapping("/api/login")
    public String login(@RequestBody User user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return JSON.toJSONString("200");
    }

    @GetMapping("/save")
    public String save(){
        companyESRepository.saveAll(comRepository.findAll());
        return "成功";
    }
}
