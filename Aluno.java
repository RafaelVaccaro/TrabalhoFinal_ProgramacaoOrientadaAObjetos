import java.util.ArrayList;

public class Aluno extends Pessoa {

    public Aluno(String matricula, int carga_horaria, String nome) {
        super(matricula, nome, carga_horaria);
        this.disciplinas = new ArrayList<>();
    }

    public boolean addDisciplinas(Disciplinas disciplinas) {
        if (this.carga_horaria + disciplinas.carga_horaria <= 12) {
            this.disciplinas.add(disciplinas);
                    return true;
                } else
                    return false;
            }
}

