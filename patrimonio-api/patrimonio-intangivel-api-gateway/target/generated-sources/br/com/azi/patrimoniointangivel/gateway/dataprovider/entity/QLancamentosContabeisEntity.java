package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLancamentosContabeisEntity is a Querydsl query type for LancamentosContabeisEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLancamentosContabeisEntity extends EntityPathBase<LancamentosContabeisEntity> {

    private static final long serialVersionUID = 986910646L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLancamentosContabeisEntity lancamentosContabeisEntity = new QLancamentosContabeisEntity("lancamentosContabeisEntity");

    public final br.com.azi.hal.core.generic.entity.QBaseObject _super = new br.com.azi.hal.core.generic.entity.QBaseObject(this);

    public final QContaContabilEntity contaContabil;

    //inherited
    public final DateTimePath<java.util.Date> dataAlteracao = _super.dataAlteracao;

    //inherited
    public final DateTimePath<java.util.Date> dataCadastro = _super.dataCadastro;

    public final DateTimePath<java.time.LocalDateTime> dataLancamento = createDateTime("dataLancamento", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath motivoLancamento = createString("motivoLancamento");

    public final QMovimentacaoEntity movimentacao;

    public final QUnidadeOrganizacionalEntity orgao;

    public final QPatrimonioEntity patrimonio;

    public final StringPath tipoLancamento = createString("tipoLancamento");

    //inherited
    public final StringPath usuarioAlteracao = _super.usuarioAlteracao;

    //inherited
    public final StringPath usuarioCadastro = _super.usuarioCadastro;

    public final NumberPath<java.math.BigDecimal> valorLiquido = createNumber("valorLiquido", java.math.BigDecimal.class);

    public QLancamentosContabeisEntity(String variable) {
        this(LancamentosContabeisEntity.class, forVariable(variable), INITS);
    }

    public QLancamentosContabeisEntity(Path<? extends LancamentosContabeisEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLancamentosContabeisEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLancamentosContabeisEntity(PathMetadata metadata, PathInits inits) {
        this(LancamentosContabeisEntity.class, metadata, inits);
    }

    public QLancamentosContabeisEntity(Class<? extends LancamentosContabeisEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contaContabil = inits.isInitialized("contaContabil") ? new QContaContabilEntity(forProperty("contaContabil")) : null;
        this.movimentacao = inits.isInitialized("movimentacao") ? new QMovimentacaoEntity(forProperty("movimentacao"), inits.get("movimentacao")) : null;
        this.orgao = inits.isInitialized("orgao") ? new QUnidadeOrganizacionalEntity(forProperty("orgao")) : null;
        this.patrimonio = inits.isInitialized("patrimonio") ? new QPatrimonioEntity(forProperty("patrimonio"), inits.get("patrimonio")) : null;
    }

}

