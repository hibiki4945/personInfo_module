package com.example.person_info_module.controller;

import com.example.person_info_module.entity.PersonInfo;
import com.example.person_info_module.service.ifs.PersonInfoService;
import com.example.person_info_module.vo.PersonInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private PersonInfoService personInfoService;
    
    @RequestMapping(value = "/home")
    public String home(@RequestParam(name = "name", required = false, defaultValue = "World0") String name, Model model) {
        PersonInfo personInfo = new PersonInfo(0, "demo_name", "demo_name_katagana", "demo_name_roma", "demo_kokuseki", "demo_gender", "1999-01-01", 0, "1999-01-01", "1999-01-01", "demo_phone", "demo_cell_phone", "demo_company_email", "demo_other_email", "demo_post_number", "demo_address", "demo_passport_number", "1999-01-01", "demo_stay_card_number", "1999-01-01", "1999-01-01", "1", "demo_security_number", "demo_year_money_number", "demo_bank_name", "demo_branch_name", "demo_bank_account");
        PersonInfoResponse res = personInfoService.addInfo(personInfo);
        model.addAttribute("res", res.getPersonInfoList());
        return "home";
    }

    @GetMapping("/add")
    public String add(Model model) {
        PersonInfo personInfo = new PersonInfo();
        model.addAttribute("personInfo", personInfo);
        model.addAttribute("error", "");
        return "add";
    }
    
    @PostMapping("/add")
    public String addDone(@ModelAttribute("personInfo") PersonInfo personInfo, Model model) {
//        ?
        System.out.println("123");
        System.out.println(personInfo);
//        List<PersonInfo> personInfoList = new ArrayList<PersonInfo>(Arrays.asList(personInfo));
        PersonInfoResponse res = personInfoService.addInfo(personInfo);
        if(res.getCode() != "200") {
            System.out.println(res.getMessage());
            model.addAttribute("error", res.getMessage());
            return "add";
        }
        return "add_done";
    }

    @GetMapping("/update_select")
    public String changeSelect(Model model) {
        PersonInfo personInfo = new PersonInfo();
        model.addAttribute("personInfo", personInfo);
        model.addAttribute("error", "");
        return "update_select";
    }
    
    private int selectInfoNum; 
    
    @PostMapping("/update_select")
    public String updateSelect(@ModelAttribute("personInfo") PersonInfo personInfo, Model model) {
        System.out.println(personInfo);
        selectInfoNum = personInfo.getMyNumber();
        PersonInfoResponse res = personInfoService.selectInfo(personInfo.getMyNumber());
        for (PersonInfo item : res.getPersonInfoList()) {
            personInfo = item;    
        }
        System.out.println(personInfo);
        model.addAttribute("personInfo", personInfo);
        if(res.getCode() != "200") {
            model.addAttribute("error", res.getMessage());
            return "update_select";
        }
        return "update";
    }

    @GetMapping("/update")
    public String update(Model model) {
//        PersonInfo personInfo = new PersonInfo();
//        model.addAttribute("personInfo", personInfo);
        model.addAttribute("error", "");
        return "update";
    }
    
    @PostMapping("/update")
    public String change(@ModelAttribute("personInfo") PersonInfo personInfo, Model model) {
        System.out.println(personInfo);
        personInfo.setMyNumber(selectInfoNum);
        System.out.println(personInfo);
//        List<PersonInfo> personInfoList = new ArrayList<PersonInfo>(Arrays.asList(personInfo));
        PersonInfoResponse res = personInfoService.changeInfo(personInfo);
        if(res.getCode() != "200") {
            model.addAttribute("error", res.getMessage());
            return "update";
        }
        return "update_done";
    }

    @GetMapping("/delete_select")
    public String delete(Model model) {
        PersonInfo personInfo = new PersonInfo();
        model.addAttribute("personInfo", personInfo);
        model.addAttribute("error", "");
        return "delete_select";
    }
    
    @PostMapping("/delete_select")
    public String delete(@ModelAttribute("personInfo") PersonInfo personInfo, Model model) {
        System.out.println(personInfo);
        PersonInfoResponse res = personInfoService.deleteInfo(personInfo.getMyNumber());
        if(res.getCode() != "200") {
            model.addAttribute("error", res.getMessage());
            return "delete_select";
        }
        return "delete_done";
    }
    
}
