import java.util.ArrayList;

public class Aluno extends Pessoa {

    public Aluno(String matricula, int carga_horaria, String nome) {
        super(matricula, nome, carga_horaria);
        this.disciplinas = new ArrayList<>();
    }

    public boolean addDisciplinas(Disciplinas disciplinas) {
        if (this.carga_horaria + disciplinas.carga_horaria <= 28) {
            this.disciplinas.add(disciplinas);
                    return true;
                } else
                    return false;
            }


    public ArrayList getDisciplinasMatriculada (){
        return disciplinas;
    }

    public int getConsultaCargaHoraria(){
        return carga_horaria;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setDisciplinas(Disciplinas x){

        disciplinas.add(x);

    }

    public static Aluno criarAluno(String matricula, int carga_horaria, String nome){//falta o array de disciplinas desejadas

        Aluno x = new Aluno(matricula, carga_horaria, nome);

        return x;

    }


}

