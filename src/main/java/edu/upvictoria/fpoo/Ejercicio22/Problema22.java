package edu.upvictoria.fpoo.Ejercicio22;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema22 {
    public Problema22() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 15");
        System.out.println("\n********Tarifa de KW consumidos*******\n\n");
        System.out.println("Ingrese el costo de KW por hora: ");
        String entrada = br.readLine();
        float costo = Float.parseFloat(entrada);
        System.out.println("Ingrese el consumo de KW por hora: ");
        String entrada2 = br.readLine();
        float consumo = Float.parseFloat(entrada2);
        float CostoTotal=KW_H.monto(consumo,costo);
        System.out.println("Monto toal: $"+ CostoTotal);
    }
}
