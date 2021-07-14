package org.bruce.microservice.userservice.repository;

import org.bruce.microservice.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: bruce.hong
 * @time: 2021/7/7 下午 2:52
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
