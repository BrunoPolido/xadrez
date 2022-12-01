package utills;

public class pecasXadrez {
	public String pecaescolhi;
	public String jogada;
	public String jogadava;

	public void pecasxadrez() {

		switch (pecaescolhi) {
		case "peao":
			pecaescolhi = "peao";
			peao();
			break;
		case "torre":
			pecaescolhi = "torre";
			torre();
			break;
		case "cavalo":
			pecaescolhi = "cavalo";
			cavalo();
			break;
		case "bispo":
			pecaescolhi = "bispo";
			bispo();
			break;
		case "rainha":
			pecaescolhi = "rainha";
			rainha();
			break;
		case "rei":
			pecaescolhi = "rei";
			rei();
			break;
		default:
			pecaescolhi = "Peca Invalida Escolha outra";
			break;
		}

	}

	public void peao() {

		System.out.println(
				"A peca Peao começa na segunda fileira sendo a2 ate h2 pode se mover uma casa por vez em fileiras retas somente para frente");
		System.out.println("No Exemplo do tabuleiro a baixo ela esta sendo indentificada pela Letra P2");
		System.out.println("====== TABULEIRO XADREZ ======");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("  --------------------------");
		System.out.println("8 | A8 B8 C8 D8 E8 F8 G8 H8| 8");
		System.out.println("7 | A7 B7 C7 D7 E7 F7 G7 H7| 7");
		System.out.println("6 | A6 B6 C6 D6 E6 F6 G6 H6| 6");
		System.out.println("5 | A5 B5 C5 D5 E5 F5 G5 H5| 5");
		System.out.println("4 | A5 B5 C5 D5 E5 F5 G5 H4| 4");
		System.out.println("3 | -  -  -  -  -  -  -  - | 3");
		System.out.println("2 | P2 P2 P2 P2 P2 P2 P2 P2| 2");
		System.out.println("1 | A1 B1 C1 D1 E1 F1 G1 H1| 1");
		System.out.println("  --------------------------");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("====== TABULEIRO XADREZ ======");

	}

	public void jogadapeao() {
		switch (jogada) {
		case "a3":
			jogadava = "jogada Valida Movendo peao para A3";
			break;
		case "b3":
			jogadava = "jogada Valida Movendo peao para B3";
			break;
		case "c3":
			jogadava = "jogada Valida Movendo peao para C3";
			break;
		case "d3":
			jogadava = "jogada Valida Movendo peao para D3";
			break;
		case "e3":
			jogadava = "jogada Valida Movendo peao para E3";
			break;
		case "f3":
			jogadava = "jogada Valida Movendo peao para F3";
			break;
		case "g3":
			jogadava = "jogada Valida Movendo peao para G3";
			break;
		case "h3":
			jogadava = "jogada Valida Movendo peao para H3";
			break;
		default:
			jogadava = "Jogada invalida para essa peca";
			break;
		}
	}

	public void torre() {

		System.out.println(
				"A peca Torre começa na primeira fileira sendo a1 e h1 pode se mover quantas casas quiser em linhas retas para qualquer direcao");
		System.out.println("No Exemplo do tabuleiro a baixo ela esta sendo indentificada pela Letra T1");
		System.out.println("====== TABULEIRO XADREZ ======");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("  --------------------------");
		System.out.println("8 | A8 B8 C8 D8 E8 F8 G8 H8| 8");
		System.out.println("7 | A7 B7 C7 D7 E7 F7 G7 H7| 7");
		System.out.println("6 | -  B6 C6 D6 E6 F6 G6 - | 6");
		System.out.println("5 | -  B5 C5 D5 E5 F5 G5 - | 5");
		System.out.println("4 | -  B4 C4 D4 E4 F4 G4 - | 4");
		System.out.println("3 | -  B3 C3 D3 E3 F3 G3 - | 3");
		System.out.println("2 | -  B2 C3 D2 E2 F2 G2 - | 2");
		System.out.println("1 | T1 -  -  -  -  -  -  T1| 1");
		System.out.println("  --------------------------");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("====== TABULEIRO XADREZ ======");

	}

	public void jogadatorre() {
		switch (jogada) {
		case "a2":
			jogadava = "jogada Valida Movendo Torre para A2";
			break;
		case "a3":
			jogadava = "jogada Valida Movendo Torre para A3";
			break;
		case "a4":
			jogadava = "jogada Valida Movendo Torre para A4";
			break;
		case "a5":
			jogadava = "jogada Valida Movendo Torre para A5";
			break;
		case "a6":
			jogadava = "jogada Valida Movendo Torre para A6";
			break;
		case "a7":
			jogadava = "jogada Valida Movendo Torre para A7";
			break;
		case "a8":
			jogadava = "jogada Valida Movendo Torre para A8";
			break;
		case "b1":
			jogadava = "jogada Valida Movendo Torre para B1";
			break;
		case "c1":
			jogadava = "jogada Valida Movendo Torre para C1";
			break;
		case "d1":
			jogadava = "jogada Valida Movendo Torre para A3";
			break;
		case "e1":
			jogadava = "jogada Valida Movendo Torre para E1";
			break;
		case "f1":
			jogadava = "jogada Valida Movendo Torre para F1";
			break;
		case "g1":
			jogadava = "jogada Valida Movendo Torre para G1";
			break;
		case "h2":
			jogadava = "jogada Valida Movendo Torre para H2";
			break;
		case "h3":
			jogadava = "jogada Valida Movendo Torre para H3";
			break;
		case "h4":
			jogadava = "jogada Valida Movendo Torre para H4";
			break;
		case "h5":
			jogadava = "jogada Valida Movendo Torre para H5";
			break;
		case "h6":
			jogadava = "jogada Valida Movendo Torre para H6";
			break;
		case "h7":
			jogadava = "jogada Valida Movendo Torre para H7";
			break;
		case "h8":
			jogadava = "jogada Valida Movendo Torre para H8";
			break;
		default:
			jogadava = "Jogada invalida para essa peca";
			break;
		}
	}

