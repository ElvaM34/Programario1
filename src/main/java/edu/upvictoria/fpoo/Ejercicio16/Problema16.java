package edu.upvictoria.fpoo.Ejercicio16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema16 {
    public Problema16() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 16");
        System.out.println("\n********La brocha gorda********\n\n");
        System.out.println("Ingrese el costo por m^2: ");
        String entrada = br.readLine();
        float metros = Float.parseFloat(entrada);
        System.out.println("Ingrese los m^2 que desea pintar: ");
        String entrada2 = br.readLine();
        float presupuestar = Float.parseFloat(entrada2);
        float CostoTotal=Redondear.convertir(metros,presupuestar);
        System.out.println("Monto toal: $"+ CostoTotal);
    }
}