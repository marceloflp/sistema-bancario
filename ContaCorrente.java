package Banco;

public class ContaCorrente extends Conta{
	private double limiteChequeEspecial;
	
	public ContaCorrente(int num) {
		super(num);
		this.limiteChequeEspecial = 400;
	}
	
	//Saca um valor da conta verificando se está no limite do cheque especial
	@Override
    public void saque(double valor) {
        if (valor > 0 && (getSaldo() - valor) >= -limiteChequeEspecial) {
        	super.saque(valor); 
        } else {
            System.err.println("ContaCorrente.saque(...): Não é possível sacar valor negativo "
                    + "ou ultrapassar o limite do cheque especial!");
        }
    }
	
	//Retorna o limite do cheque especial
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	//Adiciona um novo limite para o limite do cheque especial
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	//Retorna informações da conta padrão
	@Override
    public String toString() {
        return "Conta Corrente: " + getNumeroConta() + ": Saldo = R$" + String.format("%.2f", getSaldo());
    }
	
}
