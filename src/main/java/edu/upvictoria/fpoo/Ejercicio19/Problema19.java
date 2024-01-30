package edu.upvictoria.fpoo.Ejercicio19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema19 {
    public Problema19() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 19");
        System.out.println("\n********Calcular tiempo********\n\n");
        System.out.println("Ingrese la distancia en kilometros: ");
        String entrada = br.readLine();
        float distancia = Float.parseFloat(entrada);
        System.out.println("Ingrese la velocidad constante: ");
        String entrada2 = br.readLine();
        float velocidad = Float.parseFloat(entrada2);
        float tiempo=Tiempo.calcular(distancia,velocidad);
        System.out.println("Monto toal: $"+ tiempo);
    }
}