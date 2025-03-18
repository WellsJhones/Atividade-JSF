package Pessoa;

import javax.faces.bean.ManagedBean;
//import jakarta.enterprise.context.RequestScoped;
//import jakarta.inject.Named;

@ManagedBean
	public class UsuarioBean {
	    private String nome;
	    private String sobrenome;
	    private String fone;
	    private String email;
	    private String output;

	    // Getters and Setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getSobrenome() {
	        return sobrenome;
	    }

	    public void setSobrenome(String sobrenome) {
	        this.sobrenome = sobrenome;
	    }

	    public String getFone() {
	        return fone;
	    }

	    public void setFone(String fone) {
	        this.fone = fone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getOutput() {
	        return output;
	    }

	    // Action Method
	    public String submit() {
	        output = "Obrigado por se cadastrar, " + nome + " " + sobrenome +
	                 "! Seus dados estão seguros conosco: Telefone - " + fone + 
	                 ", E-mail - " + email + ". Seja bem-vindo!";
	        return null; // Stay on the same page
	    }

}

