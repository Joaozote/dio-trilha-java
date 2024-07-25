public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "112.133.092-62");
		Cliente luiz = new Cliente("Luiz", "010.502.130-21");
        
		
		Conta ccLuiz = new ContaCorrente(luiz);
		Conta poupancaJoao = new ContaPoupanca(joao);

		ccLuiz.depositar(400);
		poupancaJoao.depositar(500);
		
        ccLuiz.transferir(150, poupancaJoao);
        
        ccLuiz.imprimirExtrato();
		poupancaJoao.imprimirExtrato();
	}

}
