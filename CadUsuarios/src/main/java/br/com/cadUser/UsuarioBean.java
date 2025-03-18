package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private List<String> listaNomes = new ArrayList<>();

    // Getter and Setter for 'nome'
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter for 'listaNomes'
    public List<String> getListaNomes() {
        return listaNomes;
    }

    // Method to add a name to the list
    public void adicionarNome() {
        if (nome != null && !nome.trim().isEmpty()) {
            listaNomes.add(nome); // Add the name to the list
            nome = ""; // Clear the input field
        }
    }
}
