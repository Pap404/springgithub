package model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Titanic(var id:String,var name:String,var gun:String)