package ru.chernevich.redis_demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.chernevich.redis_demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
