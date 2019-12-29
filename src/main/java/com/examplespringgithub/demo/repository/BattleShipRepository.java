package com.examplespringgithub.demo.repository;

import com.examplespringgithub.demo.model.BattleShip;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleShipRepository extends ReactiveMongoRepository<BattleShip, String> {

}
