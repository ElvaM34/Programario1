package edu.upvictoria.fpoo.Ejercicio12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema12 {


    public Problema12() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 12");
        System.out.println("\n********Area de triangulo********\n\n");
        System.out.println("Ingrese base: ");
        String entrada = br.readLine();
        float base = Float.parseFloat(entrada);
        System.out.println("Ingrese altura: ");
        String entrada2 = br.readLine();
        float altura =Float.parseFloat(entrada2);
        float area=Area.triangulo(base,altura);
        System.out.println("area del triangulo: "+ area);
    }
}
