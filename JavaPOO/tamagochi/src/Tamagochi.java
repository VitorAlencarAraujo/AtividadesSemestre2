public class Tamagochi {

    //Atribubos
    private String nome;
    private Integer fome;
    private Integer energia;
    private String humor;

    //nome
    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    //fome
    public Integer getFome() {
        return fome;
    }

    public void setFome(Integer fome) {

        if (fome < 0) {
            this.fome = 0;
            System.out.println("Não pode ser menor que 0");
        } else if (fome > 100) {
            this.fome = 100;
            System.out.println("parou no 100");
        } else {
            this.fome = fome;
        }
    }

    //energia
    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        if (energia < 0) {
            this.energia = 0;
            System.out.println("Não pode ser menor que 0");
        } else if (energia > 100) {
            this.energia = 100;
            System.out.println("parou no 100");
        } else {
            this.energia = energia;
        }
    }



    //humor
    public String getHumor() {
        int media = (fome + energia) / 2;
        if (media > 50){
            return humor = "FELIZ";
        }
        else {
            return humor = "TRISTE";
        }
    }

    public Tamagochi(String nome) {
        this.nome = nome;
    }
}

