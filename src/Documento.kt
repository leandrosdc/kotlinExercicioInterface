class Documento(var nomeDoc:String, var tipoDoc:String):Imprimivel {
    override var nome:String = nomeDoc
    override var tipoDocumento:String = tipoDoc

    override fun imprimir(){
        println("Eu sou um documento word $tipoDocumento $nome")
    }
}