public  class Disciplinas {

    protected String nome, descricao;
    public int carga_horaria;

    //Construtor de Disciplinas
    public Disciplinas(String nome, String descricao, int carga_horaria) {

        this.nome = nome;
        this.descricao = descricao;
        this.carga_horaria = carga_horaria;
    }
    
    public String getNomeDisciplina(){
        return nome;
    }

    public String getDescricaoDisciplina(){
        return descricao;
    }

    public int gerCargaHorariaDisciplina(){
        return carga_horaria;
    }

}
