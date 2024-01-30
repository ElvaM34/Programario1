package edu.upvictoria.fpoo.Ejercicio14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema14 {

    public Problema14() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 14");
        System.out.println("\n********Calcular edad*******\n\n");
        int año=1990;
        do {
            System.out.println("Ingrese el a\u00f1o en que nacio: ");
            String entrada = br.readLine();
            año = Integer.parseInt(entrada);
        }while(año<1900);
        int edad=EDAD.resta(año);
        System.out.println("Edad: " + edad);
    }
}
