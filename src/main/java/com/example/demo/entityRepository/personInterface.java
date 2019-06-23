package com.example.demo.entityRepository;

import com.example.demo.entity.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personInterface extends JpaRepository<person, Integer> {
}
