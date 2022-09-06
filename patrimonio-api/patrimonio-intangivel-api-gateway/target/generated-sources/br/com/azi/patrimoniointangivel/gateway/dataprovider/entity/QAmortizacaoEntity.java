package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAmortizacaoEntity is a Querydsl query type for AmortizacaoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAmortizacaoEntity extends EntityPathBase<AmortizacaoEntity> {

    private static final long serialVersionUID = 878583289L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAmortizacaoEntity amortizacaoEntity = new QAmortizacaoEntity("amortizacaoEntity");

    public final br.com.azi.hal.core.generic.entity.QBaseObject _super = new br.com.azi.hal.core.generic.entity.QBaseObject(this);

    public final QConfigAmortizacaoEntity configAmortizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataAlteracao = _super.dataAlteracao;

    //inherited
    public final DateTimePath<java.util.Date> dataCadastro = _super.dataCadastro;

    public final DateTimePath<java.util.Date> dataFinal = createDateTime("dataFinal", java.util.Date.class);

    public final DateTimePath<java.util.Date> dataInicial = createDateTime("dataInicial", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUnidadeOrganizacionalEntity orgao;

    public final QPatrimonioEntity patrimonio;

    public final NumberPath<java.math.BigDecimal> taxaAplicada = createNumber("taxaAplicada", java.math.BigDecimal.class);

    //inherited
    public final StringPath usuarioAlteracao = _super.usuarioAlteracao;

    //inherited
    public final StringPath usuarioCadastro = _super.usuarioCadastro;

    public final NumberPath<java.math.BigDecimal> valorAnterior = createNumber("valorAnterior", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> valorPosterior = createNumber("valorPosterior", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> valorSubtraido = createNumber("valorSubtraido", java.math.BigDecimal.class);

    public QAmortizacaoEntity(String variable) {
        this(AmortizacaoEntity.class, forVariable(variable), INITS);
    }

    public QAmortizacaoEntity(Path<? extends AmortizacaoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAmortizacaoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAmortizacaoEntity(PathMetadata metadata, PathInits inits) {
        this(AmortizacaoEntity.class, metadata, inits);
    }

    public QAmortizacaoEntity(Class<? extends AmortizacaoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.configAmortizacao = inits.isInitialized("configAmortizacao") ? new QConfigAmortizacaoEntity(forProperty("configAmortizacao"), inits.get("configAmortizacao")) : null;
        this.orgao = inits.isInitialized("orgao") ? new QUnidadeOrganizacionalEntity(forProperty("orgao")) : null;
        this.patrimonio = inits.isInitialized("patrimonio") ? new QPatrimonioEntity(forProperty("patrimonio"), inits.get("patrimonio")) : null;
    }

}

