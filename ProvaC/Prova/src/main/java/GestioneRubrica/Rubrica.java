/**
 * @file Rubrica.java
 * 
 * @brief Classe per la gestione di una rubrica di contatti.
 *
 *        Questa classe consente di gestire un insieme di contatti, permettendo operazioni
 *        come aggiungere, rimuovere, cercare, importare ed esportare contatti da e verso file esterni.
 */
 


package GestioneRubrica;


import javafx.collections.ObservableList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Rubrica {
    
    /**
     * Lista osservabile dei contatti al fine di poter sfruttare al meglio 
     * la libreria javafx
     */
    private ObservableList<Contatto> contactList;
    
    /**
     * Costruttore della classe Rubrica, che sarà inizialmente vuota
     * 
     */
    public Rubrica(){}
    
    
    /**
    *  @brief Aggiunge un contatto alla lista dei contatti.
    *
    *         Questo metodo consente di aggiungere un oggetto di tipo {@code Contatto} 
    *         a una collezione o struttura dati (ad esempio, una lista). Se il contatto 
    *         è già presente o se ci sono condizioni particolari per l'aggiunta (come 
    *         valori null o duplicati), il metodo può gestirle restituendo un valore booleano.
    *
    * @param c il contatto da aggiungere, rappresentato come un oggetto {@code Contatto}.
    *          Non può essere {@code null}.
    * 
    * @return {@code true} se il contatto è stato aggiunto con successo;
    *         {@code false} altrimenti (ad esempio, se il contatto è già presente 
    *         o se l'aggiunta non è consentita per altri motivi).
    * 
    * @throws determinare quale eccezioni richiamare, ad esempio NullPointerException nel momento in cui il valore è null
    * 
    */
    public boolean aggiungiContatto(Contatto c){
      //Da completare 
    }
    
    /**
     *  @brief Rimuove un contatto da una lista osservabile di contatti.
     *
     *         Questo metodo consente di rimuovere un oggetto di tipo {@code Contatto} 
     *         da una lista osservabile ({@code ObservableList}). La rimozione può avvenire 
     *         in base a criteri definiti nell'implementazione del metodo (ad esempio, 
     *         corrispondenza con un contatto esistente nella lista).
     *
     * @param list la lista osservabile ({@code ObservableList<Contatto>}) 
     *             da cui rimuovere il contatto. Non può essere {@code null}.
     * @return {@code true} se il contatto è stato rimosso correttamente;
     *         {@code false} se il contatto non è presente in {@code list} o per altri motivi
     *
     * @throws Da determinare le eccezioni da richiamare per questo metodo
     */
    public boolean rimuoviContatto(ObservableList<Contatto> list){  
    }
    
    
    
    /**
     * @brief Ricerca nella lista osservabile i contatti avente corrispondenza con la stringa inserita dall'utente
     * 
     * @param s la sottostringa inserita nel textfield corrispondente dall'utente
     * 
     * @return la sotto-rubrica cui fanno parte i contatti avente corrispondenza alla sottostringa {@code s}
     * 
     * @throws da determinare le eccezioni corrispondenti al metodo
     */
    public Rubrica ricercaContatti(String s){
    
    }
    
    /**
     * @brief Importa da file esterno una rubrica intera
     * 
     *        Viene richiamato questo metodo nel momento in cui l'utente preme il bottone corrispondente
     *        Si gestiscono anche i casi in cui il file scelto dall'utente non ha il formato adatto
     * 
     * @param nomefile Il nome del file da cui importare la rubrica
     * 
     * @pre nomefile deve essere una stringa non vuota
     * 
     * @post La rubrica contenuta nel file avente come nome nomefile viene caricata come rubrica nell'applicazione
     * 
     * @throws da determinare le eccezioni / errori in cui si può incorrere
     */
    public void importaRubrica(String nomefile){
    
    }
    
    /**
     * @brief Esporta la rubrica intera
     * 
     *        Si richiama questo metodo quando l'utente preme sul bottone corrispondente
     *        e si determina non solo la locazione del file ma anche la sua estensione
     * 
     * @param nomefile Il nome del file su cui esportare la rubrica
     * 
     * @pre nomefile deve essere una stringa non vuota
     * 
     * @post Viene creato sul computer un file contenente la rubrica 
     * 
     * @throws da determinare le eccezioni/errori in cui si può incorrere
     */
    public void esportaRubrica(String nomefile){
    
    }
    
}
