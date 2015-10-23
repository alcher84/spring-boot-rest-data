package org.test.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.test.backend.entity.Users;

import java.util.List;

/**
 * Created by achernysh on 22.10.2015.
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {

//    @Query("SELECT u.username FROM Users u")
//    List<String> findAllUsernames();
}


