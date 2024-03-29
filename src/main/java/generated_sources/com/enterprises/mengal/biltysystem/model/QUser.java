package com.enterprises.mengal.biltysystem.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1153406126L;

    public static final QUser user = new QUser("user");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath identity = createString("identity");

    public final StringPath imageUrl = createString("imageUrl");

    public final StringPath jobTitle = createString("jobTitle");

    public final StringPath lastName = createString("lastName");

    public final StringPath password = createString("password");

    public final StringPath phoneNo = createString("phoneNo");

    public final NumberPath<java.math.BigInteger> userid = createNumber("userid", java.math.BigInteger.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

