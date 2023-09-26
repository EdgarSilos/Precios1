package edgarsilos.precios1;
import java.util.Scanner;
public class Precios1 {

    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        float n1,n2,n3,n4,n5,momo;
        System.out.print("ingresa el primer precio: ");
        n1=leer.nextFloat();
        System.out.print("ingresa otro precio: ");
        n2=leer.nextFloat();
        System.out.print("ingresa otro precio: ");
        n3=leer.nextFloat();
        System.out.print("ingresa otro precio: ");
        n4=leer.nextFloat();
        System.out.print("ingresa otro precio: ");
        n5=leer.nextFloat();
        System.out.print("ingresa otro precio: ");
        momo=(n1+n2+n3+n4+n5);
        System.out.print("El total del precio es: "+momo);      
            }
}
