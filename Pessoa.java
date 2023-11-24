import java.util.ArrayList;

public abstract class Pessoa {

    protected String matricula, nome;
    protected int carga_horaria;
    protected ArrayList<String> disciplinas;

    //Construtor de Pessoas
    public Pessoa(String matricula, String nome, int carga_horaria) {
        this.matricula = matricula;
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.disciplinas = null; // adicionar
    }

    public abstract int getConsultaCargaHoraria();
    
    public abstract String getNome();

    public abstract String getMatricula();
}