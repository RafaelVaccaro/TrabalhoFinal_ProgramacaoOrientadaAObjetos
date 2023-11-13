import java.util.ArrayList;

public class Pessoa {

    protected String matricula, nome;
    protected int carga_horaria;
    protected ArrayList<Disciplinas> disciplinas;

    //Construtor de Pessoas
    public Pessoa(String matricula, String nome, int carga_horaria) {
        this.matricula = matricula;
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.disciplinas = null;
    }
}