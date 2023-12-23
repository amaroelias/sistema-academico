package org.example;

public class Professor {
    private String siape;
    private String nome;

    public Professor(String siape, String nome) {
        this.siape = siape;
        this.nome = nome;
    }

    public Professor(String siape) throws IllegalArgumentException {
        if (siape == null) {
            throw new IllegalArgumentException("siape invalido:null");
        }
        if (siape.equals("")) {
            throw new IllegalArgumentException("siape invalido:");
        }
        this.siape = siape;
        this.nome = "";
    }

    public String getSiape() {
        return siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
