package edu.upvictoria.fpoo.Ejercicio20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema20 {
    public Problema20() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 20");
        System.out.println("\n********Tarifa por llamada********\n\n");
        System.out.println("Ingrese el costo por minuto: ");
        String entrada = br.readLine();
        float costo = Float.parseFloat(entrada);
        System.out.println("Ingrese la duracion de la llamada en minutos: ");
        String entrada2 = br.readLine();
        float minutos = Float.parseFloat(entrada2);
        float CostoTotal=Llamada.multiplicar(costo,minutos);
        System.out.println("Monto toal: $"+ CostoTotal);
    }
}