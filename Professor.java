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

    public ArrayList <String>getDisciplinas(){
        return disciplinas;
    }

    public static void criarProfessor(String matricula, int carga_horaria, String nome, String formacao, String disciplinas){

        if(Main.Professorada.containsKey(matricula))
        Main.Professorada.get(matricula).addDisciplinas(disciplinas);
        else{        
        Professor x = new Professor(matricula, carga_horaria, nome, formacao);
         x.addDisciplinas(disciplinas);
        Main.Professorada.put(matricula, x);

        if (Main.GradeHorária.containsKey(disciplinas))
        Main.GradeHorária.get(disciplinas).setProfessor_Disciplina(x.getMatricula());
        }

    }


    public void setDisciplinas(Disciplinas x){

        //disciplinas.add(x);

    }
}