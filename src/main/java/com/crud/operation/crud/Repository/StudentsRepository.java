package com.crud.operation.crud.Repository;

import com.crud.operation.crud.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
