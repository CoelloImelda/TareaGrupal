
import helpers.Deportista;
import helpers.Doctorr;



public class Modulo6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //objetos 
        Doctorr doctor = new Doctorr("Ing.Computacion","Programacion Objetos");
        Deportista deportista = new Deportista("Futbol","Barcelona");
       
        
            
            System.out.println("///////////");
           
         
           System.out.println(doctor.obtenerInformacionPersona());
     // imprimir diferentes datos creados
        doctor.MostrarDatos();
        doctor.mostrarDoctor();
        System.out.println(deportista.obtenerInformacionPersona());
        deportista.MostrarDatos();
        deportista.MostrarDeportista();
      
    }
    
}
