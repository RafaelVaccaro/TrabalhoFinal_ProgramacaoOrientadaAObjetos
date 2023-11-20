import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    final static HashMap<String, Aluno> Alunada = new HashMap<>();

    public static void main(String[] args) {

        // HashMap<String, Aluno> Alunada = new HashMap<>();

        Alunada.put("Z550", Aluno.criarAluno("Z550", 0, "Pedro"));
        Alunada.put("Z660", Aluno.criarAluno("Z660", 0, "João"));

        Alunada.forEach((k, v) -> System.out.println("Matricula: " + k
                + "| nome: " + v.getNome()
                + "| carga Horaria: " + v.getConsultaCargaHoraria()
                + "| Disciplinas Desejadas: " + v.getDisciplinasMatriculada()));

        Writer.Writer(Alunada);



        //Precisamos criar o Professorada 
        //Precisamos add disciplinas aos alunos
        //Precisamos criar o writter de professores.txt
        //
    }

}
