package com.example.soldiers.Services;

import com.example.soldiers.DTO.SoldierDTO;
import com.example.soldiers.DTO.SoldierMapper;
import com.example.soldiers.DTO.SquadDTO;
import com.example.soldiers.Entities.Soldier;
import com.example.soldiers.Repo.SoldierRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SoldierService implements ISoldierService{

    final RestTemplate restTemplate;
    final SoldierRepo sr;
    final SquadClient sc;

    @Override
    public List<SoldierDTO> findall() {
        return sr.findAll().stream().map(SoldierMapper::EntitytoDTOA).collect(Collectors.toList());
    }


    @Override
    public SoldierDTO findbyId(String id) {

        Soldier s = sr.findById(id).orElseThrow(() -> new IllegalArgumentException("No Soldier found with this id: " + id));

        SquadDTO squadDTO = restTemplate.getForObject("http://stock-ms/api/stock/getStock/" + s.getId_Squad(), SquadDTO.class);
        return SoldierMapper.EntitytoDTOS(s,squadDTO);
    }

    @Override
    public SoldierDTO addSoldier(SoldierDTO Soldierdto) {
        Soldier s = SoldierMapper.DTOtoEntity(Soldierdto);
        sr.save(s);
        return Soldierdto;

    }

    @Override
    public SoldierDTO modSoldier(SoldierDTO Soldierdto) {

        Soldier article = SoldierMapper.DTOtoEntity(Soldierdto);
        Soldier existingarticle = sr.save(article);
        return SoldierMapper.EntitytoDTOA(existingarticle);

    }

    @Override
    public void deletebyId(String id) {
        sr.deleteById(id);
    }
}
