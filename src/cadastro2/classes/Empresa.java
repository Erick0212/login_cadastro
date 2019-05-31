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
public class Empresa extends Pessoa{
    private long cnpj;
    private long cod_empresa;
 
    public long getCnpj (){
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa(String nome,long cnpj, String senha, String telefone, String email) {
        super(nome,senha,telefone,email);
        this.cnpj = cnpj;
        this.cod_empresa = Funcoes.geradorDeID(cnpj);
    }

    @Override
    public String toString() {
        return "Empresa: " + nome + "\nCNPJ: " + cnpj + "\nCódigo da Empresa: "+ this.cod_empresa + "\nTelefone: " + telefone + "\nE-mail=" + email;
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
