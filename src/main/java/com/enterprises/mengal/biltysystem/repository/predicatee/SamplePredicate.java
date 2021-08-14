//package com.enterprises.mengal.biltysystem.repository.predicatee;
//
//
//import com.enterprises.mengal.biltysystem.model.QBilty;
//import com.querydsl.core.BooleanBuilder;
//
//public class SamplePredicate {
//    public static com.querydsl.core.types.Predicate queryBiltyRecordsWithDSL(String filter) {
//        BooleanBuilder builder = new BooleanBuilder();
//        QBilty bilty = QBilty.bilty;
//        final String param = "%" + filter + "%";
//        builder.and(bilty.containerNo.lower().like(param))
//                .and(bilty.containerNo.lower().like(param))
//                .and(bilty.containerNo.lower().like(param))
//                .and(bilty.containerNo.lower().like(param));
//        return builder;
//
//    }
//
//    private BooleanBuilder isFirstNameLike(String firstName){
//        return firstName != null ? customer.firstName.like(firstName) : null;
//    }
//
//    private BooleanBuilder isStatusEq(StatusEnum status){
//        return status != null ? customer.status.eq(status) : null;
//    }
//
//}
//
////
////import com.enterprises.mengal.biltysystem.model.Bilty;
////import com.querydsl.core.types.dsl.BooleanExpression;
////import com.querydsl.core.types.dsl.NumberPath;
////import com.querydsl.core.types.dsl.PathBuilder;
////
////public class SamplePredicate {
////
////    private SearchCriteria criteria;
////
////    public BooleanExpression getPredicate() {
////        PathBuilder<Bilty> entityPath = new PathBuilder<>(Bilty.class, "bilty");
////
////        if (isNumeric(criteria.getValue().toString())) {
////            NumberPath<Integer> path = entityPath.getNumber(criteria.getKey(), Integer.class);
////            int value = Integer.parseInt(criteria.getValue().toString());
////            switch (criteria.getOperation()) {
////                case ":":
////                    return path.eq(value);
////                case ">":
////                    return path.goe(value);
////                case "<":
////                    return path.loe(value);
////            }
////        }
////        else {
////            StringPath path = entityPath.getString(criteria.getKey());
////            if (criteria.getOperation().equalsIgnoreCase(":")) {
////                return path.containsIgnoreCase(criteria.getValue().toString());
////            }
////        }
////        return null;
////    }
////}
