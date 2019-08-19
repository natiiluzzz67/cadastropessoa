public class Endereco {

private Integer id;
private String rua;
private Integer numero;
private String bairro;


//Método construtor vazio
//Os métodos construtores servem para iniciar atributos e
//executar ações iniciais do objeto
public Endereco() {
super();

}



//Método construtor com campos
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