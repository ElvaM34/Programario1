package edu.upvictoria.fpoo.Ejercicio4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema4{
    public Problema4() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema a");
        System.out.println("\n********Area de circulo********\n\n");
        System.out.println("Ingrese el radio: ");
        String entrada = br.readLine();
        float r = Float.parseFloat(entrada);

        System.out.println(AreaCirculo.Circunferencia(r));
    }
}
