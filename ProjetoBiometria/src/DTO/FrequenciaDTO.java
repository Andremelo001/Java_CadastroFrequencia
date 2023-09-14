/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author 3°Ano Info
 */
public class FrequenciaDTO {
    private int id_frequencia;
    private String frequencia, nome, turma;
    private String data;
    

    /**
     * @return the id_frequencia
     */
    public int getId_frequencia() {
        return id_frequencia;
    }

    /**
     * @param id_frequencia the id_frequencia to set
     */
    public void setId_frequencia(int id_frequencia) {
        this.id_frequencia = id_frequencia;
    }

    /**
     * @return the frequencia
     */
    public String getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
}
