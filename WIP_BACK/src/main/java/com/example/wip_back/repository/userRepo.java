package com.example.wip_back.repository;

import com.example.wip_back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.table.TableModel;
import java.util.List;

public interface userRepo extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM users WHERE field1 = :field1", nativeQuery = true)
    List<User> findByField1(@Param("field1") String field1);

}
