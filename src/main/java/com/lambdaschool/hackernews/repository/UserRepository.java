package com.lambdaschool.hackernews.repository;

import com.lambdaschool.hackernews.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
