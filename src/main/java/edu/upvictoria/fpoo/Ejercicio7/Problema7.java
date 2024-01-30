package edu.upvictoria.fpoo.Ejercicio7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema7 {

    public Problema7() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 7");
        System.out.println("\n********Galones y Litros********\n\n");
        System.out.println("Ingrese la cantidad de leche producida (litros): ");
        String entrada = br.readLine();
        float litros = Float.parseFloat(entrada);
        System.out.println("Ingrese el precio del galon: ");
        String entrada2 = br.readLine();
        float costoGalon = Float.parseFloat(entrada2);
        double costo=Convertir.convertir(litros,costoGalon);
        System.out.println("le deben pagar: "+ costo);

    }
}