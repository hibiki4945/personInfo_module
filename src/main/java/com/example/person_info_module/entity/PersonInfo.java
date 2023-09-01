package com.example.person_info_module.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonInfo {

    @Id
    @Column(name = "my_number")
    private int myNumber;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "name_katagana")
    private String nameKatagana;
    
    @Column(name = "name_roma")
    private String nameRoma;
    
    @Column(name = "kokuseki")
    private String kokuseki;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "birthday")
    private String birthday;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "company_in")
    private String companyIn;
    
    @Column(name = "company_out")
    private String companyOut;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "cell_phone")
    private String cellPhone;
    
    @Column(name = "company_email")
    private String companyEmail;
    
    @Column(name = "other_email")
    private String otherEmail;
    
    @Column(name = "post_number")
    private String postNumber;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "passport_number")
    private String passportNumber;
    
    @Column(name = "passport_deadline")
    private String passportDeadline;
    
    @Column(name = "stay_card_number")
    private String stayCardNumber;
    
    @Column(name = "stay_card_start")
    private String stayCardStart;
    
    @Column(name = "stay_card_end")
    private String stayCardEnd;
    
    @Column(name = "stay_qualification")
    private String stayQualification;
    
    @Column(name = "security_number")
    private String securityNumber;
    
    @Column(name = "year_money_number")
    private String yearMoneyNumber;

    @Column(name = "bank_name")
    private String bankName;
    
    @Column(name = "branch_name")
    private String branchName;
    
    @Column(name = "bank_account_name")
    private String bankAccountName;

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameKatagana() {
        return nameKatagana;
    }

    public void setNameKatagana(String nameKatagana) {
        this.nameKatagana = nameKatagana;
    }

    public String getNameRoma() {
        return nameRoma;
    }

    public void setNameRoma(String nameRoma) {
        this.nameRoma = nameRoma;
    }

    public String getKokuseki() {
        return kokuseki;
    }

    public void setKokuseki(String kokuseki) {
        this.kokuseki = kokuseki;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyIn() {
        return companyIn;
    }

    public void setCompanyIn(String companyIn) {
        this.companyIn = companyIn;
    }

    public String getCompanyOut() {
        return companyOut;
    }

    public void setCompanyOut(String companyOut) {
        this.companyOut = companyOut;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getOtherEmail() {
        return otherEmail;
    }

    public void setOtherEmail(String otherEmail) {
        this.otherEmail = otherEmail;
    }

    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportDeadline() {
        return passportDeadline;
    }

    public void setPassportDeadline(String passportDeadline) {
        this.passportDeadline = passportDeadline;
    }

    public String getStayCardNumber() {
        return stayCardNumber;
    }

    public void setStayCardNumber(String stayCardNumber) {
        this.stayCardNumber = stayCardNumber;
    }

    public String getStayCardStart() {
        return stayCardStart;
    }

    public void setStayCardStart(String stayCardStart) {
        this.stayCardStart = stayCardStart;
    }

    public String getStayCardEnd() {
        return stayCardEnd;
    }

    public void setStayCardEnd(String stayCardEnd) {
        this.stayCardEnd = stayCardEnd;
    }

    public String getStayQualification() {
        return stayQualification;
    }

    public void setStayQualification(String stayQualification) {
        this.stayQualification = stayQualification;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getYearMoneyNumber() {
        return yearMoneyNumber;
    }

    public void setYearMoneyNumber(String yearMoneyNumber) {
        this.yearMoneyNumber = yearMoneyNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public PersonInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PersonInfo(int myNumber, String name, String nameKatagana, String nameRoma, String kokuseki, String gender, String birthday, int age, String companyIn,
            String companyOut, String phone, String cellPhone, String companyEmail, String otherEmail, String postNumber, String address, String passportNumber,
            String passportDeadline, String stayCardNumber, String stayCardStart, String stayCardEnd, String stayQualification, String securityNumber, String yearMoneyNumber,
            String bankName, String branchName, String bankAccountName) {
        super();
        this.myNumber = myNumber;
        this.name = name;
        this.nameKatagana = nameKatagana;
        this.nameRoma = nameRoma;
        this.kokuseki = kokuseki;
        this.gender = gender;
        this.birthday = birthday;
        this.age = age;
        this.companyIn = companyIn;
        this.companyOut = companyOut;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.companyEmail = companyEmail;
        this.otherEmail = otherEmail;
        this.postNumber = postNumber;
        this.address = address;
        this.passportNumber = passportNumber;
        this.passportDeadline = passportDeadline;
        this.stayCardNumber = stayCardNumber;
        this.stayCardStart = stayCardStart;
        this.stayCardEnd = stayCardEnd;
        this.stayQualification = stayQualification;
        this.securityNumber = securityNumber;
        this.yearMoneyNumber = yearMoneyNumber;
        this.bankName = bankName;
        this.branchName = branchName;
        this.bankAccountName = bankAccountName;
    }

    @Override
    public String toString() {
        return "PersonInfo [myNumber=" + myNumber + ", name=" + name + ", nameKatagana=" + nameKatagana + ", nameRoma=" + nameRoma + ", kokuseki=" + kokuseki + ", gender=" + gender
               + ", birthday=" + birthday + ", age=" + age + ", companyIn=" + companyIn + ", companyOut=" + companyOut + ", phone=" + phone + ", cellPhone=" + cellPhone
               + ", companyEmail=" + companyEmail + ", otherEmail=" + otherEmail + ", postNumber=" + postNumber + ", address=" + address + ", passportNumber=" + passportNumber
               + ", passportDeadline=" + passportDeadline + ", stayCardNumber=" + stayCardNumber + ", stayCardStart=" + stayCardStart + ", stayCardEnd=" + stayCardEnd
               + ", stayQualification=" + stayQualification + ", securityNumber=" + securityNumber + ", yearMoneyNumber=" + yearMoneyNumber + ", bankName=" + bankName
               + ", branchName=" + branchName + ", bankAccountName=" + bankAccountName + "]";
    }
    
}