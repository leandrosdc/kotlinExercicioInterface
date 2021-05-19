class Impressora {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun imprimir(imprimivel: Imprimivel){
        this.listaImprimivel.add(imprimivel)
    }

    fun lerLista(){
        this.listaImprimivel.forEach(){
            println(it.nome)
        }
    }
}