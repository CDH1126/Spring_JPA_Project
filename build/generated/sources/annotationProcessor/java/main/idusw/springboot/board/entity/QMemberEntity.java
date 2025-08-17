package idusw.springboot.board.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberEntity is a Querydsl query type for MemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberEntity extends EntityPathBase<MemberEntity> {

    private static final long serialVersionUID = 41976577L;

    public static final QMemberEntity memberEntity = new QMemberEntity("memberEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final ListPath<BoardEntity, QBoardEntity> boardEntityList = this.<BoardEntity, QBoardEntity>createList("boardEntityList", BoardEntity.class, QBoardEntity.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final StringPath id = createString("id");

    public final StringPath maccess = createString("maccess");

    public final StringPath mlevel = createString("mlevel");

    public final NumberPath<Long> mno = createNumber("mno", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public final StringPath pw = createString("pw");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public QMemberEntity(String variable) {
        super(MemberEntity.class, forVariable(variable));
    }

    public QMemberEntity(Path<? extends MemberEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberEntity(PathMetadata metadata) {
        super(MemberEntity.class, metadata);
    }

}

