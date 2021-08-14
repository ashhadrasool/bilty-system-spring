package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface BiltyRepo extends PagingAndSortingRepository<Bilty, Long>,
        QuerydslPredicateExecutor<Bilty> {

    List<Bilty> findAllByBiltyId(Long id);
    Bilty findOneByBiltyId(Long id);
    List<Bilty> findByDateGreaterThanEqualAndDateLessThanEqual(LocalDate startDate, LocalDate endDate);
}
