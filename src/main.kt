fun main(){
    var a = Foto("Foto","Foto")
    var b = Documento("Documento","Documento")
    var c = Contrato("Contrato", "Contrato")
    var d = Impressora()
    d.imprimir(a)
    d.imprimir(b)
    d.imprimir(c)
    d.lerLista()
}