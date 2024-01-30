package edu.upvictoria.fpoo.Ejercicio17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema17 {
    public Problema17() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 17");
        System.out.println("\n********Teorema de pitagoras********\n\n");
        System.out.println("Ingrese el valor del cateto adyacente: ");
        String entrada = br.readLine();
        float a = Float.parseFloat(entrada);
        System.out.println("Ingrese el valor del cateto opuesto: ");
        String entrada1 = br.readLine();
        float b = Float.parseFloat(entrada1);
        float c=Hipotenusa.raiz(a,b);
        System.out.println("c= "+ c);
    }
}