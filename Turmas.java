public class Turmas extends Disciplinas {

    protected String identificador;
    protected int capacidade_alunos, contador_alunos;
    protected String matricula_professor;
    protected int contador = 1;

    public Turmas(String nome, String descricao, int carga_horaria, int contador_alunos) {
        super(nome, descricao, carga_horaria);
        this.identificador = null;
        this.contador_alunos = contador_alunos;
        this.capacidade_alunos = 10;
        this.matricula_professor = null;
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

    public void setProfessor_Disciplina(String matricula_professor){
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


    //Seria legal ter um metodo para setar a capacidade;
    
    //Seria fera demias ter um método que CRIA a turma de acordo com o numero de alunos que estão interessados...


}