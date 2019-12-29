package com.examplespringgithub.demo.repository;

import com.examplespringgithub.demo.model.BatlleShip;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattlleShipRepository extends ReactiveMongoRepository<BatlleShip, String> {

}
