/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystudentlistah;

/**
 *
 * @author lorenzocibellis
 */
public class Student implements Comparable<Student>{
    
    private String name;
    private String surname;
    private String code;

    public Student(String name, String surname, String code){
        
        this.name = name;
        this.surname = surname;
        this.code = code;
        
        
    }
    
    
    public String getName(){
        
        
        return this.name;
        
        
    }
    
    
    
    public String getSurname(){
        
        
        return this.surname;
        
        
    }
    
    
    
    public String getCode(){
        
        
        return this.code;
        
        
    }
    
    
    
    
    public void setName(String name){
        
        
       this.name = name;
        
        
    }
    
    
    
    public void setSurname(String surname){
        
        
       this.surname = surname;
        
        
    }
    
    
    
    
    public void setCode(String code){
        
        
       this.code = code;
        
        
    }
    
    
    
    @Override
    public int compareTo(Student s){
        return this.getCode().compareTo(s.getCode());
    }
   
    @Override
    public int hashCode(){
        return this.getCode().hashCode();
    }
    
    
    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (obj == this) return true;
        if(!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        if (s.getCode().equals(this.getCode())) return true;
        return false;
    }
    
    
}
