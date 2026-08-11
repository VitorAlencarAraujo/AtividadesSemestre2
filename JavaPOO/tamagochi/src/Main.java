void main(){

    Tamagochi bichinho1 = new Tamagochi("tamagochi");

    System.out.println("---" + bichinho1.getNome() + "---");

    //fome
    bichinho1.setFome(10);
    System.out.println("Nova fome: " + bichinho1.getFome());

    bichinho1.setEnergia(10);
    System.out.println("Energia: " + bichinho1.getEnergia());



    System.out.println(bichinho1.getHumor());
}