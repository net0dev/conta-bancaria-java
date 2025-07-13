package v1.application;

import java.util.Locale;
import v1.entities.Conta;

public class ContaMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Conta cc1 = new Conta("Neto", 1001, 0);
		Conta cc2 = new Conta("Lucas",1002, 0);

		cc1.depositar(100.00);
		cc1.sacar(40.0);
		cc1.transferir(cc2, 10);
		cc1.exibirDados();
		

	}

}
