
import java.util.*;

public class HolaMundo
{
    static String nombre ="wazaa";
    static int edad = 40;
public static void main 
        (String[ ] arg)
    {
        System.out.println("Hola Mundo");
        Scanner lectorConsola = new Scanner(System.in);
        nombre = lectorConsola.next();
        System.out.println(nombre);
    }    
}