public class EntendendoFuncao {

	public static void saudacao() {
		System.out.println("Ol�, tudo bem?");
	}

	public static void elogia(String nome) {
		System.out.println("Voc� � muito legal, " + nome);
	}

	public static void main(String[] args) {
		System.out.println("Este codigo est� na main Antes de chamar a fun��o");
		saudacao(); // chamada � fun��o
		saudacao();
		saudacao();
		saudacao();
		System.out.println("Este codigo esta na main Depois de chamar a fun��o");
		elogia("Gabriel");
		String pao = "P�o � doce, n�o nome";
		elogia(pao);
	}

}
