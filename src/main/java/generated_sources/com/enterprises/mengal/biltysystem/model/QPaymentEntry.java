package com.enterprises.mengal.biltysystem.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPaymentEntry is a Querydsl query type for PaymentEntry
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPaymentEntry extends EntityPathBase<PaymentEntry> {

    private static final long serialVersionUID = 2130661359L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPaymentEntry paymentEntry = new QPaymentEntry("paymentEntry");

    public final QBilty bilty;

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final NumberPath<Integer> paymentEntryFileIndex = createNumber("paymentEntryFileIndex", Integer.class);

    public final NumberPath<Long> paymentEntryId = createNumber("paymentEntryId", Long.class);

    public final NumberPath<Long> paymentFileId = createNumber("paymentFileId", Long.class);

    public final StringPath vehicleNo = createString("vehicleNo");

    public final NumberPath<Float> weight = createNumber("weight", Float.class);

    public QPaymentEntry(String variable) {
        this(PaymentEntry.class, forVariable(variable), INITS);
    }

    public QPaymentEntry(Path<? extends PaymentEntry> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPaymentEntry(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPaymentEntry(PathMetadata metadata, PathInits inits) {
        this(PaymentEntry.class, metadata, inits);
    }

    public QPaymentEntry(Class<? extends PaymentEntry> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bilty = inits.isInitialized("bilty") ? new QBilty(forProperty("bilty"), inits.get("bilty")) : null;
    }

}

