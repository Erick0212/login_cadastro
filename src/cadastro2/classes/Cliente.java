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
public class Cliente extends Pessoa{
   
    private long cpf;
    private long cod_cliente;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Cliente(String nome,long cpf, String senha, String telefone, String email) {
       super(nome,senha,telefone,email);
        this.cpf = cpf;
        this.cod_cliente = Funcoes.geradorDeID(cpf);
       
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\nCPF: " + cpf +"\nCódigo de cliente: "+this.cod_cliente+ "\nTelefone: " + telefone + "\nE-mail: " + email;
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
