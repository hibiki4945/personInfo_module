package com.example.person_info_module;

import com.example.person_info_module.constants.RtnCode;
import com.example.person_info_module.entity.PersonInfo;
import com.example.person_info_module.service.ifs.PersonInfoService;
import com.example.person_info_module.vo.PersonInfoResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class PersonInfoServiceTests {

    @Autowired
    private PersonInfoService personInfoService;
    
//    @Test
//    public void addInfoTest() {
//        
//        PersonInfo personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 0, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
//        personInfoService.addInfo(personInfo);
//        
//    }
    

    @Test
    public void addInfoTest() {
        String regexp = "[\\d]{4}-[\\d]{2}-[\\d]{2}";
        PersonInfo personInfo = null;
        PersonInfoResponse res = null;
//      personInfo == null
        personInfo = null;
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.DATA_ERROR.getMessage()), "Failed!");

//      Name().isBlank()
        personInfo = new PersonInfo(0, null, "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_BLANK_ERROR.getMessage()), "Failed!");

//      Name().isBlank()
        personInfo = new PersonInfo(0, " ", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_BLANK_ERROR.getMessage()), "Failed!");

//      NameKatagana().isBlank()
        personInfo = new PersonInfo(0, "demo_name", null, "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_KATAGANA_BLANK_ERROR.getMessage()), "Failed!");

//      NameKatagana().isBlank()
        personInfo = new PersonInfo(0, "demo_name", " ", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_KATAGANA_BLANK_ERROR.getMessage()), "Failed!");

//      NameRoma().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", null, "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_ROMA_BLANK_ERROR.getMessage()), "Failed!");

//      NameRoma().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", " ", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_ROMA_BLANK_ERROR.getMessage()), "Failed!");

//      Kokuseki().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", null, "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.KOKUSEKI_BLANK_ERROR.getMessage()), "Failed!");

//      Kokuseki().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", " ", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.KOKUSEKI_BLANK_ERROR.getMessage()), "Failed!");

//      Gender().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", null, "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.GENDER_BLANK_ERROR.getMessage()), "Failed!");

//      Gender().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", " ", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.GENDER_BLANK_ERROR.getMessage()), "Failed!");

//      Birthday().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", null, 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BIRTHDAY_BLANK_ERROR.getMessage()), "Failed!");

//      Birthday().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", " ", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BIRTHDAY_BLANK_ERROR.getMessage()), "Failed!");

//      !Birthday().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-010", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BIRTHDAY_FORMAT_ERROR.getMessage()), "Failed!");

//      Age() < 20
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 19, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.AGE_TOO_SAMLL_ERROR.getMessage()), "Failed!");

//      CompanyIn().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, null, "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_IN_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyIn().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, " ", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_IN_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyIn().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-010", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_IN_FORMAT_ERROR.getMessage()), "Failed!");

//      CompanyOut().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", null, "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_OUT_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyOut().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", " ", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_OUT_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyOut().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-010", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_OUT_FORMAT_ERROR.getMessage()), "Failed!");

//      Phone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", null, "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      Phone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", " ", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      CellPhone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", null, "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.CELL_PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      CellPhone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", " ", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.CELL_PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", null, "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", " ", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      OtherEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", null, "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.OTHER_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      OtherEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", " ", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.OTHER_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      PostNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", null, "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.POST_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      PostNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", " ", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.POST_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      Address().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", null, "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.ADDRESS_BLANK_ERROR.getMessage()), "Failed!");

//      Address().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", " ", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.ADDRESS_BLANK_ERROR.getMessage()), "Failed!");

//      PassportNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", null, "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      PassportNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", " ", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      PassportDeadline().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", null, "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getMessage()), "Failed!");

//      PassportDeadline().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", " ", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getMessage()), "Failed!");

//      PassportDeadline().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-010", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_DEADLINE_FORMAT_ERROR.getMessage()), "Failed!");

//      StayCardNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", null, "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", " ", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardStart().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", null, "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_START_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardStart().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", " ", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_START_BLANK_ERROR.getMessage()), "Failed!");

//      !StayCardStart().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-010", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_START_FORMAT_ERROR.getMessage()), "Failed!");

//      StayCardEnd().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", null, "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_END_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardEnd().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", " ", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_END_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardEnd().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-010", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_END_FORMAT_ERROR.getMessage()), "Failed!");

//      StayQualification().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", null, "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getMessage()), "Failed!");

//      StayQualification().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", " ", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getMessage()), "Failed!");

//      StayQualification().matches("0") || StayQualification().matches("1"))
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "2", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getMessage()), "Failed!");

