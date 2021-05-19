class Contrato(var nomeDoc:String, var tipoDoc:String):Imprimivel {
    override var nome:String = nomeDoc
    override var tipoDocumento:String = tipoDoc

    override fun imprimir(){
        println("Eu sou um contrato legal $tipoDocumento $nome")
    }
}