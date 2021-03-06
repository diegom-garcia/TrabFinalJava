package DB;
// Generated 23/11/2020 19:14:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Funcionarios generated by hbm2java
 */
public class Funcionarios  implements java.io.Serializable {


     private Integer idFuncionario;
     private Departamentos departamentos;
     private String nome;
     private String endereco;
     private String cidade;
     private int cpf;
     private Integer telefone;
     private String email;
     private Date dataNasc;
     private Integer clearenceLevel;
     private Set logins = new HashSet(0);

    public Funcionarios() {
    }

	
    public Funcionarios(Departamentos departamentos, int cpf) {
        this.departamentos = departamentos;
        this.cpf = cpf;
    }
    public Funcionarios(Departamentos departamentos, String nome, String endereco, String cidade, int cpf, Integer telefone, String email, Date dataNasc, Integer clearenceLevel, Set logins) {
       this.departamentos = departamentos;
       this.nome = nome;
       this.endereco = endereco;
       this.cidade = cidade;
       this.cpf = cpf;
       this.telefone = telefone;
       this.email = email;
       this.dataNasc = dataNasc;
       this.clearenceLevel = clearenceLevel;
       this.logins = logins;
    }
   
    public Integer getIdFuncionario() {
        return this.idFuncionario;
    }
    
    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getCpf() {
        return this.cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public Integer getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDataNasc() {
        return this.dataNasc;
    }
    
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public Integer getClearenceLevel() {
        return this.clearenceLevel;
    }
    
    public void setClearenceLevel(Integer clearenceLevel) {
        this.clearenceLevel = clearenceLevel;
    }
    public Set getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set logins) {
        this.logins = logins;
    }




}


