void main(){

    Double deposito;
    Double saque;

    ContaBancaria contaBancaria = new ContaBancaria(0.0);

    while (true) {
        System.out.println("\n---ContaBancaria---");
        System.out.println("Seu saldo: " + contaBancaria.getSaldo());

        System.out.println("""
                O que você deseja fazer?
                1 - Depositar
                2 - Sacar
                3 - Consultar saldo
                0 - Sair""");

        String opcao = IO.readln();

        if (opcao.equals("0")){
            System.out.println("Saindo...");
            break;
        }

        switch (opcao) {

            case "1":
                deposito = Double.parseDouble(IO.readln("Informe o valor do deposito:"));
                contaBancaria.depositar(deposito);

                System.out.println("Novo saldo: " + contaBancaria.getSaldo());
                break;

            case "2":
                saque = Double.parseDouble(IO.readln("Informe o valor do saque:"));
                contaBancaria.sacar(saque);

                System.out.println("Novo saldo: " + contaBancaria.getSaldo());
                break;

            case "3":
                System.out.println("Seu saldo atual: " + contaBancaria.getSaldo());
                break;
        }
    }
}