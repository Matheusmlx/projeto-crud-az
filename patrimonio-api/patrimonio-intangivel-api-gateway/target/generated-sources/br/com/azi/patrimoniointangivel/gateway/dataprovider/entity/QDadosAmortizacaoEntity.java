package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDadosAmortizacaoEntity is a Querydsl query type for DadosAmortizacaoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDadosAmortizacaoEntity extends EntityPathBase<DadosAmortizacaoEntity> {

    private static final long serialVersionUID = 1818308270L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDadosAmortizacaoEntity dadosAmortizacaoEntity = new QDadosAmortizacaoEntity("dadosAmortizacaoEntity");

    public final br.com.azi.hal.core.generic.entity.QBaseObject _super = new br.com.azi.hal.core.generic.entity.QBaseObject(this);

    public final QConfigAmortizacaoEntity configAmortizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataAlteracao = _super.dataAlteracao;

    //inherited
    public final DateTimePath<java.util.Date> dataCadastro = _super.dataCadastro;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> patrimonio = createNumber("patrimonio", Long.class);

    //inherited
    public final StringPath usuarioAlteracao = _super.usuarioAlteracao;

    //inherited
    public final StringPath usuarioCadastro = _super.usuarioCadastro;

    public QDadosAmortizacaoEntity(String variable) {
        this(DadosAmortizacaoEntity.class, forVariable(variable), INITS);
    }

    public QDadosAmortizacaoEntity(Path<? extends DadosAmortizacaoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDadosAmortizacaoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDadosAmortizacaoEntity(PathMetadata metadata, PathInits inits) {
        this(DadosAmortizacaoEntity.class, metadata, inits);
    }

    public QDadosAmortizacaoEntity(Class<? extends DadosAmortizacaoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.configAmortizacao = inits.isInitialized("configAmortizacao") ? new QConfigAmortizacaoEntity(forProperty("configAmortizacao"), inits.get("configAmortizacao")) : null;
    }

}

