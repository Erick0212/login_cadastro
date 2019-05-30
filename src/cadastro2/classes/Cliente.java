/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro2.classes;

import static cadastro2.classes.Funcoes.geradorDeCodigos;
import java.util.Objects;

/**
 *
 * @author Erick Nagoski
 */
public class Cliente {
    private String nome;
    private long cpf;
    private long cod_cliente;
    private String senha;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(long cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
    

    public Cliente(String nome, long cpf, String senha, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.cod_cliente = geradorDeCodigos();
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\nCPF: " + cpf +"\nCódigo de cliente"+cod_cliente+ "\nTelefone: " + telefone + "\nE-mail: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.cpf != other.cpf) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
