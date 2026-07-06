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
		// TODO Auto-generated method stub
		
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
