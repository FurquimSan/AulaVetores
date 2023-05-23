import java.util.Scanner;

public class TesteVetores {
public static final int quantNum = 10;
	public static void main(String[] args) {
		
		
		int vetor [] = new int [quantNum];
		int i = 0;
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
		
		//Somar os valores do vetor
		int soma = 0;
		double media = 0;
		for (i=0; i< vetor.length; i++) {
			soma += vetor[i];
			System.out.println("A soma do vetor e:" + soma);
		}
		//Media dos elementos
		media = (double) soma / vetor.length;
				System.out.println("A media dos valores e:" + media);
	
	
    //Exibir o indice do primeiro positivo inserido.
	for (i=0; i< vetor.length; i++ ) {
		if (vetor[i]>= 0) {
			System.out.println("Indice do primeiro positivo e :" +i);
			break;
			
		}
	}
	// Exibir o indice do primeito negativo
	int negativo  = 0;
	for(i=0; i<vetor.length; i++) {
		if (vetor[i] < 0) {
			negativo = i;
		}
	}
	System.out.println("O ultimo indice negativo e" + negativo);
	if (negativo == -1) {
		System.out.println("Não possui indices negativos");
	}
	}
}


// Length = Correr por todo o vetor.
