package edu.upvictoria.fpoo.Ejercicio11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema11 {

    public Problema11() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 11");
        System.out.println("\n********Consumo de agua********\n\n");
        System.out.println("Ingrese el costo por metro cubico: ");
        String entrada = br.readLine();
        float costo = Float.parseFloat(entrada);
        System.out.println("Metros cubicos consumidos:");
        String entrada2 = br.readLine();
        float consumo = Float.parseFloat(entrada2);
        float Consumo=ConsumoTotal.total(costo,consumo);
        System.out.println("Total a pagar : $"+ Consumo);
    }
}