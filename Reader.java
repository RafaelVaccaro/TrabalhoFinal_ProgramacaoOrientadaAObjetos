import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Reader {

    public static void ReadAluno() {
    String[] coisas;

    File file = new File("Alunos.csv");
    Path p = Paths.get(Paths.get("").toAbsolutePath().toString() + "\\" + file);

    try {
        BufferedReader myFile = Files.newBufferedReader(p, StandardCharsets.UTF_8);
        Scanner reader = new Scanner(myFile);
        while (reader.hasNextLine()) {
            coisas = reader.nextLine().split(",");
            String [] oficial = new String[coisas.length];
            for (int i =0; i<coisas.length; i++) {
                oficial[i]= coisas[i].replaceAll("\\[|\\]", "").trim();
            }

            Main.Alunada.put(oficial[0], new Aluno(oficial[0], Integer.parseInt(oficial[2]) ,oficial[1]));
            for(int i = 3; i<oficial.length; i++){
                Main.Alunada.get(oficial[0]).addDisciplinas(oficial[i]);
            }
        }
        reader.close();

    } catch (Exception e) {
        System.err.format("Erro de ES: %s\n", e.getMessage());
    }
}


 public static void ReadProfessor() {
    String[] coisas;

    File file = new File("Professor.csv");
    Path p = Paths.get(Paths.get("").toAbsolutePath().toString() + "\\" + file);

    try {
        BufferedReader myFile = Files.newBufferedReader(p, StandardCharsets.UTF_8);
        Scanner reader = new Scanner(myFile);
        while (reader.hasNextLine()) {
            coisas = reader.nextLine().split(",");
            String [] oficial = new String[coisas.length];
            for (int i =0; i<coisas.length; i++) {
                oficial[i]= coisas[i].replaceAll("\\[|\\]", "").trim();
            }

            Main.Alunada.put(oficial[0], new Aluno(oficial[0], Integer.parseInt(oficial[2]) ,oficial[1]));
            for(int i = 3; i<oficial.length; i++){
                Main.Alunada.get(oficial[0]).addDisciplinas(oficial[i]);
            }
        }
        reader.close();

    } catch (Exception e) {
        System.err.format("Erro de ES: %s\n", e.getMessage());
    }
}
}
