package com.example.soldiers.DTO;

import com.example.soldiers.Entities.Soldier;

public class SoldierMapper {
    public static SoldierDTO EntitytoDTOA(Soldier soldier){
        if (soldier == null ){
            return null;
        }
        SoldierDTO dto = new SoldierDTO();
        dto.builder().id(soldier.getId()).name(soldier.getName()).gun(soldier.getGun()).secondgun(soldier.getSecondgun()).thirdgun(soldier.getThirdgun());
        return dto;
    }


    public static SoldierDTO EntitytoDTOS(Soldier soldier,SquadDTO squadDTO){
        if (soldier == null ){
            return null;
        }
        SoldierDTO dto = new SoldierDTO();
        dto = dto.builder().id(soldier.getId()).name(soldier.getName()).gun(soldier.getGun()).secondgun(soldier.getSecondgun()).thirdgun(soldier.getThirdgun()).id_Squad(soldier.getId_Squad()).build();
        return dto;
    }

    public static Soldier DTOtoEntity(SoldierDTO dto){
        if (dto == null){
            return null;

        }
        Soldier soldier = new Soldier();
        soldier = soldier.builder().id(dto.getId()).name(dto.getName()).gun(dto.getGun()).secondgun(dto.getSecondgun()).thirdgun(dto.getThirdgun()).id_Squad(dto.getId_Squad()).build();
        return soldier;
    }

}