//      SecurityNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", null, "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.SECURITY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      SecurityNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", " ", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.SECURITY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      YearMoneyNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", null, "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      YearMoneyNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", " ", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      BankName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", null, "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BankName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", " ", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BranchName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", null, "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BRANCH_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BranchName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", " ", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BRANCH_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BankAccountName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", null);
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BankAccountName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", " ");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      normal
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.SUCCESSFUL.getMessage()), "Failed!");
        
    }

    @Test
    public void changeInfoTest() {
        // TODO Auto-generated method stub
        String regexp = "[\\d]{4}-[\\d]{2}-[\\d]{2}";
        PersonInfo personInfo = null;
        PersonInfoResponse res = null;
//      personInfo == null
        personInfo = null;
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.DATA_ERROR.getMessage()), "Failed!");

//      Name().isBlank()
        personInfo = new PersonInfo(0, null, "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_BLANK_ERROR.getMessage()), "Failed!");

//      Name().isBlank()
        personInfo = new PersonInfo(0, " ", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_BLANK_ERROR.getMessage()), "Failed!");

//      NameKatagana().isBlank()
        personInfo = new PersonInfo(0, "demo_name", null, "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_KATAGANA_BLANK_ERROR.getMessage()), "Failed!");

//      NameKatagana().isBlank()
        personInfo = new PersonInfo(0, "demo_name", " ", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_KATAGANA_BLANK_ERROR.getMessage()), "Failed!");

//      NameRoma().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", null, "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_ROMA_BLANK_ERROR.getMessage()), "Failed!");

//      NameRoma().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", " ", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.NAME_ROMA_BLANK_ERROR.getMessage()), "Failed!");

//      Kokuseki().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", null, "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.KOKUSEKI_BLANK_ERROR.getMessage()), "Failed!");

//      Kokuseki().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", " ", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.KOKUSEKI_BLANK_ERROR.getMessage()), "Failed!");

//      Gender().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", null, "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.GENDER_BLANK_ERROR.getMessage()), "Failed!");

//      Gender().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", " ", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.GENDER_BLANK_ERROR.getMessage()), "Failed!");

//      Birthday().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", null, 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BIRTHDAY_BLANK_ERROR.getMessage()), "Failed!");

//      Birthday().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", " ", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BIRTHDAY_BLANK_ERROR.getMessage()), "Failed!");

//      !Birthday().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-010", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BIRTHDAY_FORMAT_ERROR.getMessage()), "Failed!");

//      Age() < 20
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 19, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.AGE_TOO_SAMLL_ERROR.getMessage()), "Failed!");

//      CompanyIn().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, null, "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_IN_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyIn().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, " ", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_IN_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyIn().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-010", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_IN_FORMAT_ERROR.getMessage()), "Failed!");

//      CompanyOut().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", null, "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_OUT_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyOut().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", " ", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_OUT_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyOut().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-010", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_OUT_FORMAT_ERROR.getMessage()), "Failed!");

//      Phone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", null, "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      Phone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", " ", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      CellPhone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", null, "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.CELL_PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      CellPhone().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", " ", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.CELL_PHONE_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", null, "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      CompanyEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", " ", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.COMPANY_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      OtherEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", null, "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.OTHER_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      OtherEmail().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", " ", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.OTHER_EMAIL_BLANK_ERROR.getMessage()), "Failed!");

//      PostNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", null, "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.POST_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      PostNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", " ", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.POST_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      Address().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", null, "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.ADDRESS_BLANK_ERROR.getMessage()), "Failed!");

//      Address().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", " ", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.ADDRESS_BLANK_ERROR.getMessage()), "Failed!");

//      PassportNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", null, "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      PassportNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", " ", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      PassportDeadline().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", null, "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getMessage()), "Failed!");

//      PassportDeadline().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", " ", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_DEADLINE_BLANK_ERROR.getMessage()), "Failed!");

//      PassportDeadline().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-010", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.PASSPORT_DEADLINE_FORMAT_ERROR.getMessage()), "Failed!");

//      StayCardNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", null, "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", " ", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardStart().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", null, "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_START_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardStart().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", " ", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_START_BLANK_ERROR.getMessage()), "Failed!");

//      !StayCardStart().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-010", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_START_FORMAT_ERROR.getMessage()), "Failed!");

//      StayCardEnd().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", null, "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_END_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardEnd().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", " ", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_END_BLANK_ERROR.getMessage()), "Failed!");

//      StayCardEnd().matches(regexp)
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-010", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_CARD_END_FORMAT_ERROR.getMessage()), "Failed!");

//      StayQualification().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", null, "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getMessage()), "Failed!");

//      StayQualification().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", " ", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_QUALIFICATION_BLANK_ERROR.getMessage()), "Failed!");

