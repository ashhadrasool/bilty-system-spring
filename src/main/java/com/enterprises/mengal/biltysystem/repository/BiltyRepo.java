package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiltyRepo extends JpaRepository<Bilty, Long> {

    List<Bilty> findAllByBiltyid(Long id);
}
