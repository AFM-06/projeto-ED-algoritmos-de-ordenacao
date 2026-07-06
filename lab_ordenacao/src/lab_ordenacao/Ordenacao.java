package lab_ordenacao;

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
		System.out.println(pessoas);
		int size = pessoas.length;
		for(int i = 0; i < size-1-i; i++) {
			for(int j = 0; j < size-1;j++){
				if(pessoas[j].compareTo(pessoas[j+1]) > 0) {
					Pessoa aux = pessoas[j];
					pessoas[j] = pessoas[j+1];
					pessoas[j+1] = aux;
				}
			}
		}
		System.out.println(pessoas);
	}

	@Override
	public void selectionSort(Pessoa[] pessoas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertionSort(Pessoa[] pessoas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mergeSort(Pessoa[] pessoas) {
		// TODO Auto-generated method stub
		
	}
}
