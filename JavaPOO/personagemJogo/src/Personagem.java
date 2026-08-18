public class Personagem {

    //Atributos
    private String nome;
    private Integer vida;
    private Integer energia;
    private Integer nivel;


    //Metodo Para Receber Dano
    public void receberDano(Integer danoRecebido) {

        if (danoRecebido > vida) {
            this.vida = 0;
        }

        else {
            this.vida -= danoRecebido;
        }
    }

    public Integer getVida(){
        return vida;
    }

    //Metodo Atacar
    private void

    public Integer getEnergia(){
        return energia;
    }

    //Metodo Para Descansar
    public void descansar(Integer descanso){

    }





    public Personagem(String nome, Integer vida, Integer energia) {
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
    }
}