	public void cavalo() {

		System.out.println(
				"A peca Cavalo começa na primeira fileira sendo B1 e G1 pode se mover 3 casas para frente e uma para o lado Igual a Letra L ");
		System.out.println("No Exemplo do tabuleiro a baixo ela esta sendo indentificada pela Letra C1");
		System.out.println("====== TABULEIRO XADREZ ======");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("  --------------------------");
		System.out.println("8 | A8 B8 C8 D8 E8 F8 G8 H8| 8");
		System.out.println("7 | A7 B7 C7 D7 E7 F7 G7 H7| 7");
		System.out.println("6 | A6 B6 C6 D6 E6 F6 G6 H6| 6");
		System.out.println("5 | A5 B5 C5 D5 E5 F5 G5 H5| 5");
		System.out.println("4 | A4 B4 C4 D4 E4 F4 G4 H4| 4");
		System.out.println("3 | -  -  -  D3 E3 -  -  - | 3");
		System.out.println("2 | A2 -  C3 D2 E2 F2 -  H2| 2");
		System.out.println("1 | A1 C1 C1 D1 E1 F1 C1 H1| 1");
		System.out.println("  --------------------------");
		System.out.println("    A  B  C  D  E  F  G  H");
		System.out.println("====== TABULEIRO XADREZ ======");

	}

	public void jogadacavalo() {
		switch (jogada) {
		case "a3":
			jogadava = "Jogada Valida Movendo Cavalo para A3";
			break;
		case "c3":
			jogadava = "Jogada Valida Movendo Cavalo para C3";
			break;
		case "f3":
			jogadava = "Jogada Valida Movendo Cavalo para F3";
			break;
		case "h3":
			jogadava = "Jogada Valida Movendo Cavalo para H3";
			break;
		default:
			jogadava = "Jogada invalida para essa peca";
			break;
		}
	}

	public void bispo() {

		System.out.println(
				"A peca Bispo começa na primeira fileira sendo C1 e F1 pode se mover quantas casas qusier des que seja na diagonal  /  ");
		System.out.println("No Exemplo do tabuleiro a baixo ela esta sendo indentificada pela Letra Bi1");
		System.out.println("====== TABULEIRO XADREZ ======");
		System.out.println("    A  B  C   D  E  F   G  H");
		System.out.println("  --------------------------");
		System.out.println("8 | A8 B8 C8  D8 E8 F8  G8 H8| 8");
		System.out.println("7 | A7 B7 C7  D7 E7 F7  G7 H7| 7");
		System.out.println("6 | A6 B6 C6  D6 E6 F6  G6 - | 6");
		System.out.println("5 | A5 B5 C5  D5 E5 F5  -  H5| 5");
		System.out.println("4 | A4 B4 C4  D4 E4 -   G4 H4| 4");
		System.out.println("3 | -  B3 C3  D3 -  F3  G3 H3| 3");
		System.out.println("2 | A2 -  C3  -  E2 F2  G2 H2| 2");
		System.out.println("1 | A1 B1 Bi1 D1 E1 Bi1 G1 H1| 1");
		System.out.println("  --------------------------");
		System.out.println("    A  B  C   D  E  F   G  H");
		System.out.println("====== TABULEIRO XADREZ ======");

	}

	public void jogadabispo() {
		switch (jogada) {
		case "b2":
			jogadava = "Jogada Valida Movendo Bispo para B2";
			break;
		case "a3":
			jogadava = "jogada Valida Movendo Bispo para A3";
			break;
		case "d2":
			jogadava = "jogada Valida Movendo Bispo para D2";
			break;
		case "e3":
			jogadava = "jogada Valida Movendo Bispo para E3";
			break;
		case "f4":
			jogadava = "jogada Valida Movendo Bispo para F4";
			break;
		case "g5":
			jogadava = "jogada Valida Movendo Bispo para G5";
			break;
		case "g2":
			jogadava = "jogada Valida Movendo Bispo para G2";
			break;
		case "h3":
			jogadava = "jogada Valida Movendo Bispo para H3";
			break;
		case "e2":
			jogadava = "jogada Valida Movendo Bispo para E2";
			break;
		case "d3":
			jogadava = "jogada Valida Movendo Bispo para D3";
			break;
		case "c4":
			jogadava = "jogada Valida Movendo Bispo para C4";
			break;
		case "b5":
			jogadava = "jogada Valida Movendo Bispo para B5";
			break;
		case "a6":
			jogadava = "jogada Valida Movendo Bispo para A6";
			break;
		default:
			jogadava = "Jogada invalida para essa peca";
		}
	}

