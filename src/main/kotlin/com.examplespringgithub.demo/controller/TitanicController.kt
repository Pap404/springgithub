package controller

import model.Titanic
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import repoisitory.TitanicRepository

@RestController
@RequestMapping("/api/titanic")
class TitanicController (var titanicRepository: TitanicRepository) {
    @GetMapping
    fun getAll(): Flux<Titanic> {
    return titanicRepository.findAll()
    }
    @PostMapping
    fun createOneList(@PathVariable titanic: Titanic): Mono<Titanic>{
        return titanicRepository.save(titanic)
    }
}