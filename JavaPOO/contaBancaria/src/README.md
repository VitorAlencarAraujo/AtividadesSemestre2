# ContaBancaria

Este projeto é uma aplicação simples de Conta Bancária desenvolvida em Java, permitindo ao usuário realizar operações básicas de uma conta através do terminal.

Ao iniciar o programa, o usuário informa o nome do titular e o limite da conta. Em seguida, pode realizar depósitos, saques e consultar o saldo.

Regras de negócio:

Os atributos titular, saldo e limite devem ser private.
O saldo não pode ser alterado diretamente.
O saldo inicial deve ser 0.
O método depositar(double valor) deve aceitar apenas valores maiores que 0.
O método sacar(double valor) deve verificar se existe saldo suficiente e não pode permitir que o saldo fique negativo.
O limite deve representar um valor adicional que pode ser utilizado caso o saldo não seja suficiente.
Não deve existir setSaldo().
O saldo deve ser consultado através de getSaldo().
