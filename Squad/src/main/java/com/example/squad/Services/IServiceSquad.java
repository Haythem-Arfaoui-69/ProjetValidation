package com.example.squad.Services;

import com.example.squad.Entities.Squad;

import java.util.List;

public interface IServiceSquad {


    Squad addSquad (Squad s);

    Squad update(Squad s);

    List<Squad> allSquads();

    Squad getSquad(String id);

    void deleteSquadbyId(String id);

    void deleteSquad (Squad s);


}
