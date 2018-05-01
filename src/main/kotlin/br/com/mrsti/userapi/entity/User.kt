package br.com.mrsti.userapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(@Id var id: String?,
               var login: String,
               var name: String)