import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            aList.add("Linha teste n: " + (i + 1));
        }
        try {
            FileWriter fileWriter = new FileWriter("meuArquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String conteudo : aList) {
                bufferedWriter.write(conteudo);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}