/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author jerry
 */
public class Doctorr extends Persona {
    //atributos estudiante
    private String profesion;
    private String especialidad;
  
    
    // metodos estudiante,heredados de calse Persona
    public Doctorr(String carrera, String clase){
        
        
        establecerNombre("Imelda Sarai");
        establecerApellido("Coello Osorto");
        
        this.profesion = profesion;
        this.especialidad = especialidad;
        
        
       
        
   //metodo mostrar Datos
    }
    public void mostrarDoctor(){
        
        System.out.println("Profesion: "+profesion);
        System.out.println("Especialidad: "+especialidad);
        
    }
// metodo abstracto
    @Override
    public String obtenerInformacionPersona() {
        return "--------Informacion para Doctor----------";
    }
}
