package edu.upvictoria.fpoo.Ejercicio5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema5 {

    public Problema5() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 5");
        System.out.println("\n********Area de Terreno********\n\n");
        System.out.println("Ingrese la base del terreno: ");
        String entrada = br.readLine();
        float B = Float.parseFloat(entrada);
        System.out.println("Ingrese la altura del lado mas alto: ");
        String entrada2 = br.readLine();
        float A = Float.parseFloat(entrada2);
        System.out.println("Ingrese la altura del lado mas bajo: ");
        String entrada3 = br.readLine();
        float C = Float.parseFloat(entrada3);
        float areafigura=Area.area(A,B,C);
        System.out.println("El area del terreno es "+ areafigura);
    }
}
