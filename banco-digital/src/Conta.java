public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
        this.saldo = 0;
	}

	public void sacar(double valor) {
		if (valor <= 0)
            throw new SaqueException("Saque não realizado: Valor Inválido!");
        else if (valor >= this.saldo) 
            throw new SaldoException("Saque não realizado: Saldo insuficiente!");    
        else
            saldo -= valor;
            
        
	}

	public void depositar(double valor) {
        if (valor <= 0) 
            throw new DepositoException("Depósito não realizado: Valor Inválido");         
        else 
            saldo += valor;

	}

	public void transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else 
            throw new SaldoException("Transferência não realizada: Saldo Insuficiente");
        
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Cpf: %s", this.cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    public abstract void imprimirExtrato();
}
