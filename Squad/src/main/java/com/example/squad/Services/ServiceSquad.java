package com.example.squad.Services;


import com.example.squad.Entities.Squad;
import com.example.squad.Repos.SquadRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceSquad implements IServiceSquad{

    final SquadRepo sr;

    @Override
    public Squad addSquad(Squad s) {
        return sr.save(s);
    }

    @Override
    public Squad update(Squad s) {
        return sr.save(s);
    }

    @Override
    public List<Squad> allSquads() {
        return (List<Squad>) sr.findAll();
    }

    @Override
    public Squad getSquad(String id) {
        return sr.findById(id).get();
    }

    @Override
    public void deleteSquadbyId(String id) {

        sr.deleteById(id);

    }

    @Override
    public void deleteSquad(Squad s) {
        sr.delete(s);
    }
}
