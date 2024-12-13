package conta.model;

public class ContaCorrente extends Conta {

	// Atributos

	private float limite;

	// Método Especial - Método Construtor

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	// Polimorfismo de Sobrecarga
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
	}
	
	

	// Métodos de Acesso

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insufuciente");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// polimorfismo de Sobrescrita
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
