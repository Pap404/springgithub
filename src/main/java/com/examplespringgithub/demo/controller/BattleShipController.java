package com.examplespringgithub.demo.controller;

import com.examplespringgithub.demo.model.BattleShip;
import com.examplespringgithub.demo.repository.BattleShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/battleShip")
public class BattleShipController {
    @Autowired
    BattleShipRepository battleShipRepository;

    @GetMapping
    public Flux<BattleShip> battleShipFlux () {
        return battleShipRepository.findAll();
    }

}
