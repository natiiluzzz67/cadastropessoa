
public class Main {
public static void main(String[] args) {



Pessoa pessoa1 = new Pessoa(1, "Izabela", 21, "feminino");

Pessoa pessoa2 = new Pessoa(2, "Gabriel", 22, "masculino");

Pessoa pessoa3 = new Pessoa(3, "Maria", 12, "feminino");

Endereco endereco1 = new Endereco(1, "Rua vinte de agosto", 190, "Brejaru");

Endereco endereco2 = new Endereco(2, "Rua Mario Quinta", 760, "Jardim Eldorado");

Endereco endereco3 = new Endereco(3, "Rua dos pinheiros", 001, "Campinas");




System.out.println("O nome da pessoa1 � " + pessoa1.getNome() + ", ela tem " + pessoa1.getIdade() + " anos e � do sexo: " + pessoa1.getSexo() + ". " + "Ela mora no bairro: " + endereco1.getBairro() + ", na rua: " + endereco1.getRua() + " N#" + endereco1.getNumero());

System.out.println("O nome da pessoa2 � " + pessoa2.getNome() + ", ela tem " + pessoa2.getIdade() + " anos e � do sexo: " + pessoa2.getSexo() + ". " + "Ela mora no bairro: " + endereco2.getBairro() + ", na rua: " + endereco2.getRua() + " N#" + endereco2.getNumero());

System.out.println("O nome da pessoa3 � " + pessoa3.getNome() + ", ela tem " + pessoa3.getIdade() + " anos e � do sexo: " + pessoa3.getSexo() + ". " + "Ela mora no bairro: " + endereco3.getBairro() + ", na rua: " + endereco3.getRua() + " N#" + endereco3.getNumero());


}
}
