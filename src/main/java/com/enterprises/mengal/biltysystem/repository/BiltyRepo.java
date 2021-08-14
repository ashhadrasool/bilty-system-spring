package com.enterprises.mengal.biltysystem.repository;

import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.model.Code;
import com.enterprises.mengal.biltysystem.model.QBilty;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Repository
public interface BiltyRepo extends JpaRepository<Bilty, Long>,
        QuerydslPredicateExecutor<Bilty>, QuerydslBinderCustomizer<QBilty>
{

    @Override
    default public void customize(QuerydslBindings bindings, QBilty root) {
    bindings.bind(String.class)
            .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    //bindings.excluding(root.email);
}

    List<Bilty> findAllByBiltyId(Long id);

    Bilty findOneByBiltyId(Long id);

    List<Bilty> findByDateGreaterThanEqualAndDateLessThanEqual(LocalDate startDate, LocalDate endDate);
}
