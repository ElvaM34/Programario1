package edu.upvictoria.fpoo.Ejercicio1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProblemaUno {

        public static void main(String[] args) throws IOException {

            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
            System.out.println("\n\nproblema 1");
            System.out.println("\n********suma dos puntos********\n\n");
            System.out.println("Ingrese el primer numero: ");
            String entrada = br.readLine();
            float n1 = Float.parseFloat(entrada);
            System.out.println("Ingrese el segundo numero: ");
            String entrada2 = br.readLine();
            float n2 = Float.parseFloat(entrada2);
            float Total=Sumar.suma(n1,n2);
            System.out.println("Resultado: "+ Total);
        }

}
