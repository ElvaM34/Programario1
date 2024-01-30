package edu.upvictoria.fpoo.Ejercicio13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema13{

    public Problema13() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 13");
        System.out.println("\n********Peso(MXN) a dollar(USD)********\n\n");
        System.out.println("Ingrese la cantidad de peso (MXN) a convertir: ");
        String entrada = br.readLine();
        Float pesos = Float.parseFloat(entrada);
        double Conversion=Convertir.total(pesos);
        System.out.println("tu dinero equivale a :$"+ Conversion + " dolares");
    }
}
