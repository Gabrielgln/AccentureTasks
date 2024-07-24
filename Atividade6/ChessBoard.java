import javax.swing.JOptionPane;

public class ChessBoard {
    public static void main(String[] args) {
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};

        imprimirBoard(board);
        while (true) {
            String colunaInput = JOptionPane.showInputDialog(null, "Digite a coluna do peão (1-8) ou 's' para sair:", JOptionPane.QUESTION_MESSAGE).toLowerCase();

            if (colunaInput.equals("s")) {
                break;
            }

            int linhaInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a linha do peão (1-8):", JOptionPane.QUESTION_MESSAGE));

            int coluna = Integer.parseInt(colunaInput) - 1;
            int linha = 8 - linhaInput;

            if (linha < 1 || linha > 7 || coluna < 0 || coluna > 8) {
                JOptionPane.showMessageDialog(null, "Posição inválida! Tente novamente.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            if(!board[linha][coluna].equals("p") && !board[linha][coluna].equals("P")){
                JOptionPane.showMessageDialog(null, "Peça movimentada não é um peão. Tente novamente.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            int destinoLinha = 0;

            if(board[linha][coluna].equals("P")){
                destinoLinha = linha + 1;
                if(linha == 1)
                    destinoLinha += 1;
            }
            else if(board[linha][coluna].equals("p")){
                destinoLinha = linha - 1;
                if(linha == 6)
                    destinoLinha -= 1;
            }
                
            if (!board[destinoLinha][coluna].equals(" ")) {
                JOptionPane.showMessageDialog(null, "A posição de destino já está ocupada. Tente novamente.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            board[destinoLinha][coluna] = board[linha][coluna];
            board[linha][coluna] = " ";

            imprimirBoard(board);
        }
	}
	
	public static void imprimirBoard(String[][] board) {
        System.out.println("                        ");
        System.out.println("  1  2  3  4  5  6  7  8");
        for (int i = 0; i < board.length; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println(8 - i);
        }
        System.out.println("  1  2  3  4  5  6  7  8");
    }
}
