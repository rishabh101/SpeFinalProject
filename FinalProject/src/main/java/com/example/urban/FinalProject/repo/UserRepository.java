package com.example.urban.FinalProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.urban.FinalProject.bean.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long >{

}
