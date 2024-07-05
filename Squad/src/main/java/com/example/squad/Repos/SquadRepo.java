package com.example.squad.Repos;

import com.example.squad.Entities.Squad;
import org.springframework.data.repository.CrudRepository;

public interface SquadRepo extends CrudRepository<Squad,String> {
}
