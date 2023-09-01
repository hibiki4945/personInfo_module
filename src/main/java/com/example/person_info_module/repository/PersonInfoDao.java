package com.example.person_info_module.repository;

import com.example.person_info_module.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, Integer>{
    
//    @Modifying(clearAutomatically = true)
//    @Transactional // insert & update & delete 都需加此行
//    @Query(value = "update person_info set name = :newName, name_katagana = :newNameKatagana, name_roma = :newNameRoma, kokuseki = :newKokuseki, gender = :newGender, birthday = :newBirthday, age = :newAge, company_in = :newCompanyIn, company_out = :newCompanyOut, phone = :phone, cell_phone = :newCellPhone, company_email = :newCompanyEmail, other_email = :newOtherEmail, post_number = :newPostNumber, address = :newAddrss, passport_number = :newPassportNumber, passport_deadline = :newPassportDeadline, stay_card_number = :newStayCardNumber, stay_card_start = :newStayCardStart, stay_card_end = :newStayCardEnd, stay_card_end = :newStayCardEnd, stay_qualification = :newStayQualification, security_number = :newSecurityNumber, year_money_number = :newYearMoneyNumber, bank_name = :newBankName, branch_name = :newBranchName, bank_account_name = :newBankAccountName where my_number = :newMyNumber ", nativeQuery = true)
//    public int updateInfo(@Param("newMyNumber") int MyNumber, @Param("newName") String Name, @Param("newNameKatagana") String NameKatagana, @Param("newNameRoma") String nameRoma, @Param("newKokuseki") String kokuseki, @Param("newGender") String gender, @Param("newBirthday") String birthday, @Param("newAge") int age, @Param("newCompanyIn") String companyIn, @Param("newCompanyOut") String companyOut, @Param("newPhone") String phone, @Param("newCellPhone") String cellPhone, @Param("newCompanyEmail") String companyEmail, @Param("newOtherEmail") String otherEmail, @Param("newPostNumber") String postNumber, @Param("newAddress") String address, @Param("newPassportNumber") String passportNumber, @Param("newStayCardNumber") String stayCardNumber, @Param("newStayCardStart") String stayCardStart, @Param("newStayCardEnd") String stayCradEnd, @Param("newStayQualification") String stayQualification, @Param("newSecurityNumber") String securityNumber, @Param("newYearMoneyNumber") String yearMoneyNumber, @Param("newBankName") String bankName, @Param("newBranchName") String branchName, @Param("newBankAccountName") String bankAccountName);
    
    @Modifying(clearAutomatically = true)
    @Transactional // insert & update & delete 都需加此行
    @Query(value = "update person_info set name = :newName, name_katagana = :newNameKatagana, name_roma = :newNameRoma, kokuseki = :newKokuseki, gender = :newGender, birthday = :newBirthday, age = :newAge, company_in = :newCompanyIn, company_out = :newCompanyOut, phone = :newPhone, cell_phone = :newCellPhone, company_email = :newCompanyEmail, other_email = :newOtherEmail, post_number = :newPostNumber, address = :newAddress, passport_number = :newPassportNumber, passport_deadline = :newPassportDeadline, stay_card_number = :newStayCardNumber, stay_card_start = :newStayCardStart, stay_card_end = :newStayCardEnd, stay_card_end = :newStayCardEnd, stay_qualification = :newStayQualification, security_number = :newSecurityNumber, year_money_number = :newYearMoneyNumber, bank_name = :newBankName, branch_name = :newBranchName, bank_account_name = :newBankAccountName where my_number = :newMyNumber ", nativeQuery = true)
    public int updateInfo(@Param("newMyNumber") int MyNumber, @Param("newName") String Name, @Param("newNameKatagana") String NameKatagana, @Param("newNameRoma") String nameRoma, @Param("newKokuseki") String kokuseki, @Param("newGender") String gender, @Param("newBirthday") String birthday, @Param("newAge") int age, @Param("newCompanyIn") String companyIn, @Param("newCompanyOut") String companyOut, @Param("newPhone") String phone, @Param("newCellPhone") String cellPhone, @Param("newCompanyEmail") String companyEmail, @Param("newOtherEmail") String otherEmail, @Param("newPostNumber") String postNumber, @Param("newAddress") String address, @Param("newPassportNumber") String passportNumber, @Param("newPassportDeadline") String passportDeadline, @Param("newStayCardNumber") String stayCardNumber, @Param("newStayCardStart") String stayCardStart, @Param("newStayCardEnd") String stayCradEnd, @Param("newStayQualification") String stayQualification, @Param("newSecurityNumber") String securityNumber, @Param("newYearMoneyNumber") String yearMoneyNumber, @Param("newBankName") String bankName, @Param("newBranchName") String branchName, @Param("newBankAccountName") String bankAccountName);
    
}








