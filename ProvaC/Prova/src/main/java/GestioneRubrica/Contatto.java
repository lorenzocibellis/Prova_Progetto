package GestioneRubrica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Rappresenta un contatto all'interno di una rubrica.
 *
 * Questa classe contiene le informazioni necessarie come nome, cognome,
 * numeri di telefono e indirizzi email (gli ultimi due campi di informazioni possono avere un massimo di 3 elementi ognuno).
 * Consente di gestire e modificare i dati del contatto.
 * Implementa l'interfaccia {@code Comparable} per consentire il confronto e l'ordinamento.
 * Si sfruttano i metodi setter e getter per far modificare o prelevare un valore 
 * ma senza fornire direttamente un accesso ai singoli campi del contatto
 * @author christian de cesare
 */
public class Contatto implements Comparable<Contatto> {
   
    /**
     * Nome del contatto.
     */
    private String nome;

    /**
     * Cognome del contatto.
     */
    private String cognome;

    /**
     * Array di numeri di telefono del contatto, sono opzionali (fino a 3).
     */
    private String[] numeri;

    /**
     * Array di indirizzi email del contatto, sono opzionali (fino a 3).
     */
    private String[] emails;

    /**
     * Costruttore predefinito della classe Contatto,
     * il quale crea un contatto vuoto
     */
    public Contatto() {
        // Inizializza gli array per evitare NullPointerException
        //Ma si potrebbe anche inizializzare i singoli elementi ad un valore prefissato
        numeri = new String[3];
        emails = new String[3];
    }

    /**
     * Imposta il nome del contatto. 
     * 
     *
     * @param nome il nome del contatto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Imposta il cognome del contatto.
     *
     * @param cognome il cognome del contatto.
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Imposta il primo numero di telefono del contatto.
     *
     * @param numero il numero di telefono da impostare.
     */
    public void setNumero1(String numero) {
        numeri[0] = numero;
    }

    /**
     * Imposta il secondo numero di telefono del contatto.
     *
     * @param numero il numero di telefono da impostare.
     */
    public void setNumero2(String numero) {
        numeri[1] = numero;
    }

    /**
     * Imposta il terzo numero di telefono del contatto.
     *
     * @param numero il numero di telefono da impostare.
     */
    public void setNumero3(String numero) {
        numeri[2] = numero;
    }

    /**
     * Imposta il primo indirizzo email del contatto.
     *
     * @param email l'indirizzo email da impostare.
     */
    public void setEmail1(String email) {
        emails[0] = email;
    }

    /**
     * Imposta il secondo indirizzo email del contatto.
     *
     * @param email l'indirizzo email da impostare.
     */
    public void setEmail2(String email) {
        emails[1] = email;
    }

    /**
     * Imposta il terzo indirizzo email del contatto.
     *
     * @param email l'indirizzo email da impostare.
     */
    public void setEmail3(String email) {
        emails[2] = email;
    }

    /**
     * Restituisce il nome del contatto.
     *
     * @return il nome del contatto come {@code String}.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce il cognome del contatto.
     *
     * @return il cognome del contatto come {@code String}.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Restituisce l'array di numeri di telefono del contatto.
     *
     * @return un array di stringhe contenente i numeri di telefono.
     */
    public String[] getNumeri() {
        return numeri;
    }

    /**
     * Restituisce l'array di indirizzi email del contatto.
     *
     * @return un array di stringhe contenente gli indirizzi email.
     */
    public String[] getEmails() {
        return emails;
    }

    /**
     * Modifica i dettagli del contatto.
     *
     * Questo metodo permette di aggiornare le informazioni esistenti di un contatto.
     */
    public void modificaContatto() {
        // Da implementare: definire come aggiornare i dettagli del contatto.
    }

    /**
     * Confronta questo contatto con un altro contatto basandosi sul nome e sul cognome.
     *
     * L'ordinamento viene effettuato in ordine alfabetico, considerando prima il cognome
     * e poi il nome.
     *
     * @param o , l'oggetto di tipo {@code Contatto}, con cui confrontare
     * @return un valore negativo, zero o positivo se questo contatto è rispettivamente
     *         minore, uguale o maggiore rispetto al contatto specificato.
     * @throws da determinare quali eccezioni usare, un esempio
     *  potrebbe essere NullPointerException se il contatto fornito è {@code null}.
     */
    @Override
    public int compareTo(Contatto o) {
        if (o == null) {
            throw new NullPointerException("Il contatto da confrontare non può essere null.");
        }
        int cognomeComparison = this.cognome.compareToIgnoreCase(o.cognome);
        if (cognomeComparison != 0) {
            return cognomeComparison;
        }
        return this.nome.compareToIgnoreCase(o.nome);
    }
}
