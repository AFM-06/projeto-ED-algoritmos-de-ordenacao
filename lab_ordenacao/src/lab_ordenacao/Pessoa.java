package lab_ordenacao;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private Integer idade;
    private String corFavorita;

	public Pessoa(String nome, Integer idade, String corFavorita){
        this.nome = nome;
        this.idade = idade;
        this.corFavorita = corFavorita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public String getCorFavorita() {
		return corFavorita;
	}

	public void setCorFavorita(String corFavorita) {
		this.corFavorita = corFavorita;
	}

	@Override
    public int compareTo(Pessoa outraPessoa) {
        if(idade.equals(outraPessoa.getIdade())){ 	
            return nome.compareTo(outraPessoa.getNome());
        }
        else{
            return idade.compareTo(outraPessoa.getIdade());
        }
    }
 
    @Override
    public String toString() {
        return "[" + nome + ": " + idade + "|"+ corFavorita +"]";
    }
}
