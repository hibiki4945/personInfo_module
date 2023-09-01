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
import java.util.Optional;

@Service
public class PersonInfoServiceImpl implements PersonInfoService{

    @Autowired
    private PersonInfoDao personInfoDao;
    
    @Override
    public PersonInfoResponse addInfo(PersonInfo personInfo) {
        // TODO Auto-generated method stub
        String regexp = "[\\d]{4}-[\\d]{2}-[\\d]{2}";
        List<PersonInfo> personInfoList0 = new ArrayList<>(Arrays.asList(personInfo));
        List<PersonInfo> personInfoList = new ArrayList<>(Arrays.asList(personInfo));
        if(personInfo.getName().isBlank()) {
            return new PersonInfoResponse(RtnCode.NAME_BLANK_ERROR.getCode(), RtnCode.NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getNameKatagana().isBlank()) {
            return new PersonInfoResponse(RtnCode.NAME_KATAGANA_BLANK_ERROR.getCode(), RtnCode.NAME_KATAGANA_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getNameRoma().isBlank()) {
            return new PersonInfoResponse(RtnCode.NAME_ROMA_BLANK_ERROR.getCode(), RtnCode.NAME_ROMA_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getKokuseki().isBlank()) {
            return new PersonInfoResponse(RtnCode.KOKUSEKI_BLANK_ERROR.getCode(), RtnCode.KOKUSEKI_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getGender().isBlank()) {
            return new PersonInfoResponse(RtnCode.GENDER_BLANK_ERROR.getCode(), RtnCode.GENDER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBirthday().isBlank()) {
            return new PersonInfoResponse(RtnCode.BIRTHDAY_BLANK_ERROR.getCode(), RtnCode.BIRTHDAY_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getBirthday().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.BIRTHDAY_FORMAT_ERROR.getCode(), RtnCode.BIRTHDAY_FORMAT_ERROR.getMessage(), personInfoList0);
        }
//        if(personInfo.getAge().isBlank()) {
//            return new PersonInfoResponse(RtnCode.DATA_ERROR.getCode(), RtnCode.DATA_ERROR.getMessage(), personInfoList0);
//        }
        if(personInfo.getCompanyIn().isBlank()) {
            return new PersonInfoResponse(RtnCode.COMPANY_IN_BLANK_ERROR.getCode(), RtnCode.COMPANY_IN_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getCompanyIn().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.COMPANY_IN_FORMAT_ERROR.getCode(), RtnCode.COMPANY_IN_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getCompanyOut().isBlank()) {
            return new PersonInfoResponse(RtnCode.COMPANY_OUT_BLANK_ERROR.getCode(), RtnCode.COMPANY_OUT_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getCompanyOut().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.COMPANY_OUT_FORMAT_ERROR.getCode(), RtnCode.COMPANY_OUT_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPhone().isBlank()) {
            return new PersonInfoResponse(RtnCode.PHONE_BLANK_ERROR.getCode(), RtnCode.PHONE_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getCellPhone().isBlank()) {
            return new PersonInfoResponse(RtnCode.CELL_PHONE_BLANK_ERROR.getCode(), RtnCode.CELL_PHONE_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getCompanyEmail().isBlank()) {
            return new PersonInfoResponse(RtnCode.COMPANY_EMAIL_BLANK_ERROR.getCode(), RtnCode.COMPANY_EMAIL_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getOtherEmail().isBlank()) {
            return new PersonInfoResponse(RtnCode.OTHER_EMAIL_BLANK_ERROR.getCode(), RtnCode.OTHER_EMAIL_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPostNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.POST_NUMBER_BLANK_ERROR.getCode(), RtnCode.POST_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getAddress().isBlank()) {
            return new PersonInfoResponse(RtnCode.ADDRESS_BLANK_ERROR.getCode(), RtnCode.ADDRESS_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPassportNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getCode(), RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPassportDeadline().isBlank()) {
            return new PersonInfoResponse(RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getCode(), RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getPassportDeadline().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.PASSPORT_DEADLINE_FORMAT_ERROR.getCode(), RtnCode.PASSPORT_DEADLINE_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayCardNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getCode(), RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayCardStart().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_START_BLANK_ERROR.getCode(), RtnCode.STAY_CARD_START_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getStayCardStart().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_START_FORMAT_ERROR.getCode(), RtnCode.STAY_CARD_START_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayCardEnd().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_END_BLANK_ERROR.getCode(), RtnCode.STAY_CARD_END_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getStayCardEnd().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_END_FORMAT_ERROR.getCode(), RtnCode.STAY_CARD_END_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayQualification().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getCode(), RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getMessage(), personInfoList0);
        }
//        if(!(personInfo.getStayQualification().matches("0") || personInfo.getStayQualification().matches("1"))) {
//            return new PersonInfoResponse(RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getCode(), RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getMessage(), personInfoList0);
//        }
        if(!(personInfo.getStayQualification().matches("0") || personInfo.getStayQualification().matches("1"))) {
            return new PersonInfoResponse(RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getCode(), RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getSecurityNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.SECURITY_NUMBER_BLANK_ERROR.getCode(), RtnCode.SECURITY_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getYearMoneyNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getCode(), RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBankName().isBlank()) {
            return new PersonInfoResponse(RtnCode.BANK_NAME_BLANK_ERROR.getCode(), RtnCode.BANK_NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBranchName().isBlank()) {
            return new PersonInfoResponse(RtnCode.BRANCH_NAME_BLANK_ERROR.getCode(), RtnCode.BRANCH_NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBankAccountName().isBlank()) {
            return new PersonInfoResponse(RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getCode(), RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        
        personInfoDao.save(personInfo);
        
        return new PersonInfoResponse(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage(), personInfoList);
    }

    @Override
    public PersonInfoResponse changeInfo(PersonInfo personInfo) {
        // TODO Auto-generated method stub
        String regexp = "[\\d]{4}-[\\d]{2}-[\\d]{2}";
        List<PersonInfo> personInfoList0 = new ArrayList<>(Arrays.asList(personInfo));
        List<PersonInfo> personInfoList = new ArrayList<>(Arrays.asList(personInfo));
        if(personInfo.getName().isBlank()) {
            return new PersonInfoResponse(RtnCode.NAME_BLANK_ERROR.getCode(), RtnCode.NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getNameKatagana().isBlank()) {
            return new PersonInfoResponse(RtnCode.NAME_KATAGANA_BLANK_ERROR.getCode(), RtnCode.NAME_KATAGANA_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getNameRoma().isBlank()) {
            return new PersonInfoResponse(RtnCode.NAME_ROMA_BLANK_ERROR.getCode(), RtnCode.NAME_ROMA_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getKokuseki().isBlank()) {
            return new PersonInfoResponse(RtnCode.KOKUSEKI_BLANK_ERROR.getCode(), RtnCode.KOKUSEKI_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getGender().isBlank()) {
            return new PersonInfoResponse(RtnCode.GENDER_BLANK_ERROR.getCode(), RtnCode.GENDER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBirthday().isBlank()) {
            return new PersonInfoResponse(RtnCode.BIRTHDAY_BLANK_ERROR.getCode(), RtnCode.BIRTHDAY_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getBirthday().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.BIRTHDAY_FORMAT_ERROR.getCode(), RtnCode.BIRTHDAY_FORMAT_ERROR.getMessage(), personInfoList0);
        }
//        if(personInfo.getAge().isBlank()) {
//            return new PersonInfoResponse(RtnCode.DATA_ERROR.getCode(), RtnCode.DATA_ERROR.getMessage(), personInfoList0);
//        }
        if(personInfo.getCompanyIn().isBlank()) {
            return new PersonInfoResponse(RtnCode.COMPANY_IN_BLANK_ERROR.getCode(), RtnCode.COMPANY_IN_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getCompanyIn().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.COMPANY_IN_FORMAT_ERROR.getCode(), RtnCode.COMPANY_IN_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getCompanyOut().isBlank()) {
            return new PersonInfoResponse(RtnCode.COMPANY_OUT_BLANK_ERROR.getCode(), RtnCode.COMPANY_OUT_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getCompanyOut().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.COMPANY_OUT_FORMAT_ERROR.getCode(), RtnCode.COMPANY_OUT_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPhone().isBlank()) {
            return new PersonInfoResponse(RtnCode.PHONE_BLANK_ERROR.getCode(), RtnCode.PHONE_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getCellPhone().isBlank()) {
            return new PersonInfoResponse(RtnCode.CELL_PHONE_BLANK_ERROR.getCode(), RtnCode.CELL_PHONE_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getCompanyEmail().isBlank()) {
            return new PersonInfoResponse(RtnCode.COMPANY_EMAIL_BLANK_ERROR.getCode(), RtnCode.COMPANY_EMAIL_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getOtherEmail().isBlank()) {
            return new PersonInfoResponse(RtnCode.OTHER_EMAIL_BLANK_ERROR.getCode(), RtnCode.OTHER_EMAIL_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPostNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.POST_NUMBER_BLANK_ERROR.getCode(), RtnCode.POST_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getAddress().isBlank()) {
            return new PersonInfoResponse(RtnCode.ADDRESS_BLANK_ERROR.getCode(), RtnCode.ADDRESS_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPassportNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getCode(), RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getPassportDeadline().isBlank()) {
            return new PersonInfoResponse(RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getCode(), RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getPassportDeadline().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.PASSPORT_DEADLINE_FORMAT_ERROR.getCode(), RtnCode.PASSPORT_DEADLINE_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayCardNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getCode(), RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayCardStart().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_START_BLANK_ERROR.getCode(), RtnCode.STAY_CARD_START_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getStayCardStart().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_START_FORMAT_ERROR.getCode(), RtnCode.STAY_CARD_START_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayCardEnd().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_END_BLANK_ERROR.getCode(), RtnCode.STAY_CARD_END_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(!personInfo.getStayCardEnd().matches(regexp)) {
            return new PersonInfoResponse(RtnCode.STAY_CARD_END_FORMAT_ERROR.getCode(), RtnCode.STAY_CARD_END_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getStayQualification().isBlank()) {
            return new PersonInfoResponse(RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getCode(), RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getMessage(), personInfoList0);
        }
//        if(!(personInfo.getStayQualification().matches("0") || personInfo.getStayQualification().matches("1"))) {
//            return new PersonInfoResponse(RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getCode(), RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getMessage(), personInfoList0);
//        }
        if(!(personInfo.getStayQualification().matches("0") || personInfo.getStayQualification().matches("1"))) {
            return new PersonInfoResponse(RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getCode(), RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getSecurityNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.SECURITY_NUMBER_BLANK_ERROR.getCode(), RtnCode.SECURITY_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getYearMoneyNumber().isBlank()) {
            return new PersonInfoResponse(RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getCode(), RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBankName().isBlank()) {
            return new PersonInfoResponse(RtnCode.BANK_NAME_BLANK_ERROR.getCode(), RtnCode.BANK_NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBranchName().isBlank()) {
            return new PersonInfoResponse(RtnCode.BRANCH_NAME_BLANK_ERROR.getCode(), RtnCode.BRANCH_NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        if(personInfo.getBankAccountName().isBlank()) {
            return new PersonInfoResponse(RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getCode(), RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getMessage(), personInfoList0);
        }
        
//        System.out.println(personInfo.getMyNumber());   
        personInfoDao.updateInfo(personInfo.getMyNumber(), personInfo.getName(), personInfo.getNameKatagana(), personInfo.getNameRoma(), personInfo.getKokuseki(), personInfo.getGender(), personInfo.getBirthday(), personInfo.getAge(), personInfo.getCompanyIn(), personInfo.getCompanyOut(), personInfo.getPhone(), personInfo.getCellPhone(), personInfo.getCompanyEmail(), personInfo.getOtherEmail(), personInfo.getPostNumber(), personInfo.getAddress(), personInfo.getPassportNumber(), personInfo.getPassportDeadline(), personInfo.getStayCardNumber(), personInfo.getStayCardStart(), personInfo.getStayCardEnd(), personInfo.getStayQualification(), personInfo.getSecurityNumber(), personInfo.getYearMoneyNumber(), personInfo.getBankName(), personInfo.getBranchName(), personInfo.getBankAccountName());
        
        return new PersonInfoResponse(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage(), personInfoList);
        
    }

    @Override
    public PersonInfoResponse selectInfo(int myNumber) {
        // TODO Auto-generated method stub

            List<PersonInfo> personInfoList = new ArrayList<PersonInfo>();
//          check : not existById()
            if(!personInfoDao.existsById(myNumber)) {
                return new PersonInfoResponse(RtnCode.DATA_NO_FOUND_ERROR.getCode(), RtnCode.DATA_NO_FOUND_ERROR.getMessage(), personInfoList);   
            }

            Optional<PersonInfo> res = personInfoDao.findById(myNumber);
            PersonInfo personInfo = res.get();
            personInfoList.add(personInfo);
            return new PersonInfoResponse(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage(), personInfoList);    
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
