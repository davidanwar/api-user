package com.agriku.apiuser.repository;

import com.agriku.apiuser.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String username);
}
