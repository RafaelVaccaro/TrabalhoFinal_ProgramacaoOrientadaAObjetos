import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Writer {
    public static void WriterAluno(HashMap<String, Aluno> Alunada) {
        try {
            FileWriter fileWriter = new FileWriter("Alunos.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Alunada.forEach((k, v) -> {
                try {
                    bufferedWriter.write("Matricula: " + k +
                        "| nome: " + v.getNome() +
                        "| carga Horaria: " + v.getConsultaCargaHoraria() +
                        "| Disciplinas Desejadas: " + v.getDisciplinasMatriculada());
                    bufferedWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Fecha os recursos
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


public static void WriterProfessor(HashMap<String, Professor> Professorada) {
        try {
            FileWriter fileWriter = new FileWriter("Professor.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Professorada.forEach((k, v) -> {
                try {
                    bufferedWriter.write("Matricula: " + k +
                        "| nome: " + v.getNome() +
                        "| carga Horaria: " + v.getConsultaCargaHoraria()+ 
                        "| Formação: " + v.getFormacao() +
                        "| Disciplinas: " + v.getDisciplinas());
                    bufferedWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Fecha os recursos
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriterDisciplinas(HashMap<String, Disciplinas> GradeHorária ) {
        try {
            FileWriter fileWriter = new FileWriter("Disciplinas.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            GradeHorária.forEach((k, v) -> {
                try {
                    bufferedWriter.write("" + k +
                        "," + v.getDescricaoDisciplina() +
                        "," + v.getCargaHorariaDisciplina()+ 
                        "," + v.getAlunos() +
                        "," + v.getProfessores());
                    bufferedWriter.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Fecha os recursos
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
