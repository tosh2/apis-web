/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author tosh
 */
public class EstudianteBorrar {

    private String id;

    /**
     * Creates a new instance of EstudianteBorrar
     */
    private EstudianteBorrar(String id) {
        this.id = id;
    }

    /**
     * Get instance of the EstudianteBorrar
     */
    public static EstudianteBorrar getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of EstudianteBorrar class.
        return new EstudianteBorrar(id);
    }

    /**
     * Retrieves representation of an instance of pkg.EstudianteBorrar
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of EstudianteBorrar
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource EstudianteBorrar
     */
    @DELETE
    public void delete() {
    }
}
