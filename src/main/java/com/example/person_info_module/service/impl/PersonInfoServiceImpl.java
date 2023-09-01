package com.example.person_info_module.service.impl;

import com.example.person_info_module.constants.RtnCode;
import com.example.person_info_module.entity.PersonInfo;
import com.example.person_info_module.repository.PersonInfoDao;
import com.example.person_info_module.service.ifs.PersonInfoService;
import com.example.person_info_module.vo.PersonInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonInfoServiceImpl implements PersonInfoService{

    @Autowired
    private PersonInfoDao personInfoDao;
    
    @Override
    public PersonInfoResponse addInfo(PersonInfo personInfo) {
        // TODO Auto-generated method stub
        List<PersonInfo> personInfoList = new ArrayList<>(Arrays.asList(personInfo));
        personInfoDao.save(personInfo);
        
        return new PersonInfoResponse(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage(), personInfoList);
    }

    @Override
    public PersonInfoResponse changeInfo(PersonInfo personInfo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PersonInfoResponse searchInfo(int myNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PersonInfoResponse deleteInfo(int myNumber) {
        // TODO Auto-generated method stub
        return null;
    }


}
