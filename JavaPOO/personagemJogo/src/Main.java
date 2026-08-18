void main (){
    Integer danoRecebido;
    Integer descanso;
    Integer ataque;

    Personagem personagem = new Personagem("Steve", 100, 100);

    while (true) {
        System.out.println("""
                O que você deseja fazer:
                1 - receber dano
                2 - atacar""");

        String opcao = IO.readln();

        if (opcao.equals("0")){
            System.out.println("Saindo...");
            break;
        }

        switch (opcao) {

            case "1":
                danoRecebido = Integer.parseInt(IO.readln("Dano recebido:"));
                personagem.receberDano(danoRecebido);

                IO.println("Nova vida: " + personagem.getVida());
                break;

            case "2":
                System.out.println("Você atacou!!!");
                personagem.atacar();
                System.out.println("Nova energia: " + personagem.getEnergia());
        }
    }
}