public class EntendendoFuncao {

	public static void saudacao() {
		System.out.println("Olá, tudo bem?");
	}

	public static void elogia(String nome) {
		System.out.println("Você é muito legal, " + nome);
	}

	public static void main(String[] args) {
		System.out.println("Este codigo está na main Antes de chamar a função");
		saudacao(); // chamada à função
		saudacao();
		saudacao();
		saudacao();
		System.out.println("Este codigo esta na main Depois de chamar a função");
		elogia("Gabriel");
		String pao = "Pão é doce, não nome";
		elogia(pao);
	}

}
