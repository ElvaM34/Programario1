package edu.upvictoria.fpoo.Ejercicio6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema6 {

    public Problema6() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 3");
        System.out.println("\n********Area de Helado********\n\n");
        System.out.println("Ingrese el radio: ");
        String entrada = br.readLine();
        float r = Float.parseFloat(entrada);
        System.out.println("Ingrese hipotenusa: ");
        String entrada2 = br.readLine();
        float h = Float.parseFloat(entrada2);
        float AreaFigura=Area.area(r, h);
        System.out.println("El area del terreno es "+ AreaFigura);
    }
}