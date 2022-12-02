import java.util.Scanner;

import utills.pecasXadrez;

public class jogoXadrez {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pecasXadrez pecaxa = new pecasXadrez();


		System.out.println("====== TABULEIRO XADREZ ======");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("  --------------------------");
		System.out.println("8 | A8 B8 C8 D8 E8 F8 G8 H8| 8");
		System.out.println("7 | A7 B7 C7 D7 E7 F7 G7 H7| 7");
		System.out.println("6 | A6 B6 C6 D6 E6 F6 G6 H6| 6");
		System.out.println("5 | A5 B5 C5 D5 E5 F5 G5 H5| 5");
		System.out.println("4 | A4 B4 C4 D4 E4 F4 G4 H4| 4");
		System.out.println("3 | A3 B3 C3 D3 E3 F3 G3 H3| 3");
		System.out.println("2 | A2 B2 C2 D2 E2 F2 G2 H2| 2");
		System.out.println("1 | A1 B1 C1 D1 E1 F1 G1 H1| 1");
		System.out.println("  --------------------------");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("====== TABULEIRO XADREZ ======");

		System.out.println("Digite o nome da Peca que deseja Jogar");
		pecaxa.pecaescolhi = sc.next();

		pecaxa.pecasxadrez();

		System.out.printf("Voce Escolheu a Peça = %s %n", pecaxa.pecaescolhi);

		System.out.println("Digite a jogada que deseja exemplo a4");
		pecaxa.jogada = sc.next();
		
		switch (pecaxa.pecaescolhi) {
		case "peao":
			pecaxa.jogadapeao();
			break;
		case "torre":
			pecaxa.jogadatorre();
			break;
		case "cavalo":
			pecaxa.jogadacavalo();
			break;
		case "bispo":
			pecaxa.jogadabispo();
			break;
		case "rainha":
			pecaxa.jogadarainha();
			break;
		case "rei":
			pecaxa.jogadarei();
			break;
		default:
			System.out.println("Peça Invalida");
		}
		System.out.printf(pecaxa.jogadava);

		sc.close();
		
		/*
		if(pecaxa.pecaescolhi == "peao") {
			pecaxa.jogadapeao();
		}else if(pecaxa.pecaescolhi == "torre") {
			pecaxa.jogadatorre();
		}else if(pecaxa.pecaescolhi == "cavalo") {
			pecaxa.jogadacavalo();
		}else if(pecaxa.pecaescolhi == "bispo") {
			pecaxa.jogadabispo();
		}else if(pecaxa.pecaescolhi == "rainha") {
			pecaxa.jogadarainha();
		}else if(pecaxa.pecaescolhi == "rei") {
			pecaxa.jogadarei();
		}
		
		 * if(pecaxa.pecaescolhi == 'p') { pecaxa.peao(); }else if(pecaxa.pecaescolhi ==
		 * 't') { pecaxa.torre(); }else if(pecaxa.pecaescolhi == 'c') { pecaxa.cavalo();
		 * }else if(pecaxa.pecaescolhi == 'b') { pecaxa.bispo(); }else
		 * if(pecaxa.pecaescolhi == 'r') { pecaxa.rainha(); }else if(pecaxa.pecaescolhi
		 * == 'k') { pecaxa.rei(); }
		 * 
		 */
	}
}
