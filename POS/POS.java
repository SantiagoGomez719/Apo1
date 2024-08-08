
import java.util.Scanner;

public class POS 
{
    
    public static void main(String[] args) {
        String nombreProducto;
        float vlrUnitario, vlrCobrar;
        final float IVA=0.19f;
        Scanner lector = new Scanner(System.in);
         System.out.println("Ingrese el nombre del producto");
        nombreProducto = lector.next();

        System.out.println("Ingrese el valor Unitario del producto");
        vlrUnitario = lector.nextFloat();
        vlrCobrar = vlrUnitario + (vlrUnitario * IVA);

        System.out.println("Este es el total a pagar " + vlrCobrar);
        }
}