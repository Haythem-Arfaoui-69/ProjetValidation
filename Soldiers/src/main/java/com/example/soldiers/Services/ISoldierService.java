package com.example.soldiers.Services;

import com.example.soldiers.DTO.SoldierDTO;

import java.util.List;

public interface ISoldierService {

    List<SoldierDTO> findall();
    SoldierDTO findbyId(String id);
    SoldierDTO addSoldier(SoldierDTO Soldierdto);
    SoldierDTO modSoldier(SoldierDTO Soldierdto);
    void deletebyId(String id);

}
