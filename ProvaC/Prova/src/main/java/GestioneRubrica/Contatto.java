package GestioneRubrica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Contatto implements Comparable<Contatto> {
      
    private String nome;
    private String cognome;
    private String[] numeri;
    private String[] emails;

    public Contatto(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumero1(String numero) {
        numeri[0] = numero;
    }

    public void setNumero2(String numero) {
        numeri[1] = numero;
    }

    public void setNumero3(String numero) {
        numeri[2] = numero;
    }

    public void setEmail1(String email) {
        emails[0] = email;
    }

    public void setEmail2(String email) {
        emails[1] = email;
    }

    
    public void setEmail3(String email) {
        emails[2] = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String[] getNumeri() {
        return numeri;
    }

    public String[] getEmails() {
        return emails;
    }

    
    public void modificaContatto(){
        
    }
    
    @Override
    public int compareTo(Contatto o) {
    }
}
