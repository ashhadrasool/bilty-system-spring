package com.enterprises.mengal.biltysystem.repository.predicate;

import com.enterprises.mengal.biltysystem.model.QBilty;
import com.querydsl.core.BooleanBuilder;

public class SamplePredicate {
    public static com.querydsl.core.types.Predicate queryCartsWithDSL(String filter) {
        BooleanBuilder builder = new BooleanBuilder();
        QBilty bilty = QBilty.bilty;
        final String param = "%" + filter + "%";
        builder.or(bilty.containerNo.lower().like(param));
        return builder;

    }

}

