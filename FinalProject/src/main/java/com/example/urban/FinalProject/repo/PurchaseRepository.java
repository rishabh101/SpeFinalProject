package com.example.urban.FinalProject.repo;
import com.example.urban.FinalProject.bean.Purchase;
import com.example.urban.FinalProject.bean.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {

	public Purchase findById(int userid);
	public List<Purchase> findAllByUser(Users user);
}
