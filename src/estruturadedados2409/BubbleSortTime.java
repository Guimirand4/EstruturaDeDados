package estruturadedados2409;
public class BubbleSortTime {
    public static void main(String[] args) {
        int[] vetor = new int [100];
        
        for(int i = 0; i<vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        //variavel para registrar tempo de exec
        long inicio = System.currentTimeMillis();
        
        //metodo bubblesort
                int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();
        
        System.out.println("Tempo de execucao > " + (fim-inicio));
    }
}
