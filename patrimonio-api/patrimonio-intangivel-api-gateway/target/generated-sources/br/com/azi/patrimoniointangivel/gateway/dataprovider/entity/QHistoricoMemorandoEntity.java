package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QHistoricoMemorandoEntity is a Querydsl query type for HistoricoMemorandoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHistoricoMemorandoEntity extends EntityPathBase<HistoricoMemorandoEntity> {

    private static final long serialVersionUID = 820143475L;

    public static final QHistoricoMemorandoEntity historicoMemorandoEntity = new QHistoricoMemorandoEntity("historicoMemorandoEntity");

    public final br.com.azi.hal.core.generic.entity.QBaseObject _super = new br.com.azi.hal.core.generic.entity.QBaseObject(this);

    //inherited
    public final DateTimePath<java.util.Date> dataAlteracao = _super.dataAlteracao;

    //inherited
    public final DateTimePath<java.util.Date> dataCadastro = _super.dataCadastro;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath numeroMemorando = createString("numeroMemorando");

    public final StringPath uriAnexo = createString("uriAnexo");

    //inherited
    public final StringPath usuarioAlteracao = _super.usuarioAlteracao;

    //inherited
    public final StringPath usuarioCadastro = _super.usuarioCadastro;

    public QHistoricoMemorandoEntity(String variable) {
        super(HistoricoMemorandoEntity.class, forVariable(variable));
    }

    public QHistoricoMemorandoEntity(Path<? extends HistoricoMemorandoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHistoricoMemorandoEntity(PathMetadata metadata) {
        super(HistoricoMemorandoEntity.class, metadata);
    }

}

