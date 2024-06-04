package com.example.demo.Service;
import com.example.demo.model.HouseOwner;
import com.example.demo.respository.HouseownerRespiorsy;

public class HouseOwnerService {
    private final HouseownerRespiorsy houseownerRespiorsy;

    public HouseOwnerService(HouseownerRespiorsy houseownerRespiorsy) {
        this.houseownerRespiorsy = houseownerRespiorsy;
    }
    public HouseOwner save(HouseOwner houseOwner){
        return houseownerRespiorsy.save(houseOwner);
    }
    public void deleteById(int id){
        houseownerRespiorsy.deleteById(id);
    }
    public HouseOwner update(HouseOwner houseOwner){
        return houseownerRespiorsy.save(houseOwner);
    }

    public list<houseowner>findAll(){
        return houseownerRespiorsy.findAll();
    }
}
