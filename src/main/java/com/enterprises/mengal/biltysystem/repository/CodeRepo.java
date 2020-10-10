package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodeRepo extends JpaRepository<Code, Long> {
   List<Code> findAllByType(String type);

}
