# Sistema Bancário

Este repositório contém uma implementação simples de um sistema bancário em Java. O código inclui três classes principais: `Banco`, `Conta`, `ContaCorrente`, e `ContaPoupanca`. O programa principal está na classe `Main`. A seguir, uma descrição das principais funcionalidades e estrutura do código.

## Estrutura de Arquivos

- **Banco:**
  - `Banco.java`: Esta classe representa a entidade do banco, que gerencia uma lista de contas, realiza operações como abrir, fechar, e pagar boletos, além de atualizar as contas.

- **Conta:**
  - `Conta.java`: A classe base `Conta` possui os atributos comuns a todas as contas, como saldo e número. Contém métodos para depósito, saque, e exibição das informações.

- **Conta Corrente:**
  - `ContaCorrente.java`: Subclasse de `Conta`, representa uma conta corrente com um limite de cheque especial. Adiciona a funcionalidade de utilizar o cheque especial.

- **Conta Poupança:**
  - `ContaPoupanca.java`: Subclasse de `Conta`, representa uma conta poupança com uma taxa de rendimento. Adiciona a funcionalidade de calcular o rendimento da conta.

- **Main:**
  - `Main.java`: O programa principal que instancia o banco, algumas contas de teste e realiza operações como abrir contas, depositar, sacar, calcular rendimento, pagar boletos, fechar contas e exibir informações.

## Funcionalidades Principais

1. **Abertura de Contas:**
   - `abrirConta(Conta conta)`: Adiciona uma conta à lista de contas do banco.

2. **Fechamento de Contas:**
   - `fecharConta(int numeroConta)`: Fecha uma conta específica pelo número.

3. **Atualização de Contas:**
   - `atualizarContas()`: Atualiza as contas, calculando rendimento para contas poupança e verificando condições especiais para contas correntes.

4. **Pagamento de Boleto:**
   - `pagarBoleto(int numeroConta, double valor)`: Realiza o pagamento de um boleto, deduzindo o valor da conta especificada.

5. **Exibição de Contas:**
   - `mostrarContas()`: Exibe as informações de todas as contas no banco.

## Como Utilizar

1. Clone o repositório para sua máquina local:

   ```
   git clone https://github.com/marceloflp/sistema-bancario.git
   ```

2. Abra o projeto em seu ambiente de desenvolvimento Java preferido.

3. Execute a classe `Main` para testar as funcionalidades do sistema bancário.
