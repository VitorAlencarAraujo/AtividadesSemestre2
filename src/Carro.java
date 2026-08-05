public class Carro {

    //Atributos
    public String cor;
    public String modelo;
    public String marca;
    public Integer ano;

    @Override
    public String toString() {
        return "Carro ->" + ' ' +
                "cor: " + cor +
                ", modelo: " + modelo +
                ", marca: " + marca +
                ", ano: " + ano;

    }

    //Construtor1
    public Carro(String cor, String modelo, String marca, Integer ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    //Construtor2
    public Carro(String cor, String modelo) {
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
