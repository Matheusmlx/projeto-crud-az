package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRelatorioSinteticoEntity is a Querydsl query type for RelatorioSinteticoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRelatorioSinteticoEntity extends EntityPathBase<RelatorioSinteticoEntity> {

    private static final long serialVersionUID = 698700520L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRelatorioSinteticoEntity relatorioSinteticoEntity = new QRelatorioSinteticoEntity("relatorioSinteticoEntity");

    public final QContaContabilEntity contaContabil;

    public final DateTimePath<java.time.LocalDateTime> dataAtivacao = createDateTime("dataAtivacao", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> dataCadastro = createDateTime("dataCadastro", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUnidadeOrganizacionalEntity orgao;

    public final QUnidadeOrganizacionalEntity orgaoAmortizacao;

    public final NumberPath<Long> patrimonioId = createNumber("patrimonioId", Long.class);

    public final NumberPath<java.math.BigDecimal> valorAmortizadoMensal = createNumber("valorAmortizadoMensal", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> valorAquisicao = createNumber("valorAquisicao", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> valorLiquido = createNumber("valorLiquido", java.math.BigDecimal.class);

    public QRelatorioSinteticoEntity(String variable) {
        this(RelatorioSinteticoEntity.class, forVariable(variable), INITS);
    }

    public QRelatorioSinteticoEntity(Path<? extends RelatorioSinteticoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRelatorioSinteticoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRelatorioSinteticoEntity(PathMetadata metadata, PathInits inits) {
        this(RelatorioSinteticoEntity.class, metadata, inits);
    }

    public QRelatorioSinteticoEntity(Class<? extends RelatorioSinteticoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contaContabil = inits.isInitialized("contaContabil") ? new QContaContabilEntity(forProperty("contaContabil")) : null;
        this.orgao = inits.isInitialized("orgao") ? new QUnidadeOrganizacionalEntity(forProperty("orgao")) : null;
        this.orgaoAmortizacao = inits.isInitialized("orgaoAmortizacao") ? new QUnidadeOrganizacionalEntity(forProperty("orgaoAmortizacao")) : null;
    }

}

