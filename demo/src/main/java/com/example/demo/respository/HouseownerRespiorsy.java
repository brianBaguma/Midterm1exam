package com.example.demo.respository;
import com.example.demo.model.HouseOwner;
import com.example.demo.model.HouseOwnerProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
public interface HouseownerRespiorsy extends JpaRepository<HouseOwnerProperty,Integer>{
  Optional<HouseOwnerProperty> findByName(String firstname);
}

