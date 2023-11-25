import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    final static HashMap<String, Aluno> Alunada = new HashMap<>();
    final static HashMap<String, Disciplinas> GradeHorária = new HashMap<>();
    final static HashMap<String, Turmas> Disponibilidade = new HashMap<>();
    final static HashMap<String, Professor> Professorada = new HashMap<>();

    public static void main(String[] args) {

        new Interface();

        // GradeHorária.put(Interface.nome_disciplinaString,
        // Disciplinas.criarDisciplinas(Interface.nome_disciplinaString,
        // Interface.descricaoString,Interface.carga_horaria_disciplinaInt ));

        // Professorada.put(Interface.matricula_professorString,
        // Professor.criarProfessor(Interface.matricula_professorString,
        // Interface.carga_horaria_professorInt, Interface.nome_professorString,
        // Interface.formacaoString));
        Writer.WriterAluno(Alunada);
        Writer.WriterProfessor(Professorada);

        // Precisamos criar o Professorada
        // Precisamos add disciplinas aos alunos
        // Precisamos criar o writter de professores.txt
        //
    }

}
