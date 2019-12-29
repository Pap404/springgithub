package com.examplespringgithub.demo.controller;

import com.examplespringgithub.demo.model.BatlleShip;
import com.examplespringgithub.demo.repository.BattlleShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/battleShip")
public class BatleShipController {
    @Autowired
    BattlleShipRepository battlleShipRepository;

    @GetMapping
    public Flux<BatlleShip> batlleShipFlux () {
        return battlleShipRepository.findAll();
    }

}
