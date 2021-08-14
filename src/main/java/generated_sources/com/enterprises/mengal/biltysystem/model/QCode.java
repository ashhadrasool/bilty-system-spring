package com.enterprises.mengal.biltysystem.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCode is a Querydsl query type for Code
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCode extends EntityPathBase<Code> {

    private static final long serialVersionUID = 1152866000L;

    public static final QCode code = new QCode("code");

    public final NumberPath<Long> codeid = createNumber("codeid", Long.class);

    public final StringPath description = createString("description");

    public final StringPath type = createString("type");

    public QCode(String variable) {
        super(Code.class, forVariable(variable));
    }

    public QCode(Path<? extends Code> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCode(PathMetadata metadata) {
        super(Code.class, metadata);
    }

}

