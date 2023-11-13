public class Turmas extends Disciplinas {

    protected String identificador;
    protected int capacidade_alunos, contador_alunos;
    protected String matricula_professor;

    public Turmas(String nome, String descricao, int carga_horaria, int contador_alunos) {
        super(nome, descricao, carga_horaria);
        this.identificador = null;
        this.contador_alunos = contador_alunos;
        this.capacidade_alunos = 10;
        this.matricula_professor = null;
    }

    // Criar metodo setIdentificador da turma.
}