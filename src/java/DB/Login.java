package DB;
// Generated 23/11/2020 19:14:42 by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer idLogin;
     private Funcionarios funcionarios;
     private String usuario;
     private String senha;

    public Login() {
    }

    public Login(Funcionarios funcionarios, String usuario, String senha) {
       this.funcionarios = funcionarios;
       this.usuario = usuario;
       this.senha = senha;
    }
   
    public Integer getIdLogin() {
        return this.idLogin;
    }
    
    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }
    public Funcionarios getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }




}


