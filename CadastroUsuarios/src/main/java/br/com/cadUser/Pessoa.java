package br.com.cadUser;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@SuppressWarnings("deprecation")
@Named
@javax.faces.bean.RequestScoped
@ManagedBean
public class Pessoa {
	private String nome;
    private ArrayList<String> listaNomes = new ArrayList<>();

    // Getter and Setter for 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter for 'listaNomes'
    public ArrayList<String> getListaNomes() {
        return listaNomes;
    }

    // Method to add a name to the list
    public void adicionarNome() {
        if (nome != null && !nome.isEmpty()) {
            listaNomes.add(nome);
            nome = ""; // Clear the input field after addition
        }
    }

}
