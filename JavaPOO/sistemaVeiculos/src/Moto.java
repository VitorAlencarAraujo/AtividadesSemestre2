public class Moto {

    //Atributos
    public String cor;
    public Float preco;
    public String modelo;

    @Override
    public String toString() {
        return "Moto -> " +
                "Cor: " + cor +
                ", Preço: " + preco +
                ", Modelo: " + modelo;
    }
//Construtor1

    public Moto(String cor, Float preco, String modelo) {
        this.cor = cor;
        this.preco = preco;
        this.modelo = modelo;
    }

    //Construtor2

    public Moto(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    //metodos
    public String acelerar(){
        return "Acelerando";
    }

    public String frear(){
        return "Freando";
    }
}
