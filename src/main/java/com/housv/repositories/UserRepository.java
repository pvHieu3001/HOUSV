package com.housv.repositories;

import com.housv.domains.entities.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Fresher-Training
 *
 * @author Namtt
 * @created_at 02/07/2020 - 10:49 AM
 * @created_by Namtt
 * @since 02/07/2020
 */
public interface UserRepository extends BaseRepository<User, Long>{
    User findByUsername(String username);

    @Query(value = "select u.id,u.username,u.email,u.password,u.status from user u where u.status = 1;",nativeQuery = true)
    List<User> findAllByStatus1();


}
