package repoisitory

import model.Titanic
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TitanicRepository :ReactiveMongoRepository<Titanic,String>{

}