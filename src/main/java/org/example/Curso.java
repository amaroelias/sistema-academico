package org.example;

import java.util.*;

public class Curso {
    private String nome;
    private Map<String,Disciplina> disciplinas;
    private Map<String, Aluno> alunosMatriculados;



    public Curso() {
        this.nome = "";
        this.disciplinas = new HashMap<>();
        this.alunosMatriculados = new HashMap<>();
    }
    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new HashMap<>();
        this.alunosMatriculados = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina criarDisciplina(String codigo, String nome){
        Disciplina disciplina = new Disciplina(this,codigo,nome);
        disciplinas.put(codigo, disciplina);
        return disciplina;
    }

    public Disciplina getDisciplina(String codigo) throws RuntimeException{
        if(!disciplinas.containsKey(codigo)){
            throw new RuntimeException("Não existe disciplina com código:"+codigo);
        }
        return disciplinas.get(codigo);
    }

    public void matricular(Aluno aluno) throws IllegalArgumentException{
        if(aluno == null){
            throw new IllegalArgumentException("aluno inválido:"+aluno);
        }
        if(alunosMatriculados.containsKey(aluno.getMatricula())){
            throw new IllegalArgumentException("aluno já matriculado:"+aluno.getMatricula());
        }
        alunosMatriculados.put(aluno.getMatricula(),aluno);
    }

    public Map<String, Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public Aluno getAlunoMatriculado(String matricula){
        return alunosMatriculados.get(matricula);
    }
    public boolean alunoMatriculado(String matricula){
        return alunosMatriculados.containsKey(matricula);
    }
}
