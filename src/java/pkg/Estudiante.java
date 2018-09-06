/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

/**
 *
 * @author tosh
 */
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tosh
 */
@XmlRootElement
public class Estudiante {
    public String id;
    public String nombre;

    public Estudiante(){
        this.id = "";
        this.nombre = "";
    }
    
    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
     public String toString(){
        return new StringBuffer(" id: ").append(id).
                    append(" nombre: ").append(nombre).toString();
    }
}