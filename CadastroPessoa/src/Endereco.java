public class Endereco {

private Integer id;
private String rua;
private Integer numero;
private String bairro;


//M�todo construtor vazio
//Os m�todos construtores servem para iniciar atributos e
//executar a��es iniciais do objeto
public Endereco() {
super();

}



//M�todo construtor com campos
public Endereco(Integer id, String rua, Integer numero, String bairro) {
super();
this.id = id;
this.rua = rua;
this.numero = numero;
this.bairro = bairro;
}




public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getRua() {
return rua;
}
public void setRua(String rua) {
this.rua = rua;
}
public Integer getNumero() {
return numero;
}
public void setNumero(Integer numero) {
this.numero = numero;
}
public String getBairro() {
return bairro;
}
public void setComplemento(String bairro) {
this.bairro = bairro;
}


}