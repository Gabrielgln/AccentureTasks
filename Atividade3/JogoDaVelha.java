import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tabuleiro = { 
            {" "," "," "},
            {" "," "," "},
            {" "," "," "}};

        String jogadorAtual = "X";
        boolean jogoAtivo = true;
        int jogadas = 0;
        
        while(jogoAtivo){
            imprimirTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogadorAtual + ", digite a linha (0, 1, 2): ");
            int linha = scanner.nextInt();
            System.out.println("Jogador " + jogadorAtual + ", digite a coluna (0, 1, 2): ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || !tabuleiro[linha][coluna].equals(" ")) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("O jogo empatou!");
                jogoAtivo = false;
            } else {
                jogadorAtual = jogadorAtual.equals("X") ? "O" : "X";
            }
        }
        scanner.close(); 
    }

    public static boolean verificarVencedor(String[][] tabuleiro, String jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0].equals(jogador) && tabuleiro[i][1].equals(jogador) && tabuleiro[i][2].equals(jogador)) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i].equals(jogador) && tabuleiro[1][i].equals(jogador) && tabuleiro[2][i].equals(jogador)) {
                return true;
            }
        }

        if (tabuleiro[0][0].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][2].equals(jogador)) {
            return true;
        }

        if (tabuleiro[0][2].equals(jogador) && tabuleiro[1][1].equals(jogador) && tabuleiro[2][0].equals(jogador)) {
            return true;
        }

        return false;
    }

    public static void imprimirTabuleiro(String[][] tabuleiro){
        System.out.print("\n\n 0   1    2\n\n");
        for (int posicao1 = 0; posicao1 < 3; posicao1++) {
            for (int posicao2 = 0; posicao2 < 3; posicao2++) {
                System.out.print(" " + tabuleiro[posicao1][posicao2]);
                if (posicao2 < 2) {
                    System.out.print(" | ");
                }
                if (posicao2 == 2) {
                    System.out.print("  " + posicao1);
                }
            }
            if (posicao1 < 2) {
                System.out.print("\n------------");
            }
            System.out.println("\n");
        }
    }
}
