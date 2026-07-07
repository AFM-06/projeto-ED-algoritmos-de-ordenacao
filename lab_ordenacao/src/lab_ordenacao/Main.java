package lab_ordenacao;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("André",20,"Azul");
        Pessoa p2 = new Pessoa("João",23,"Vermelho");
        Pessoa p3 = new Pessoa("Lucas",10,"Amarelo");
        Pessoa p4 = new Pessoa("Carlos",17,"Verde");
        Pessoa p5 = new Pessoa("Beatriz",23,"Vermelho");
        Pessoa[] pessoas = {p1,p2,p3,p4,p5};

        Ordenacao ordenacao = new Ordenacao();
        //ordenacao.bubbleSort(pessoas);
        //ordenacao.selectionSort(pessoas);
        //ordenacao.selectionSort(pessoas);
        ordenacao.mergeSort(pessoas);
    }
}
