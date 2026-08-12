public class ContaBancaria {

    //Atributos
    private String titular;
    private Double saldo;
    private Double limite;
    private Double deposito;
    private Double saque;

    public Double getDeposito(){
        return deposito;
    }

    public Double getSaldo() {
        return saldo;
    }

    //Metodo depositar
    public Double depositar(Double deposito){
        if (deposito > 0){
            this.saldo += deposito;
        }
        return saldo;
    }

    //Metodo Sacar
    public Double sacar(Double saque){
        if (saque > 0 && saque < saldo){
            this.saldo -= saque;
        }
        return saldo;
    }

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }
}
