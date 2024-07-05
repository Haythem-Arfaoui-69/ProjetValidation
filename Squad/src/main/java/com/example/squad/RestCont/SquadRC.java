package com.example.squad.RestCont;


import com.example.squad.Entities.Squad;
import com.example.squad.Services.ServiceSquad;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/squad")
@RequiredArgsConstructor
public class SquadRC {

    final ServiceSquad service;

    @GetMapping("/getallSquads")
    public List<Squad> getAllSquades() {
        return service.allSquads();
    }

    @GetMapping("/getSquad/{id}")
    public Squad getSquadById(@PathVariable String id) {
        return service.getSquad(id);
    }

    @PostMapping("/addSquad")
    public Squad createSquad(@RequestBody Squad Squad) {
        return service.addSquad(Squad);
    }

    @PutMapping("/updateSquad/{id}")
    public Squad updateSquad(@PathVariable String id, @RequestBody Squad Squad) {
        Squad.setId(id);
        return service.addSquad(Squad);
    }

    @DeleteMapping("/deleteSquad/{id}")
    public void deleteSquad(@PathVariable String id) {
        service.deleteSquadbyId(id);
    }
}