	public void rainha() {

		System.out.println(
				"A peca Rainha começa na primeira fileira sendo d1 pode se mover quantas casas qusier para qualqeur direçao exeto em L igual ao Cavalo");
		System.out.println("No Exemplo do tabuleiro a baixo ela esta sendo indentificada pela Letra Ra1");
		System.out.println("====== TABULEIRO XADREZ ======");
		System.out.println("    A  B  C   D   E  F  G  H");
		System.out.println("  --------------------------");
		System.out.println("8 | A8 B8 C8  D8  E8 F8 G8 H8| 8");
		System.out.println("7 | A7 B7 C7  D7  E7 F7 G7 H7| 7");
		System.out.println("6 | A6 B6 C6  -   E6 F6 G6 H6| 6");
		System.out.println("5 | A5 B5 C5  -   E5 F5 G5 - | 5");
		System.out.println("4 | -  B4 C4  -   E4 F4 -  H4| 4");
		System.out.println("3 | A3 -  C3  -   E3 -  G3 H3| 3");
		System.out.println("2 | A2 B2 -   -   -  F2 G2 H2| 2");
		System.out.println("1 | -  -  -  Ra1  -  -  -  - | 1");
		System.out.println("  --------------------------");
		System.out.println("    A  B  C   D   E  F  G  H");
		System.out.println("====== TABULEIRO XADREZ ======");

	}

	public void jogadarainha() {

		switch (jogada) {
		case "d2":
			jogadava = "Jogada Valida Movendo Rainha para D2";
			break;
		case "d3":
			jogadava = "Jogada Valida Movendo Rainha para D3";
			break;
		case "d4":
			jogadava = "Jogada Valida Movendo Rainha para D4";
			break;
		case "d5":
			jogadava = "Jogada Valida Movendo Rainha para D5";
			break;
		case "d6":
			jogadava = "Jogada Valida Movendo Rainha para D6";
			break;
		case "d7":
			jogadava = "Jogada Valida Movendo Rainha para D7";
			break;
		case "c1":
			jogadava = "Jogada Valida Movendo Rainha para C1";
			break;
		case "b1":
			jogadava = "Jogada Valida Movendo Rainha para B1";
			break;
		case "a1":
			jogadava = "Jogada Valida Movendo Rainha para A1";
			break;
		case "e1":
			jogadava = "Jogada Valida Movendo Rainha para E1";
			break;
		case "f1":
			jogadava = "Jogada Valida Movendo Rainha para F1";
			break;
		case "g1":
			jogadava = "Jogada Valida Movendo Rainha para G1";
			break;
		case "h18":
			jogadava = "Jogada Valida Movendo Rainha para H1";
			break;
		default:
			jogadava = "Jogada invalida para essa peca";
			break;

		}

	}

	public void rei() {

		System.out.println(
				"A peca rei começa na primeira fileira sendo e1 pode se mover uma casa por vez para qualqeur direçao exeto em L igual ao Cavalo");
		System.out.println("No Exemplo do tabuleiro a baixo ela esta sendo indentificada pela Letra Re1");
		System.out.println("====== TABULEIRO XADREZ ======");
		System.out.println("    A  B  C   D   E   F  G  H");
		System.out.println("  --------------------------");
		System.out.println("8 | A8 B8 C8  D8  E8  F8 G8 H8| 8");
		System.out.println("7 | A7 B7 C7  D7  E7  F7 G7 H7| 7");
		System.out.println("6 | A6 B6 C6  D6  E6  F6 G6 H6| 6");
		System.out.println("5 | A5 B5 C5  D5  E5  F5 G5 H5| 5");
		System.out.println("4 | A4 B4 C4  D4  E4  F4 G4 H4| 4");
		System.out.println("3 | A3 B3 C3  D3  E3  F3 G3 H3| 3");
		System.out.println("2 | A2 B2 C3  -   -   -  G2 H2| 2");
		System.out.println("1 | A1 B1 C1  -  Re1  -  G1 H1| 1");
		System.out.println("  --------------------------");
		System.out.println("    A  B  C   D   E   F  G  H");
		System.out.println("====== TABULEIRO XADREZ ======");

	}

	public void jogadarei() {
		switch (jogada) {
		case "e2":
			jogadava = "Jogada Valida Movendo Rei para E2";
			break;
		case "d2":
			jogadava = "Jogada Valida Movendo Rei para D2";
			break;
		case "d1":
			jogadava = "Jogada Valida Movendo Rei para D1";
			break;
		case "f2":
			jogadava = "Jogada Valida Movendo Rei para F2";
			break;
		case "f1":
			jogadava = "Jogada Valida Movendo Rei para F1";
			break;
		default:
			jogadava = "Jogada invalida para essa peca";

		}

	}
}
