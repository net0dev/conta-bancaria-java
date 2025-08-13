package entities;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }    

    public double saldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor >= 1.0) {
            this.saldo += valor;
            System.out.printf("Depósito realizado com sucesso no valor de R$ %.2f reais %n", valor);

        } else {
            System.out.println("Valor mínimo para depósito é de R$ 1 real. %n");

        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Saque realizado com sucesso no valor de R$ %.2f reais %n", valor);
        } else {
            System.out.printf("Valor de saque insuficiente. Saldo atual %.2f reais %n", this.saldo);
        }
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }

    public void transferir(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.adicionarSaldo(valor);
            System.out.printf("Transferência de R$ %.2f reais para %s realizada com sucesso. %n", valor, destino.getTitular());

        } else {
            System.out.printf("Transação insuficente, saldo atual R$ %.2f reais %n", this.saldo);

        }

    }

    

    

   

}
