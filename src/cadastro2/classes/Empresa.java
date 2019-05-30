/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro2.classes;

import java.util.Objects;

/**
 *
 * @author Erick Nagoski
 */
public class Empresa {
    private String nome;
    private long cnpj;
    private long cod_empresa;
    private String senha;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getCod_empresa() {
        return cod_empresa;
    }

    public void setCod_empresa(long cod_empresa) {
        this.cod_empresa = cod_empresa;
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

    public Empresa(String nome, long cnpj, String senha, String telefone, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        //this.cod_empresa = Utilitarios.geradorDeCodigos();
    }

    @Override
    public String toString() {
        return "Empresa: " + nome + "\nCNPJ: " + cnpj + "\nTelefone: " + telefone + "\nE-mail=" + email;
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
        final Empresa other = (Empresa) obj;
        if (this.cnpj != other.cnpj) {
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
