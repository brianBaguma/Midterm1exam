package com.example.demo.respository;

import com.example.demo.model.HouseOwner;

import java.util.List;
import java.util.list;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HouseOwnerprop extends JpaRespository<HouseOwner,Integer> {
  List<HouseOwner> findAllByid(int id);
}
