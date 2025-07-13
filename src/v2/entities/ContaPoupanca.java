package v2.entities;

public class ContaPoupanca extends Conta {
    private double rendimento;
    
    public ContaPoupanca(String titular, int numero, double saldo, double rendimento) {
        super(titular, numero, saldo);
        this.rendimento = rendimento;

    }
    public double getRendimento(){
        return rendimento;
    }

    public void setRendimento(double rendimento){
        this.rendimento = rendimento;
    }

    public void aplicarRendimentoMensal(){
        double ganho = getSaldo() * (rendimento/100.0);
        super.adicionarSaldo(ganho);
        System.out.printf("Rendimento aplicado: R$ %.2f reais%n", ganho);
    

    }

    @Override
    public  String toString(){
        return super.toString() + String.format("\nRendimento mensal: %.2f%%",rendimento);
     
    }



    
}
