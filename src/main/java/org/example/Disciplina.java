package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Disciplina {

    private Curso curso;
    private String codigo;
    private String nome;
    private Map<Integer,Turma> turmas;

    public Disciplina(Curso curso, String codigo, String nome) {
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
        this.turmas = new HashMap<>();
    }

    public Turma criarTurma(){
        Turma turma = new Turma(turmas.size()+1, this);
        turmas.put(turma.getCodigo(),turma);
        return turma;
    }

    public Turma getTurma(int codigo) throws IllegalArgumentException{
        if(codigo <= 0){
            throw new IllegalArgumentException("código inválido:"+codigo);
        }
        if(!turmas.containsKey(codigo)){
            throw new IllegalArgumentException("Não existe turma com código:"+codigo);
        }

        return turmas.get(codigo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Map<Integer,Turma> getTurmas() {
        return turmas;
    }

}
