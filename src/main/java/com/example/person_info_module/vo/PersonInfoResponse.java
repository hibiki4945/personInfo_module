package com.example.person_info_module.vo;

import com.example.person_info_module.entity.PersonInfo;

import java.util.List;

public class PersonInfoResponse {

    private String code;
    
    private String message;
    
    private List<PersonInfo> personInfoList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<PersonInfo> getPersonInfoList() {
        return personInfoList;
    }

    public void setPersonInfoList(List<PersonInfo> personInfoList) {
        this.personInfoList = personInfoList;
    }

    public PersonInfoResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PersonInfoResponse(String code, String message, List<PersonInfo> personInfoList) {
        super();
        this.code = code;
        this.message = message;
        this.personInfoList = personInfoList;
    }
    
}
