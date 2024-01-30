package edu.upvictoria.fpoo.Ejercicio10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema10 {

    public Problema10() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 10");
        System.out.println("\n********Metros a Pulgadas********\n\n");
        System.out.println("Ingrese la cantidad de metros ");
        String entrada = br.readLine();
        float metros= Float.parseFloat(entrada);
        float convertir=Convertir.multiplicar(metros);
        System.out.println("Equivalen a: "+ convertir+" pulgadas");
    }
}