//      StayQualification().matches("0") || StayQualification().matches("1"))
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "2", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.STAY_QUALIFICATION_FORMAT_ERROR.getMessage()), "Failed!");

//      SecurityNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", null, "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.SECURITY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      SecurityNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", " ", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.SECURITY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      YearMoneyNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", null, "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      YearMoneyNumber().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", " ", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.YEAR_MONEY_NUMBER_BLANK_ERROR.getMessage()), "Failed!");

//      BankName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", null, "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BankName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", " ", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BranchName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", null, "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BRANCH_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BranchName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", " ", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BRANCH_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BankAccountName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", null);
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      BankAccountName().isBlank()
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", " ");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.BANK_ACCOUNT_NAME_BLANK_ERROR.getMessage()), "Failed!");

//      exist
        personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.DATA_NO_FOUND_ERROR.getMessage()), "Failed!");
        
//      normal
        personInfo = new PersonInfo(40, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        res = personInfoService.changeInfo(personInfo);
        Assert.isTrue(res.getMessage().equals(RtnCode.SUCCESSFUL.getMessage()), "Failed!");
        
    }

    @Test
    public void selectInfoTest() {
        PersonInfoResponse res = null;
//      check : minus
        res = personInfoService.selectInfo(-1);
        Assert.isTrue(res.getMessage().equals(RtnCode.MINUS_NUMBER_ERROR.getMessage()), "Failed!(1)");
        
//      check : not existById()
        res = personInfoService.deleteInfo(1);
        res = personInfoService.selectInfo(1);
        Assert.isTrue(res.getMessage().equals(RtnCode.DATA_NO_FOUND_ERROR.getMessage()), "Failed!(2)");
        
//      normal
        PersonInfo personInfo = new PersonInfo(1, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        res = personInfoService.selectInfo(1);
        Assert.isTrue(res.getMessage().equals(RtnCode.SUCCESSFUL.getMessage()), "Failed!(3)");
        Assert.isTrue(res.getPersonInfoList().size() == 1, "Failed!(4)");
        
    }

    @Test
    public void searchInfoContainingTest() {

        PersonInfoResponse res = null;
//      columnSelect1.isBlank()
        res = personInfoService.searchInfoContaining(null, "demo");
        Assert.isTrue(res.getMessage().equals(RtnCode.COLUMN_SELECT1_BLANK_ERROR.getMessage()), "Failed!(1)"+res.getMessage());

//      columnSelect1.isBlank()
        res = personInfoService.searchInfoContaining(" ", "demo");
        Assert.isTrue(res.getMessage().equals(RtnCode.COLUMN_SELECT1_BLANK_ERROR.getMessage()), "Failed!(2)"+res.getMessage());

//      str1.isBlank()
        res = personInfoService.searchInfoContaining("姓名", null);
        Assert.isTrue(res.getMessage().equals(RtnCode.STR1_BLANK_ERROR.getMessage()), "Failed!(3)"+res.getMessage());

//      str1.isBlank()
        res = personInfoService.searchInfoContaining("姓名", " ");
        Assert.isTrue(res.getMessage().equals(RtnCode.STR1_BLANK_ERROR.getMessage()), "Failed!(4)"+res.getMessage());

//      columnSelect1 not exist
        res = personInfoService.searchInfoContaining("姓名0", "demo");
        Assert.isTrue(res.getMessage().equals(RtnCode.COLUMN_SELECT1_NO_FOUND_ERROR.getMessage()), "Failed!(5)"+res.getMessage());

//      normal
        res = personInfoService.searchInfoContaining("姓名", "demo");
        Assert.isTrue(res.getMessage().equals(RtnCode.SUCCESSFUL.getMessage()), "Failed!(6)"+res.getMessage());
   
    }

    @Test
    public void deleteInfoTest() {
        PersonInfoResponse res = null;
//      check : minus
        res = personInfoService.deleteInfo(-1);
        Assert.isTrue(res.getMessage().equals(RtnCode.MINUS_NUMBER_ERROR.getMessage()), "Failed!(1)"+res.getMessage());
        
//      check : not existById()
        res = personInfoService.deleteInfo(1);
        res = personInfoService.deleteInfo(1);
        Assert.isTrue(res.getMessage().equals(RtnCode.DATA_NO_FOUND_ERROR.getMessage()), "Failed!(2)"+res.getMessage());
        
//      normal
        PersonInfo personInfo = new PersonInfo(1, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 20, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        res = personInfoService.addInfo(personInfo);
        res = personInfoService.deleteInfo(1);
        res = personInfoService.selectInfo(1);
        Assert.isTrue(res.getMessage().equals(RtnCode.DATA_NO_FOUND_ERROR.getMessage()), "Failed!(3)"+res.getMessage());
        
    }
    
}




