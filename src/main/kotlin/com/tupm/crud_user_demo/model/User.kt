package com.tupm.crud_user_demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
//A data class automatically generates equals(), hashcode(), toString() and copy() methods.
//Assigned a default value for all the fields because Hibernate requires an entity to have a no-arg constructor.
data class User(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = 0,

  @get: NotBlank
  var name: String = "",

  @get: NotBlank
  var address: String = "",

  @get: NotBlank
  var phone: String = ""
)
