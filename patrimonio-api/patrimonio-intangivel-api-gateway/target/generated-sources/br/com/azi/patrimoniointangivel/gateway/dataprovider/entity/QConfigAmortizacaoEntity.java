package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QConfigAmortizacaoEntity is a Querydsl query type for ConfigAmortizacaoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QConfigAmortizacaoEntity extends EntityPathBase<ConfigAmortizacaoEntity> {

    private static final long serialVersionUID = 2111304407L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConfigAmortizacaoEntity configAmortizacaoEntity = new QConfigAmortizacaoEntity("configAmortizacaoEntity");

    public final br.com.azi.hal.core.generic.entity.QBaseObject _super = new br.com.azi.hal.core.generic.entity.QBaseObject(this);

    public final QContaContabilEntity contaContabil;

    //inherited
    public final DateTimePath<java.util.Date> dataAlteracao = _super.dataAlteracao;

    //inherited
    public final DateTimePath<java.util.Date> dataCadastro = _super.dataCadastro;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath metodo = createString("metodo");

    public final NumberPath<java.math.BigDecimal> percentualResidual = createNumber("percentualResidual", java.math.BigDecimal.class);

    public final StringPath situacao = createString("situacao");

    public final NumberPath<java.math.BigDecimal> taxa = createNumber("taxa", java.math.BigDecimal.class);

    public final StringPath tipo = createString("tipo");

    //inherited
    public final StringPath usuarioAlteracao = _super.usuarioAlteracao;

    //inherited
    public final StringPath usuarioCadastro = _super.usuarioCadastro;

    public final NumberPath<Short> vidaUtil = createNumber("vidaUtil", Short.class);

    public QConfigAmortizacaoEntity(String variable) {
        this(ConfigAmortizacaoEntity.class, forVariable(variable), INITS);
    }

    public QConfigAmortizacaoEntity(Path<? extends ConfigAmortizacaoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QConfigAmortizacaoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QConfigAmortizacaoEntity(PathMetadata metadata, PathInits inits) {
        this(ConfigAmortizacaoEntity.class, metadata, inits);
    }

    public QConfigAmortizacaoEntity(Class<? extends ConfigAmortizacaoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contaContabil = inits.isInitialized("contaContabil") ? new QContaContabilEntity(forProperty("contaContabil")) : null;
    }

}

