package edu.upvictoria.fpoo.Ejercicio15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema15 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 15");
        System.out.println("\n********Tarifa de estacionamiento********\n\n");
        System.out.println("Ingrese las horas estacionado: ");
        String entrada = br.readLine();
        float horas = Float.parseFloat(entrada);
        int CostoTotal=Redondear.convertir(horas);
        System.out.println("Monto toal: $"+ CostoTotal);
    }
}
