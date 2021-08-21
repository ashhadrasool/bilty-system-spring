package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CodeRepo extends JpaRepository<Code, Long> {
   List<Code> findAllByType(String type);

   Optional<Code> getOneByDescription(String description);
}
