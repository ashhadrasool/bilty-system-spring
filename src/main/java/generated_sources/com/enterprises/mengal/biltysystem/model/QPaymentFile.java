package com.enterprises.mengal.biltysystem.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPaymentFile is a Querydsl query type for PaymentFile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPaymentFile extends EntityPathBase<PaymentFile> {

    private static final long serialVersionUID = -1732359585L;

    public static final QPaymentFile paymentFile = new QPaymentFile("paymentFile");

    public final StringPath filePath = createString("filePath");

    public final StringPath md5Hash = createString("md5Hash");

    public final NumberPath<Long> paymentFileId = createNumber("paymentFileId", Long.class);

    public QPaymentFile(String variable) {
        super(PaymentFile.class, forVariable(variable));
    }

    public QPaymentFile(Path<? extends PaymentFile> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPaymentFile(PathMetadata metadata) {
        super(PaymentFile.class, metadata);
    }

}

