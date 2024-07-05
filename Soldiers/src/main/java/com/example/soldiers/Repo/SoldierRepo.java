package com.example.soldiers.Repo;

import com.example.soldiers.Entities.Soldier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SoldierRepo extends MongoRepository<Soldier,String> {
}
