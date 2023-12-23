package org.example;

import java.util.HashMap;
import java.util.Map;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private Map<String,Aluno> alunos;

    public Turma(int codigo, Disciplina disciplina){
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = null;
        this.alunos = new HashMap<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno) throws RuntimeException{
        if(!disciplina.getCurso().alunoMatriculado(aluno.getMatricula())){
            throw new RuntimeException("Aluno não está matriculado no curso:"+disciplina.getCurso().getNome());
        }
        alunos.put(aluno.getMatricula(),aluno);
    }

    public Map<String, Aluno> getAlunos() {
        return alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
