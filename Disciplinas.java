import java.util.ArrayList;

public class Disciplinas {

    protected String nome, descricao;
    public int carga_horaria;
    public ArrayList<String> ListadeAlunos;
    public ArrayList<String> ListadeProfessor;
    public ArrayList<Turmas> ListadeTurmas;

    // Construtor de Disciplinas
    public Disciplinas(String nome, String descricao, int carga_horaria) {// lista de alunos e a=professores

        this.nome = nome;
        this.descricao = descricao;
        this.carga_horaria = carga_horaria;
        this.ListadeAlunos = new ArrayList<>();
        this.ListadeProfessor = new ArrayList<>();
    }

    public String getNomeDisciplina() {
        return nome;
    }

    public String getDescricaoDisciplina() {
        return descricao;
    }

    public int getCargaHorariaDisciplina() {
        return carga_horaria;
    }

    public static void criarDisciplinas(String nome, String descricao, int carga_horaria) {

        Disciplinas x = new Disciplinas(nome, descricao, carga_horaria);

        Main.GradeHorária.put(nome, x);

    }

    public void setAlunos(String x) {
        ListadeAlunos.add(x);
    }

    public void setProfessor_Disciplina(String x) {
        ListadeProfessor.add(x);
    }

    public void setTurmas(Turmas x) {
        ListadeTurmas.add(x);
    }

    public ArrayList<String> getAlunos() {
        return ListadeAlunos;
    }

    public ArrayList<String> getProfessores() {
        return ListadeProfessor;
    }
}
