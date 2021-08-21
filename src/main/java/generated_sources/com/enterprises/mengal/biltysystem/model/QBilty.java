package com.enterprises.mengal.biltysystem.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBilty is a Querydsl query type for Bilty
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBilty extends EntityPathBase<Bilty> {

    private static final long serialVersionUID = 1378013639L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBilty bilty = new QBilty("bilty");

    public final NumberPath<Integer> advanceAmount = createNumber("advanceAmount", Integer.class);

    public final NumberPath<Long> biltyId = createNumber("biltyId", Long.class);

    public final StringPath containerNo = createString("containerNo");

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final NumberPath<Integer> dieselAmount = createNumber("dieselAmount", Integer.class);

    public final StringPath driverMobileNo = createString("driverMobileNo");

    public final StringPath driverName = createString("driverName");

    public final QCode fromCode;

    public final QCode materialCode;

    public final StringPath msNo = createString("msNo");

    public final StringPath poNo = createString("poNo");

    public final QCode senderCode;

    public final QCode statusCode;

    public final QCode toCode;

    public final StringPath vehicleNo = createString("vehicleNo");

    public final NumberPath<Float> weight = createNumber("weight", Float.class);

    public QBilty(String variable) {
        this(Bilty.class, forVariable(variable), INITS);
    }

    public QBilty(Path<? extends Bilty> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBilty(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBilty(PathMetadata metadata, PathInits inits) {
        this(Bilty.class, metadata, inits);
    }

    public QBilty(Class<? extends Bilty> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fromCode = inits.isInitialized("fromCode") ? new QCode(forProperty("fromCode")) : null;
        this.materialCode = inits.isInitialized("materialCode") ? new QCode(forProperty("materialCode")) : null;
        this.senderCode = inits.isInitialized("senderCode") ? new QCode(forProperty("senderCode")) : null;
        this.statusCode = inits.isInitialized("statusCode") ? new QCode(forProperty("statusCode")) : null;
        this.toCode = inits.isInitialized("toCode") ? new QCode(forProperty("toCode")) : null;
    }

}

