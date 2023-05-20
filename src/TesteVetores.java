import java.util.Scanner;

public class TesteVetores {
public static final int quantNum = 10;
	public static void main(String[] args) {
		
		
		int vetor [] = new int [quantNum];
		int i;
		Scanner LeitorNum = new Scanner(System.in);
		for(i=0; i < quantNum; i++ ) {
			System.out.println("Digite o valor do" + (i+1) + " numero");
			vetor [i] = LeitorNum.nextInt();
		}
		int maior = vetor[0];
		for (i=0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("O maior valor do vetor e: " + maior);
	}
}
