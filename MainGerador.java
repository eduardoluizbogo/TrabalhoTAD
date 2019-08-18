package TrabalhoTADs;

import java.util.Scanner;

public class MainGerador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao, numIni = 0, numFim = 0;
		
		int quantdados=0, tamanhodados=0;
		
		Gerador gera = new Gerador();
		System.out.println(":::... Gerador de Números Aleatórios ...:::\n"
				+ "\nPara continuar, escolha uma das funções:" 
		        + "\n[1] - Gerar um número aleatório qualquer;"
				+ "\n[2] - Gerar um número aleatório a partir de um intervalo definido;"
				+ "\n[3] - Cara ou Coroa;"
				+ "\n[4] - Lançar dados.");
		System.out.print("Opção-> ");
		opcao = entrada.nextInt();
		System.out.println(" ");
		
		switch(opcao){
		case 1:
			System.out.print("O número gerado foi: ");
			gera.aleatorioQualquer();
			break;
		case 2:
			do {
			System.out.print("Informe o número inicial: ");
			numIni = entrada.nextInt();
			if(numIni < 0) {
				System.out.println("Número informado não pode ser negativo.");
				System.out.println("Repita a operação");
			 } 
			}while (numIni < 0);
			
			do {
			System.out.print("Informe o número final: ");
			numFim = entrada.nextInt();
			if (numFim  < numIni) {
				System.out.println("O segundo número deve ser maior que o primeiro.");
				System.out.println("Repita a operação");
			   } 
			   	
			} while (numFim  < numIni);
			
			System.out.print("Número gerado no intervalo informado: ");
			Gerador.aleatorioIntervalo(numIni, numFim);
			 
			break;
		case 3:
			do {
				System.out.println("Escolha:"
						+ "\n[1] - Cara"
						+ "\n[2] - Coroa");
				System.out.print("Opção-> ");
				numIni = entrada.nextInt();
				if(numIni< 1 || numIni > 2) {
					System.out.println("Opção Inválida");					
					}
			}while(numIni < 1 || numIni > 2);
			
			do {
				System.out.print("Informe quantas vezes deseja jogar: ");
				numFim = entrada.nextInt();
				if(numFim < 1) {
					System.out.println("Opção Inválida");					
					}
			}while(numFim < 1);
			Gerador.caraOuCoroa(numIni, numFim);
			
			break;
		case 4:
			int soma=0;
			System.out.println("Voce vai lancar dados --> ");
			
			System.out.print("Quantos dados desejas lancar? --> ");
			quantdados = entrada.nextInt();
			
			System.out.print("Selecione o dado d4, d6, d8, d10, d12,d20, d60, d100 --> ");
			tamanhodados = entrada.nextInt();
			
			switch(tamanhodados) {
			case 4: 
				numIni = 0;
				numFim = 5;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			case 6: 
				numIni = 0;
				numFim = 7;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			case 8: 
				numIni = 0;
				numFim = 9;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			case 10: 
				numIni = 0;
				numFim = 11;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			case 12: 
				numIni = 0;
				numFim = 13;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			case 20: 
				numIni = 0;
				numFim = 21;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			case 60: 
				numIni = 0;
				numFim = 61;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			case 100: 
				numIni = 0;
				numFim = 101;
				Gerador.dados(numIni, numFim, quantdados);
				break;
			default:
				System.out.println("Opcao invalida!");
			}
			
			
			break;
			default:
				System.out.println("Opção inválida!");
		}
		
		entrada.close();

	}

}
