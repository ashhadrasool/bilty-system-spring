package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.Bilty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiltyRepo extends JpaRepository<Bilty, Long> {
}
