import java.util.ArrayList;

public class Aluno extends Pessoa {

    public Aluno(String matricula, int carga_horaria, String nome) {
        super(matricula, nome, carga_horaria);
        this.disciplinas = new ArrayList<>();
    }

    public void addDisciplinas(String disciplinas) {
            this.disciplinas.add(disciplinas);
    
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

    public static void criarAluno(String matricula, int carga_horaria, String nome, String disciplinas){

        if(Main.Alunada.containsKey(matricula))
            Main.Alunada.get(matricula).addDisciplinas(disciplinas);   
        else{
        Aluno x = new Aluno(matricula, carga_horaria, nome);

        x.addDisciplinas(disciplinas);

        Main.Alunada.put(matricula, x);

        if(Main.GradeHorária.containsKey(disciplinas)){
        Main.GradeHorária.get(disciplinas).setAlunos(x.getMatricula());
        Writer.WriterDisciplinas(Main.GradeHorária);
    }
}
    }

}

