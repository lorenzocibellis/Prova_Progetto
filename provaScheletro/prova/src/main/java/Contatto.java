/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matti
 */
public class Contatto implements Comparable<Contatto> {
    
    
    private String nome;
    private String cognome;
    private String[] numeri;
    private String[] emails;

    public Contatto(){};

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
    public int hashCode(){
    }
    
    @Override
    public int compareTo(Contatto o) {
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}
