package com.tupm.crud_user_demo.repository

import com.tupm.crud_user_demo.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepository {
  interface UserRepository : JpaRepository<User, Long>
}
//extended UserRepository from JpaRepository interface, all the CRUD methods on User entity is ready available