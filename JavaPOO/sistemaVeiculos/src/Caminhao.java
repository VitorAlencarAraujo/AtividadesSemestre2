public class Caminhao {

    //Atributos
    public String cor;
    public Float largura;
    public Float altura;

    @Override
    public String toString() {
        return "Caminhão -> " +
                "Cor: " + cor +
                ", Largura: " + largura +
                ", Altura: " + altura;
    }

    //contrutor1
    public Caminhao(String cor, Float largura, Float altura) {
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
    }

    //contrutor2
    public Caminhao(String cor, Float altura) {
        this.cor = cor;
        this.altura = altura;
    }

    //metodos

    public String ligar(){
        return "Ligado";
    }

    public String desligar(){
        return "Desligado";
    }

    public String acelerar(){
        return "Acelerando";
    }

    public String frear(){
        return "Freando";
    }

    public String buzinar(){
        return "fonfon";
    }
}
