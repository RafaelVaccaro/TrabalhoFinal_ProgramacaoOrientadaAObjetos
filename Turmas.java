import java.util.ArrayList;

public class Turmas extends Disciplinas {
    

    protected String identificador;
    protected int capacidade_alunos, contador_alunos;
    protected String matricula_professor;
    protected int contador = 1;
    protected ArrayList<Aluno> chamada;

    public Turmas(String nome, String descricao, int carga_horaria, int contador_alunos) {
        super(nome, descricao, carga_horaria);
        this.identificador = null;
        this.contador_alunos = contador_alunos;
        this.capacidade_alunos = 10;
        this.matricula_professor = null;
        this.chamada = new ArrayList<>();
       
    }

    public String getNomeDisciplina(){
        return nome;
    }

    public String IdentificadorTurma(){
        return identificador;
    }

    public void setIdentificadorTurma(){
        this.identificador = " " + getNomeDisciplina() + contador; 
        contador ++;
    }

    public String DescricaoDisciplina(){
        return descricao;
    }

    public int ConsultaCargaHorariaDisciplina(){
        return carga_horaria;
    }

    public void setProfessor_Turma(String matricula_professor){
        this.matricula_professor = matricula_professor;
    }

    public String getMatriculaProfessorDisciplina(){
        return matricula_professor;
    }

    public int getCapacidade_alunos(){
        return capacidade_alunos;
    }

    public boolean setContadorDeAlunos(){
        if(getContadorAlunos() == getCapacidade_alunos())
            return false;
        else{
        this.contador_alunos = contador_alunos + 1;
        return true;
        }
    }

    public int getContadorAlunos(){
        return contador_alunos;
    }

    public static Turmas criadorDeTurma(String nome, String descricao, int carga_horaria, int contador_alunos, Professor y){

        Turmas x = new Turmas(nome, descricao, carga_horaria, contador_alunos);
        x.setIdentificadorTurma();
        x.setProfessor_Turma(y.getMatricula());
        return x;

    }

    public void addAluno(Aluno x){//trocar para String
        this.ListadeAlunos.add(x);
    }

    



}