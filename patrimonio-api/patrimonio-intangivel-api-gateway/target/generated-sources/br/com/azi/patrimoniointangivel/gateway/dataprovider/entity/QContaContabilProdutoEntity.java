package br.com.azi.patrimoniointangivel.gateway.dataprovider.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QContaContabilProdutoEntity is a Querydsl query type for ContaContabilProdutoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QContaContabilProdutoEntity extends EntityPathBase<ContaContabilProdutoEntity> {

    private static final long serialVersionUID = -1945586681L;

    public static final QContaContabilProdutoEntity contaContabilProdutoEntity = new QContaContabilProdutoEntity("contaContabilProdutoEntity");

    public final NumberPath<Long> contaContabilId = createNumber("contaContabilId", Long.class);

    public final NumberPath<Long> produtoId = createNumber("produtoId", Long.class);

    public QContaContabilProdutoEntity(String variable) {
        super(ContaContabilProdutoEntity.class, forVariable(variable));
    }

    public QContaContabilProdutoEntity(Path<? extends ContaContabilProdutoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContaContabilProdutoEntity(PathMetadata metadata) {
        super(ContaContabilProdutoEntity.class, metadata);
    }

}

