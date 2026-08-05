public class Bicicleta {

    //Atributos

    public String cor;
    public Boolean possuiCesta;
    public Boolean possuiCampainha;

    @Override
    public String toString() {
        return "Bicicleta -> " +
                "Cor: " + cor +
                ", Possui cesta: " + possuiCesta +
                ", Possui campainha: " + possuiCampainha;
    }

    //construtor1
    public Bicicleta(String cor, Boolean possuiCesta, Boolean possuiCampainha) {
        this.cor = cor;
        this.possuiCesta = possuiCesta;
        this.possuiCampainha = possuiCampainha;
    }

    //construtor2
    public Bicicleta(String cor, Boolean possuiCampainha) {
        this.cor = cor;
        this.possuiCampainha = possuiCampainha;
    }

    //metodos
    public String pedalar(){
        return "Pedalando...";
    }

    public String frear(){
        return "Freando...";
    }

    public String tocarCampainha(){
        return "jing jing";
    }
}
