import api from '@/core/apiclient'
import {actionTypes, mutationTypes, produto} from '@/core/constants'

export default {

    async [actionTypes.COMUM.BUSCAR_LINK_EDITAR_USUARIO]({ state }) {
        const payload = {
            uri: window.location.origin + window.location.pathname,
            produto: state.loki.product.name
        }
        const { data } = await api.usuario.editar(payload)
        return data
    },

    [actionTypes.COMUM.BUSCAR_LINK_SIGAPATRIMONIO]() {
        return `${window.location.origin}/${produto.URL_SIGAPATRIMONIO}`
    },

    async [actionTypes.COMUM.BUSCAR_PRODUTO_POR_NOME]({ commit }) {
        const { data } = await api.produto.buscarPorNome(produto.NOME)
        commit(mutationTypes.COMUM.SET_PRODUTO, data)
    },

    async [actionTypes.COMUM.BUSCAR_USUARIO_LOGADO]({ commit, state }) {
        const produtoId = state.loki.product.id
        const { data } = await api.usuario.buscarLogado(produtoId)
        commit(mutationTypes.COMUM.SET_USUARIO_LOGADO, data)
    },

    async [actionTypes.COMUM.ATUALIZAR_SESSAO_DOMINIO]({ state }) {
        const produtoId = state.loki.product.id
        await api.usuario.atualiazarSessaoDominio(produtoId, 'ESTRUTURA_ORGANIZACIONAL')
    },

    async [actionTypes.COMUM.BUSCAR_FORNECEDORES](context, cnpj) {
        const { data } = await api.fornecedor.buscarPorCNPJ(cnpj)
        return data
    },

    async [actionTypes.COMUM.BUSCAR_FORNECEDOR_POR_ID](context, id) {
        const { data } = await api.fornecedor.buscarPorId(id)
        return data
    },

    async [actionTypes.COMUM.BUSCAR_SETORES](context, orgao) {
        const { data } = await api.setor.buscarTodos(orgao)
        return data
    },

    async [actionTypes.COMUM.BUSCAR_TODOS_ORGAOS]() {
        const { data } = await api.orgao.buscarTodos()
        return data
    },

    async [actionTypes.COMUM.BUSCAR_PARAMETROS]({commit}) {
        const { data } = await api.produto.buscarParametros()
        commit(mutationTypes.COMUM.SET_PARAMETROS, data)
        return data
    },
    async [actionTypes.COMUM.BUSCAR_FUSO_HORARIO]() {
        const { data } = await api.fusoHorario.buscarFusoHorario()
        return data.fusoHorario
    }
}
