package banco;

public class Main {
	
	public static void main(String[] args) {
		conta cc = new ContaCorrente();
		conta poupanca = new ContaPoupança();
		
		cc.imprimirExtrato();
		poupança.imprimirEtrato();
		
	}
	

}