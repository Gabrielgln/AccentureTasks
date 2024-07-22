package Atividade2;

public class Main {
    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numero = 8;
        int indice = 0;
        boolean achou = false;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == 8){
                achou = true;
                indice = i;
            }
        }
        if(achou){
            System.out.println("Achei");
            System.out.println("Na Posição " + indice + " está localizado do numero " + numero + ".");
        }
    }
}
