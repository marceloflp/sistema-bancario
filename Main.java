package Banco;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();

        //Criando algumas contas de teste
        Conta conta1 = new Conta(10876);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(25487);
        ContaCorrente contaCorrente1 = new ContaCorrente(32965);

        //Abrindo as contas no banco
        banco.abrirConta(conta1);
        banco.abrirConta(contaPoupanca1);
        banco.abrirConta(contaCorrente1);

        // Realizando algumas operações (deposito) nas contas de teste
        conta1.deposito(1000);
        contaPoupanca1.deposito(2000);
        contaCorrente1.deposito(3000);
        
        //Utilizando o cheque especial
        contaCorrente1.saque(3000); //Zerando o saldo da conta
        contaCorrente1.saque(300); //Utilizando o cheque especial (Saldo ficará R$-300,00)
        contaCorrente1.print();
        
        // Adicionando taxa de Rendimento de 15%
        contaPoupanca1.setTaxaRendimento(0.15);

        //Calculando taxa de rendimento e adicionando na conta
        contaPoupanca1.calcularRendimento();
        
        //Deixando o saldo da conta corrente positivo pagando o cheque especial
        contaCorrente1.deposito(500); //Saldo ficará R$200
        
        //Atualizando as contas
        banco.atualizarContas();
        
        //Pagando boleto com a conta corrente retirando $50 da conta
        banco.pagarBoleto(32965, 50); 

        //Fechando uma conta
        banco.fecharConta(10876);

        //Exibindo as informações das contas
        banco.mostrarContas();

	}

	
}
