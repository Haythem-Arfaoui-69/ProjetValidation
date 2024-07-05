package com.example.soldiers.Services;


import com.example.soldiers.DTO.SquadDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "Squad-MS")
public interface SquadClient {
    @GetMapping("api/squad/getSquad/{id}")
    SquadDTO getbyID(@PathVariable("id")String id);
}
