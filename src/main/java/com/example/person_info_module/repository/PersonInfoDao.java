package com.example.person_info_module.repository;

import com.example.person_info_module.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, Integer>{
    
}
