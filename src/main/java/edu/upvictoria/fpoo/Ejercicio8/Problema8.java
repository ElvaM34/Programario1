package edu.upvictoria.fpoo.Ejercicio8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema8 {

    public Problema8() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 8");
        System.out.println("\n********distancia de dos puntos en el plano cartesiano********\n\n");
        System.out.println("Ingrese x1: ");
        String entrada = br.readLine();
        int x1 = Integer.parseInt(entrada);
        System.out.println("Ingrese x2: ");
        String entrada2 = br.readLine();
        int x2 = Integer.parseInt(entrada2);
        System.out.println("Ingrese y1: ");
        String entrada3 = br.readLine();
        int y1 = Integer.parseInt(entrada3);
        System.out.println("Ingrese : y2");
        String entrada4 = br.readLine();
        int y2 = Integer.parseInt(entrada4);
        float distancia=Distancia.puntos(x1,x2,y1,y2);
        System.out.println("Distancia del punto A al punto B: "+ distancia);

    }
}