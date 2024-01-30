package edu.upvictoria.fpoo.Ejercicio9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema9 {

    public Problema9() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 9");
        System.out.println("\n********Sueldo Semanal********\n\n");
        System.out.println("Horas trabajadas a la semana: ");
        String entrada = br.readLine();
        float horas = Float.parseFloat(entrada);
        System.out.println("Pago por hora: ");
        String entrada2 = br.readLine();
        float pago = Float.parseFloat(entrada2);
        float PagoSemana=Pago.multiplicar(horas,pago);
        System.out.println("Su sueldo semanal es de: $ "+ PagoSemana);
    }
}