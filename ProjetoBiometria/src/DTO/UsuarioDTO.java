/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author 3°Ano Info
 */
public class UsuarioDTO {
    
    private int id_direcao;
    private String senha_usuario;
    private String nome_usuario;

    /**
     * @return the id_direcao
     */
    public int getId_direcao() {
        return id_direcao;
    }

    /**
     * @param id_direcao the id_direcao to set
     */
    public void setId_direcao(int id_direcao) {
        this.id_direcao = id_direcao;
    }

    /**
     * @return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
    
}
