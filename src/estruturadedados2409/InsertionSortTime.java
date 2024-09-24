package estruturadedados2409;

public class InsertionSortTime {

    public static void main(String[] args) {
        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        //variavel para registrar tempo de exec
        long inicio = System.currentTimeMillis();

        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execucao > " + (fim - inicio));
    }
}
