import java.util.ArrayList;

public class Professor extends Pessoa {
    protected String formacao;

    public Professor(String matricula, int carga_horaria, String nome, String formacao) {
        super(nome, matricula, carga_horaria);
        this.formacao = formacao;
        this.disciplinas = new ArrayList<>();
    }

    public boolean addDisciplinas(Disciplinas disciplinas) {
        if (formacao == "professor") {
            if (this.carga_horaria + disciplinas.carga_horaria <= 12) {
                this.disciplinas.add(disciplinas);
                return true;
            } else
                return false;
        }
        return false;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public int getConsultaCargaHoraria(){
        return carga_horaria;
    }

    public static Professor criarProfessor(String matricula, int carga_horaria, String nome, String formacao){

        Professor x = new Professor(matricula, carga_horaria, nome, formacao);

        return x;

    }


    public void setDisciplinas(Disciplinas x){

        disciplinas.add(x);

    }
}