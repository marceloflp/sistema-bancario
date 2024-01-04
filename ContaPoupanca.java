package Banco;

public class ContaPoupanca extends Conta {
	private double taxa_rendimento;

	public ContaPoupanca(int num) {
		super(num);
		this.taxa_rendimento = 0;
	    if (!this.setTaxaRendimento(this.taxa_rendimento)){
	      this.taxa_rendimento = 0.0;
	    }
	}
	
	//Adiciona taxa de rendimento entre 0 e 1 (PARA PORCENTAGEM) 
	public boolean setTaxaRendimento(double taxa){
	if(taxa > 0 && taxa < 1){
		this.taxa_rendimento = taxa;
		return true;
	}
		return false;
	}
	
	//Calcula o rendimento da conta e adiciona o valor na conta
	public void calcularRendimento() {
        double rendimento = getSaldo() * this.taxa_rendimento;
        deposito(rendimento);
    }
	
	//Retorna informações da conta padrão juntamente com o valor da taxa de redimento (EM PORCENTAGEM)
	@Override
    public String toString() {
        return "Conta Poupança: " + getNumeroConta() + ": Saldo = R$" + String.format("%.2f", getSaldo())
                + ", Taxa de Rendimento = " + this.taxa_rendimento * 100 + "%";
    }
	
}
