package lab_ordenacao;
import java.util.Arrays;
public class Ordenacao implements Ordenacao_IF{

	public boolean checaVetorOrdenado(Pessoa[] pessoas) { //Método brinde pra ajudar a testar os algoritmos implementados
		for (int i = 1; i < pessoas.length; i++) {
			if (pessoas[i - 1].getIdade() > pessoas[i].getIdade()) {
				return false;
			} else if (pessoas[i - 1].getIdade() == pessoas[i].getIdade()) {
				if (pessoas[i - 1].getNome().compareTo(pessoas[i].getNome()) > 0) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void bubbleSort(Pessoa[] pessoas) {
		System.out.println(Arrays.toString(pessoas));
		int size = pessoas.length;
		for(int i = 0; i < size-1; i++) {
			for(int j = 0; j < size - 1 - i;j++){
				if(pessoas[j].compareTo(pessoas[j+1]) > 0) {
					Pessoa aux = pessoas[j];
					pessoas[j] = pessoas[j+1];
					pessoas[j+1] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(pessoas));
	}

	@Override
	public void selectionSort(Pessoa[] pessoas) {
		System.out.println(Arrays.toString(pessoas));
		int size = pessoas.length;
		for(int i = 0; i < size-1; i++) {
			int indice_menor =  i;
			for(int j = i+1; j < size; j++) {
				if(pessoas[j].compareTo(pessoas[indice_menor]) < 0) {
					indice_menor = j;
				}
			}
			if(indice_menor != i) {
				Pessoa aux = pessoas[i];
				pessoas[i] = pessoas[indice_menor];
				pessoas[indice_menor] = aux;
			}
		}
		System.out.println(Arrays.toString(pessoas));
	}

	@Override
	public void insertionSort(Pessoa[] pessoas) {
		System.out.println(Arrays.toString(pessoas));
		int size = pessoas.length;
		for(int i = 1; i < size; i++) {
			int j = i;
			while(j>0 && pessoas[j-1].compareTo(pessoas[j]) > 0) {
				Pessoa aux = pessoas[j];
				pessoas[j] = pessoas[j-1];
				pessoas[j-1] = aux;
				pessoas[j] = pessoas[j-1];
			}
		}
		System.out.println(Arrays.toString(pessoas));
	}

	@Override
	public void mergeSort(Pessoa[] pessoas) {
		// TODO Auto-generated method stub
		
	}
}
