/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "Luis Javier";
        String apellidoEstudiante = "Mora Aguilar";
        int nacimiento = 2004;
        
        /*System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento);  */
        System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);  
        System.out.println(nombreEstudiante+"\n\t"+apellidoEstudiante);  
    }
}
