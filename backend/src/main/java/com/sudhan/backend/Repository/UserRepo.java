package com.sudhan.backend.Repository;

import com.sudhan.backend.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
    Users save(Users user);
    Users findByUserId(String userId);
}
