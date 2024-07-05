package com.example.soldiers.RestControllers;

import com.example.soldiers.DTO.SoldierDTO;
import com.example.soldiers.Services.SoldierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/soldier")
@RequiredArgsConstructor
public class SoldierRC {
    private final SoldierService service;

    @GetMapping("/getallSoldiers")
    public List<SoldierDTO> getAllSoldiers() {
        return service.findall();
    }

    @GetMapping("/getSoldier/{id}")
    public SoldierDTO getSoldierById(@PathVariable String id) {
        return service.findbyId(id);
    }

    @PostMapping("/addSoldier")
    public SoldierDTO createSoldier(@RequestBody SoldierDTO SoldierDTO) {
        return service.addSoldier(SoldierDTO);
    }

    @PutMapping("/updateSoldier/{id}")
    public SoldierDTO updateSoldier(@PathVariable String id, @RequestBody SoldierDTO Soldierdto) {
        Soldierdto.setId(id);
        return service.modSoldier(Soldierdto);
    }

    @DeleteMapping("/deleteSoldier/{id}")
    public void deleteSoldier(@PathVariable String id){
        service.deletebyId(id);
    }
}
