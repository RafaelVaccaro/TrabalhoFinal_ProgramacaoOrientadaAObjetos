import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame {

    JTabbedPane tab;
    JPanel professor, aluno, disciplina, d_professor, d_aluno, d_disciplina;
    JLabel nome_professor, matricula_professor, carga_horaria_professor, formacao, nome_aluno,
            matricula_aluno, carga_horaria_aluno, disciplina_aluno, nome_disciplina, descricao,
            carga_horaria_disciplina;
    JTextField txt_nome_professor, txt_matricula_professor, txt_carga_horaria_professor, txt_formacao,
            txt_nome_aluno, txt_matricula_aluno, txt_carga_horaria_aluno, txt_disciplina_aluno, txt_nome_disciplina,
            txt_descricao, txt_carga_horaria_disciplina;
    JButton cadastrarProfessorButton, limparProfessorButton, cadastrarAlunoButton, limparAlunoButton,
            cadastrarDisciplinaButton, limparDisciplinaButton;
    TratadorEventos tratadorEventos;
    public static String nome_professorString, matricula_professorString, carga_horaria_professorString,
            formacaoString, nome_alunoString, matricula_alunoString, carga_horaria_alunoString, disciplina_alunoString,
            nome_disciplinaString, descricaoString, carga_horaria_disciplinaString;
    public static int carga_horaria_professorInt, carga_horaria_alunoInt, carga_horaria_disciplinaInt;
    Font font1 = new Font("SansSerif", Font.BOLD, 20);

    public Interface() {

        super("Trabalho Final POO");
        tab = new JTabbedPane();

        professor = new JPanel(new GridLayout(0, 2)); // COMEÇO PROFESSOR
        professor.setBackground(Color.RED);

        nome_professor = new JLabel("Nome do(a) professor(a):", SwingConstants.CENTER);
        nome_professor.setFont(font1);
        nome_professor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_nome_professor = new JTextField();
        txt_nome_professor.setFont(font1);
        txt_nome_professor.setHorizontalAlignment(JTextField.CENTER);
        txt_nome_professor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        matricula_professor = new JLabel("Matrícula do(a) professor(a):", SwingConstants.CENTER);
        matricula_professor.setFont(font1);
        matricula_professor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_matricula_professor = new JTextField();
        txt_matricula_professor.setFont(font1);
        txt_matricula_professor.setHorizontalAlignment(JTextField.CENTER);
        txt_matricula_professor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        carga_horaria_professor = new JLabel("Carga Horária do(a) professor(a):", SwingConstants.CENTER);
        carga_horaria_professor.setFont(font1);
        carga_horaria_professor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_carga_horaria_professor = new JTextField();
        txt_carga_horaria_professor.setFont(font1);
        txt_carga_horaria_professor.setHorizontalAlignment(JTextField.CENTER);
        txt_carga_horaria_professor.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        formacao = new JLabel("Formação do(a) professor(a):", SwingConstants.CENTER);
        formacao.setFont(font1);
        formacao.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_formacao = new JTextField();
        txt_formacao.setFont(font1);
        txt_formacao.setHorizontalAlignment(JTextField.CENTER);
        txt_formacao.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        cadastrarProfessorButton = new JButton("CADASTRAR");
        cadastrarProfessorButton.setFont(font1);

        limparProfessorButton = new JButton("LIMPAR");
        limparProfessorButton.setFont(font1);

        professor.add(nome_professor);
        professor.add(txt_nome_professor);
        professor.add(matricula_professor);
        professor.add(txt_matricula_professor);
        professor.add(carga_horaria_professor);
        professor.add(txt_carga_horaria_professor);
        professor.add(formacao);
        professor.add(txt_formacao);
        professor.add(cadastrarProfessorButton);
        professor.add(limparProfessorButton); // FIM PROFESSOR
//////////////////////////////////////////////////////////////////////////////////////////////////////
        aluno = new JPanel(new GridLayout(0, 2)); // COMECO ALUNO
        aluno.setBackground(Color.CYAN);

        nome_aluno = new JLabel("Nome do(a) aluno(a):", SwingConstants.CENTER);
        nome_aluno.setFont(font1);
        nome_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_nome_aluno = new JTextField();
        txt_nome_aluno.setFont(font1);
        txt_nome_aluno.setHorizontalAlignment(JTextField.CENTER);
        txt_nome_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        matricula_aluno = new JLabel("Matrícula do(a) aluno(a):", SwingConstants.CENTER);
        matricula_aluno.setFont(font1);
        matricula_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_matricula_aluno = new JTextField();
        txt_matricula_aluno.setFont(font1);
        txt_matricula_aluno.setHorizontalAlignment(JTextField.CENTER);
        txt_matricula_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        carga_horaria_aluno = new JLabel("Carga Horária do(a) aluno(a):", SwingConstants.CENTER);
        carga_horaria_aluno.setFont(font1);
        carga_horaria_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_carga_horaria_aluno = new JTextField();
        txt_carga_horaria_aluno.setFont(font1);
        txt_carga_horaria_aluno.setHorizontalAlignment(JTextField.CENTER);
        txt_carga_horaria_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        disciplina_aluno = new JLabel("Disciplina de interesse do(a) aluno(a)", SwingConstants.CENTER);
        disciplina_aluno.setFont(font1);
        disciplina_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_disciplina_aluno = new JTextField();
        txt_disciplina_aluno.setFont(font1);
        txt_disciplina_aluno.setHorizontalAlignment(JTextField.CENTER);
        txt_disciplina_aluno.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        cadastrarAlunoButton = new JButton("CADASTRAR");
        cadastrarAlunoButton.setFont(font1);

        limparAlunoButton = new JButton("LIMPAR");
        limparAlunoButton.setFont(font1);

        aluno.add(nome_aluno);
        aluno.add(txt_nome_aluno);
        aluno.add(matricula_aluno);
        aluno.add(txt_matricula_aluno);
        aluno.add(carga_horaria_aluno);
        aluno.add(txt_carga_horaria_aluno);
        aluno.add(disciplina_aluno);
        aluno.add(txt_disciplina_aluno);
        aluno.add(cadastrarAlunoButton);
        aluno.add(limparAlunoButton); // FIM ALUNO
//////////////////////////////////////////////////////////////////////////////////////////////////////
        disciplina = new JPanel(new GridLayout(0, 2));// INICIO DISCIPLINA
        disciplina.setBackground(Color.ORANGE);

        nome_disciplina = new JLabel("Nome da disciplina:", SwingConstants.CENTER);
        nome_disciplina.setFont(font1);
        nome_disciplina.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_nome_disciplina = new JTextField();
        txt_nome_disciplina.setFont(font1);
        txt_nome_disciplina.setHorizontalAlignment(JTextField.CENTER);
        txt_nome_disciplina.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        descricao = new JLabel("Descrição da disciplina:", SwingConstants.CENTER);
        descricao.setFont(font1);
        descricao.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_descricao = new JTextField();
        txt_descricao.setFont(font1);
        txt_descricao.setHorizontalAlignment(JTextField.CENTER);
        txt_descricao.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        carga_horaria_disciplina = new JLabel("Carga horária da disciplina:", SwingConstants.CENTER);
        carga_horaria_disciplina.setFont(font1);
        carga_horaria_disciplina.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        txt_carga_horaria_disciplina = new JTextField();
        txt_carga_horaria_disciplina.setFont(font1);
        txt_carga_horaria_disciplina.setHorizontalAlignment(JTextField.CENTER);
        txt_carga_horaria_disciplina.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        cadastrarDisciplinaButton = new JButton("CADASTRAR");
        cadastrarDisciplinaButton.setFont(font1);

        limparDisciplinaButton = new JButton("LIMPAR");
        limparDisciplinaButton.setFont(font1);

        disciplina.add(nome_disciplina);
        disciplina.add(txt_nome_disciplina);
        disciplina.add(descricao);
        disciplina.add(txt_descricao);
        disciplina.add(carga_horaria_disciplina);
        disciplina.add(txt_carga_horaria_disciplina);
        disciplina.add(cadastrarDisciplinaButton);
        disciplina.add(limparDisciplinaButton); // FIM DISCIPLINA
//////////////////////////////////////////////////////////////////////////////////////////////////////
        d_professor = new JPanel(new GridLayout(0, 2));
//////////////////////////////////////////////////////////////////////////////////////////////////////
        d_aluno = new JPanel(new GridLayout(0, 2));
//////////////////////////////////////////////////////////////////////////////////////////////////////
        d_disciplina = new JPanel(new GridLayout(0, 2));
//////////////////////////////////////////////////////////////////////////////////////////////////////
        tratadorEventos = new TratadorEventos();
        cadastrarProfessorButton.addActionListener(tratadorEventos);
        limparProfessorButton.addActionListener(tratadorEventos);
        cadastrarAlunoButton.addActionListener(tratadorEventos);
        limparAlunoButton.addActionListener(tratadorEventos);
        cadastrarDisciplinaButton.addActionListener(tratadorEventos);
        limparDisciplinaButton.addActionListener(tratadorEventos);

        tab.addTab("Cadastro Professor", professor);
        tab.addTab("Cadastro Aluno", aluno);
        tab.addTab("Cadastro Disciplina", disciplina);
        tab.addTab("Detalhes Professor", d_professor);
        tab.addTab("Detalhes Aluno", d_aluno);
        tab.addTab("Detalhes Disciplina", d_disciplina);

        add(tab);

    }

    public void load() {
        // device.setFullScreenWindow(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private class TratadorEventos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cadastrarProfessorButton) {
                nome_professorString = txt_nome_professor.getText();
             
                matricula_professorString = txt_matricula_professor.getText();
    
                carga_horaria_professorString = txt_carga_horaria_professor.getText();

                carga_horaria_professorInt = Integer.parseInt(carga_horaria_professorString);

                formacaoString = txt_formacao.getText();

                Professor.criarProfessor(matricula_alunoString, carga_horaria_alunoInt, nome_alunoString, formacaoString);

                // SALVAR ESSAS STRINGS NO ARQUIVO
            } else if (e.getSource() == limparProfessorButton) {
                txt_nome_professor.setText("");
                txt_matricula_professor.setText("");
                txt_carga_horaria_professor.setText("");
                txt_formacao.setText("");
            } else if (e.getSource() == cadastrarAlunoButton) {
                nome_alunoString = txt_nome_aluno.getText();
               
                matricula_alunoString = txt_matricula_aluno.getText();
    
                carga_horaria_alunoString = txt_carga_horaria_aluno.getText();

                carga_horaria_alunoInt = Integer.parseInt(carga_horaria_alunoString);

                disciplina_alunoString = txt_disciplina_aluno.getText();

                Aluno.criarAluno(matricula_alunoString, carga_horaria_alunoInt, nome_alunoString, disciplina_alunoString);

               
                
                Writer.WriterAluno(Main.Alunada);
                // SALVAR ESSAS STRINGS NO ARQUIVO
            } else if (e.getSource() == limparAlunoButton) {
                txt_nome_aluno.setText("");
                txt_matricula_aluno.setText("");
                txt_carga_horaria_aluno.setText("");
                txt_disciplina_aluno.setText("");
            } else if (e.getSource() == cadastrarDisciplinaButton) {
                nome_disciplinaString = txt_nome_disciplina.getText();
                descricaoString = txt_descricao.getText();
                carga_horaria_disciplinaString = txt_carga_horaria_disciplina.getText();
                carga_horaria_disciplinaInt = Integer.parseInt(carga_horaria_disciplinaString);

                Disciplinas.criarDisciplinas(nome_disciplinaString, descricaoString,carga_horaria_disciplinaInt);
                
                Writer.WriterDisciplinas(Main.GradeHorária);
                
                // SALVAR ESSAS STRINGS NO ARQUIVO
            } else if (e.getSource() == limparDisciplinaButton) {
                txt_nome_disciplina.setText("");
                txt_descricao.setText("");
                txt_carga_horaria_disciplina.setText("");
            }
        }
    }
}
