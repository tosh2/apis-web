/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * REST Web Service
 *
 * @author tosh
 */
@Path("/estudiantes")
public class EstudiantesApis {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EstudiantesApis
     */
    public EstudiantesApis() {
    }

    /**
     * Retrieves representation of an instance of pkg.EstudiantesApis
     * @return an instance of java.lang.String
     * Para acceder a este metodo utilizar la url con metodo GET
     * http://localhost:8080/apis-web/rest-apis/estudiantes
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Estudiante getJson() {
        //TODO return proper representation object
        return new Estudiante("1", "josue");
    }

    /**
     * POST method for creating an instance of EstudianteBorrar
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     * Para acceder a este metodo utilizar la url con metodo POST
     * http://localhost:8080/apis-web/rest-apis/estudiantes
     * con el siguiente JSON: {"id":"1","nombre":"josue"}
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Estudiante postJson(Estudiante content) {
        //TODO
        //  content.id  -> aqui ya podemos acceder a los atributos del objeto content que es un estudiante
        // y agregarlo a nuestras estructuras
        return content;
    }
     
    
    /*
    * Para acceder a este metodo utilizar la url con metodo POST
    http://localhost:8080/apis-web/rest-apis/estudiantes/all
    */
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estudiante> getEstudiantes() {
        
        List<Estudiante> listadoSerial = new ArrayList<Estudiante>();
        listadoSerial.add(new Estudiante("1", "josue"));
        listadoSerial.add(new Estudiante("2", "david"));
            
        return listadoSerial;
    }
    
    
    /**
     * Sub-resource locator method for {id}
     */
    @Path("{id}")
    public EstudianteBorrar getEstudianteBorrar(@PathParam("id") String id) {
        return EstudianteBorrar.getInstance(id);
    }
    
    
}
