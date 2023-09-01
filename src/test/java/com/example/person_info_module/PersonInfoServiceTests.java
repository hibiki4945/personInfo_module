package com.example.person_info_module;

import com.example.person_info_module.entity.PersonInfo;
import com.example.person_info_module.service.ifs.PersonInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonInfoServiceTests {

    @Autowired
    private PersonInfoService personInfoService;
    
    @Test
    public void addInfoTest() {
        
        PersonInfo personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 0, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        personInfoService.addInfo(personInfo);
        
    }
    
}




