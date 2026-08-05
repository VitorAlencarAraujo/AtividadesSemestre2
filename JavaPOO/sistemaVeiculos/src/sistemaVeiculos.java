void main(){

    Carro carro = new Carro("Branco", "Corolla", "Toyota",2022);
    Caminhao caminhao = new Caminhao("Preto", 2.5f, 5.20f);
    Moto moto = new Moto("Preto", 55000.0f, "CB 500F");
    Bicicleta bicicleta = new Bicicleta("Azul", true, true);

    System.out.println("---- SISTEMA VEÍCULOS ----");
    System.out.println(carro);
    System.out.println(caminhao);
    System.out.println(moto);
    System.out.println(bicicleta);
}