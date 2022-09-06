package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPatrimonioEntity is a Querydsl query type for PatrimonioEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPatrimonioEntity extends EntityPathBase<PatrimonioEntity> {

    private static final long serialVersionUID = 1626977515L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPatrimonioEntity patrimonioEntity = new QPatrimonioEntity("patrimonioEntity");

    public final br.com.azi.hal.core.generic.entity.QBaseObject _super = new br.com.azi.hal.core.generic.entity.QBaseObject(this);

    public final BooleanPath amortizavel = createBoolean("amortizavel");

    public final NumberPath<Integer> anoMemorando = createNumber("anoMemorando", Integer.class);

    public final BooleanPath ativacaoRetroativa = createBoolean("ativacaoRetroativa");

    public final QContaContabilEntity contaContabil;

    public final QDadosAmortizacaoEntity dadosAmortizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataAlteracao = _super.dataAlteracao;

    public final DateTimePath<java.util.Date> dataAquisicao = createDateTime("dataAquisicao", java.util.Date.class);

    public final DateTimePath<java.util.Date> dataAtivacao = createDateTime("dataAtivacao", java.util.Date.class);

    //inherited
    public final DateTimePath<java.util.Date> dataCadastro = _super.dataCadastro;

    public final DateTimePath<java.util.Date> dataFinalAtivacao = createDateTime("dataFinalAtivacao", java.util.Date.class);

    public final DateTimePath<java.util.Date> dataVencimento = createDateTime("dataVencimento", java.util.Date.class);

    public final StringPath descricao = createString("descricao");

    public final StringPath estado = createString("estado");

    public final DateTimePath<java.util.Date> fimVidaUtil = createDateTime("fimVidaUtil", java.util.Date.class);

    public final QFornecedorEntity fornecedor;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> inicioVidaUtil = createDateTime("inicioVidaUtil", java.util.Date.class);

    public final NumberPath<Short> mesesVidaUtil = createNumber("mesesVidaUtil", Short.class);

    public final StringPath nome = createString("nome");

    public final QNotaLancamentoContabilEntity notaLancamentoContabil;

    public final StringPath numero = createString("numero");

    public final StringPath numeroMemorando = createString("numeroMemorando");

    public final QUnidadeOrganizacionalEntity orgao;

    public final StringPath reconhecimento = createString("reconhecimento");

    public final QUnidadeOrganizacionalEntity setor;

    public final StringPath situacao = createString("situacao");

    public final StringPath tipo = createString("tipo");

    //inherited
    public final StringPath usuarioAlteracao = _super.usuarioAlteracao;

    //inherited
    public final StringPath usuarioCadastro = _super.usuarioCadastro;

    public final NumberPath<java.math.BigDecimal> valorAquisicao = createNumber("valorAquisicao", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> valorDeEntrada = createNumber("valorDeEntrada", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> valorLiquido = createNumber("valorLiquido", java.math.BigDecimal.class);

    public final BooleanPath vidaIndefinida = createBoolean("vidaIndefinida");

    public QPatrimonioEntity(String variable) {
        this(PatrimonioEntity.class, forVariable(variable), INITS);
    }

    public QPatrimonioEntity(Path<? extends PatrimonioEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPatrimonioEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPatrimonioEntity(PathMetadata metadata, PathInits inits) {
        this(PatrimonioEntity.class, metadata, inits);
    }

    public QPatrimonioEntity(Class<? extends PatrimonioEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contaContabil = inits.isInitialized("contaContabil") ? new QContaContabilEntity(forProperty("contaContabil")) : null;
        this.dadosAmortizacao = inits.isInitialized("dadosAmortizacao") ? new QDadosAmortizacaoEntity(forProperty("dadosAmortizacao"), inits.get("dadosAmortizacao")) : null;
        this.fornecedor = inits.isInitialized("fornecedor") ? new QFornecedorEntity(forProperty("fornecedor")) : null;
        this.notaLancamentoContabil = inits.isInitialized("notaLancamentoContabil") ? new QNotaLancamentoContabilEntity(forProperty("notaLancamentoContabil")) : null;
        this.orgao = inits.isInitialized("orgao") ? new QUnidadeOrganizacionalEntity(forProperty("orgao")) : null;
        this.setor = inits.isInitialized("setor") ? new QUnidadeOrganizacionalEntity(forProperty("setor")) : null;
    }

}

