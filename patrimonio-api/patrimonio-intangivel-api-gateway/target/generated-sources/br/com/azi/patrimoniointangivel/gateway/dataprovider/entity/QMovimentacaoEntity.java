package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovimentacaoEntity is a Querydsl query type for MovimentacaoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMovimentacaoEntity extends EntityPathBase<MovimentacaoEntity> {

    private static final long serialVersionUID = -192673194L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMovimentacaoEntity movimentacaoEntity = new QMovimentacaoEntity("movimentacaoEntity");

    public final br.com.azi.hal.core.generic.entity.QBaseObject _super = new br.com.azi.hal.core.generic.entity.QBaseObject(this);

    public final StringPath codigo = createString("codigo");

    //inherited
    public final DateTimePath<java.util.Date> dataAlteracao = _super.dataAlteracao;

    //inherited
    public final DateTimePath<java.util.Date> dataCadastro = _super.dataCadastro;

    public final DateTimePath<java.util.Date> dataDeEnvio = createDateTime("dataDeEnvio", java.util.Date.class);

    public final DateTimePath<java.util.Date> dataDeFinalizacao = createDateTime("dataDeFinalizacao", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath motivo = createString("motivo");

    public final StringPath motivoRejeicao = createString("motivoRejeicao");

    public final QNotaLancamentoContabilEntity notaLancamentoContabil;

    public final QUnidadeOrganizacionalEntity orgaoDestino;

    public final QUnidadeOrganizacionalEntity orgaoOrigem;

    public final QPatrimonioEntity patrimonio;

    public final StringPath situacao = createString("situacao");

    public final StringPath tipo = createString("tipo");

    //inherited
    public final StringPath usuarioAlteracao = _super.usuarioAlteracao;

    //inherited
    public final StringPath usuarioCadastro = _super.usuarioCadastro;

    public final StringPath usuarioFinalizacao = createString("usuarioFinalizacao");

    public QMovimentacaoEntity(String variable) {
        this(MovimentacaoEntity.class, forVariable(variable), INITS);
    }

    public QMovimentacaoEntity(Path<? extends MovimentacaoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMovimentacaoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMovimentacaoEntity(PathMetadata metadata, PathInits inits) {
        this(MovimentacaoEntity.class, metadata, inits);
    }

    public QMovimentacaoEntity(Class<? extends MovimentacaoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notaLancamentoContabil = inits.isInitialized("notaLancamentoContabil") ? new QNotaLancamentoContabilEntity(forProperty("notaLancamentoContabil")) : null;
        this.orgaoDestino = inits.isInitialized("orgaoDestino") ? new QUnidadeOrganizacionalEntity(forProperty("orgaoDestino")) : null;
        this.orgaoOrigem = inits.isInitialized("orgaoOrigem") ? new QUnidadeOrganizacionalEntity(forProperty("orgaoOrigem")) : null;
        this.patrimonio = inits.isInitialized("patrimonio") ? new QPatrimonioEntity(forProperty("patrimonio"), inits.get("patrimonio")) : null;
    }

}

