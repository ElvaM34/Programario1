package edu.upvictoria.fpoo.Ejercicio3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema3 {

    public Problema3() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 3");
        System.out.println("\n********Area de rectangulo********\n\n");
        System.out.println("Ingrese base: ");
        String entrada = br.readLine();
        int a = Integer.parseInt(entrada);
        System.out.println("Ingrese altura: ");
        String entrada2 = br.readLine();
        int b = Integer.parseInt(entrada2);
        System.out.println(Area.multiplicar(a,b));
    }
}