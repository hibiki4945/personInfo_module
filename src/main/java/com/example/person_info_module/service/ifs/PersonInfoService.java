package com.example.person_info_module.service.ifs;

import com.example.person_info_module.entity.PersonInfo;
import com.example.person_info_module.vo.PersonInfoResponse;

public interface PersonInfoService {
    
    public PersonInfoResponse addInfo(PersonInfo personInfo);
    
    public PersonInfoResponse changeInfo(PersonInfo personInfo);
    
    public PersonInfoResponse selectInfo(int myNumber);

    public PersonInfoResponse searchInfo(int myNumber);

    public PersonInfoResponse searchInfoContaining(String columnSelect1, String str1);

    public PersonInfoResponse deleteInfo(int myNumber);
    
}
