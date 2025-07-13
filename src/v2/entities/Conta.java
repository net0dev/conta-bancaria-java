package v2.entities;

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

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor >= 1.0) {
			this.saldo += valor;
			System.out.printf("Deposito realizado: R$ %.2f reais%n", valor);
		} else {
			System.out.println("Deposite um valor a partir de R$ 1");
		}

	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			System.out.printf("Você sacou: R$ %.2f reais%n", valor);
		} else {
			System.out.printf("Saque de:R$ %.2f não autorizado. %nSaldo disponível: R$ %.2f reais%n", valor, this.saldo);
		}
	}
	protected void adicionarSaldo( double valor) {
		this.saldo+= valor;
	

	}

	public void transferir(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.adicionarSaldo(valor);
			System.out.printf("Tranferência de: R$ %.2f reais realizada com sucesso!%n", valor, destino.getTitular());
		} else {
			System.out.printf("Tranferência de: R$ %.2f reais não realizada. Saldo insuficiente!%n", valor);
		}

	}

	public String toString(){
		return String.format("Conta %d, Titular: %s, Saldo: R$ %.2f", numero,titular,saldo);

		

	}
}
