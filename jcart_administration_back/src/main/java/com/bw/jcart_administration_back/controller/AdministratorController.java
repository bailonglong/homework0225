package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.constant.ClientExceptionConstant;
import com.bw.jcart_administration_back.dto.in.*;
import com.bw.jcart_administration_back.dto.out.AdministratorListOutDTO;
import com.bw.jcart_administration_back.dto.out.AdministratorShowOutDTO;
import com.bw.jcart_administration_back.dto.out.PageOutDTO;
import com.bw.jcart_administration_back.exception.ClientException;
import com.bw.jcart_administration_back.po.Administrator;
import com.bw.jcart_administration_back.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/administrator")
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;
    // 登录
    @GetMapping("/login")
    public String login(AdministratorLoginDTO administratorLoginDTO) throws ClientException {
        return null;
    }
    // 管理员获取Profile
    @GetMapping("/getProfile")
    public GetProfileDTO getProfile(){
        return null;
    }

    @PostMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return  null;
    }
    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResrtPwdInDTO administratorResrtPwdInDTO){}

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer page){
        return null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }
    // 创建
    @PostMapping("/create")
    public Integer create(@RequestParam AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }
    // 修改
    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }
}
