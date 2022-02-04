/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package profesores;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.IndexColumn;

/**
 *
 * @author juanr
 */ 
@Entity
@Table(name="profesor")
public class Profesor  implements Serializable{
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="edad")
    private int edad;
    
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="IdProfesor")
    @IndexColumn(name="idx")
    private List<CorreoElectronico> correosElectronicos;
    
    public Profesor(){
        
    }

    public Profesor(int id, String nombre, int edad, List<CorreoElectronico> correosElectronicos) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correosElectronicos = correosElectronicos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<CorreoElectronico> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(List<CorreoElectronico> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }
    
   
    
    
}
