import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Writer {
    public static void Writer(HashMap<String, Aluno> Alunada) {
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
}
