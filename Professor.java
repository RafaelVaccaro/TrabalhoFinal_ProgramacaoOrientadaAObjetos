import java.util.ArrayList;

public class Professor extends Pessoa {
    protected String formacao;

    public Professor(String matricula, int carga_horaria, String nome, String formacao) {
        super(nome, matricula, carga_horaria);
        this.formacao = formacao;
        this.disciplinas = new ArrayList<>();
    }

    public boolean addDisciplinas(String disciplinas) {
                this.disciplinas.add(disciplinas);
                return true;
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

    public String getFormacao(){
        return formacao;
    }

    public ArrayList getDisciplinas(){
        return disciplinas;
    }

    public static Professor criarProfessor(String matricula, int carga_horaria, String nome, String formacao){

        Professor x = new Professor(matricula, carga_horaria, nome, formacao);

        Main.Professorada.put(matricula, x);

        return x;

    }


    public void setDisciplinas(Disciplinas x){

        disciplinas.add(x);

    }
}