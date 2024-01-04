package Banco;

public class Conta {

	    private double saldo;  // Saldo atual da conta
	    private int numero;    // Numero da conta

	    // Construtor da classe
	    public Conta(int num) {    
	      this.saldo = 0.0;
	      this.numero = num;
	    }

	    // Efetua depósito de um determinado valor
	    public void deposito(double valor) {
	        if (valor > 0) {
	            this.saldo += valor;
	        
	    	} else {
	            System.err.println("Conta.deposito(...): "
	                                + "não é possível depositar valor negativo!");    
	    	}
	    }

	    // Efetua saque de um determinado valor
	    public void saque(double valor) {
	        if (valor > 0) {
	            this.saldo -= valor;    
	        } else {
	            System.err.println("Conta.saque(...): "
	                    + "não é possível sacar valor negativo!");
	        }
	    }

	    // Retorna o saldo da Conta
	    public double getSaldo() {
	      return this.saldo;
	    }

	    // Retorna o número da Conta
	    public int getNumeroConta() {
	      return this.numero;
	    }

	    // Retorna String de informações da Conta
	    public String toString() {
	      return "Conta: " + this.numero + ": " + "Saldo = R$" + String.format("%.2f",this.saldo);    
	    }

	    // Exibe informações da Conta
	    public final void print() {
	        //Não sobrescreva este método,
	        //sobrescreva o método toString()
	        System.out.println( this.toString() );    
	    }    
}
