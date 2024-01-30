package edu.upvictoria.fpoo.Ejercicio18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema18 {
    public Problema18() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 18");
        System.out.println("\n********La curva loca********\n\n");
        System.out.println("Costo por kilometro recorrido: ");
        String entrada = br.readLine();
        float PrecioK = Float.parseFloat(entrada);
        System.out.println("Kilometros a recorrer: ");
        String entrada2 = br.readLine();
        float Kilometros = Float.parseFloat(entrada2);
        float CostoTotal=Recorrido.multiplicar(PrecioK,Kilometros);
        System.out.println("Boleto en: $"+ CostoTotal);
    }
}

