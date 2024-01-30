package edu.upvictoria.fpoo.Ejercicio21;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema21 {
    public Problema21() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 21");
        System.out.println("\n********Tarifa de CONAGUA********\n\n");
        System.out.println("Ingrese el costo por metro cubico: ");
        String entrada = br.readLine();
        float costo = Float.parseFloat(entrada);
        System.out.println("Ingrese el consumo total: ");
        String entrada1 = br.readLine();
        float consumo = Float.parseFloat(entrada1);
        float CostoTotal=Conagua.multiplicar(costo,consumo);
        System.out.println("Monto toal: $"+ CostoTotal);
    }
}
