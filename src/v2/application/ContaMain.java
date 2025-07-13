package v2.application;

import java.util.Locale;
import v2.entities.ContaPoupanca;

public class ContaMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		
		ContaPoupanca cp1 = new ContaPoupanca("Rodrigo", 1003, 0, 0 );

		cp1.depositar(1000.0);
		cp1.setRendimento(0.5);
		cp1.aplicarRendimentoMensal();
		System.out.print(cp1);




		

	}

}
