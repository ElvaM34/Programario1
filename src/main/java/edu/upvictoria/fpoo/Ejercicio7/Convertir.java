package edu.upvictoria.fpoo.Ejercicio7;

public class Convertir {
    static final double Galon=3.785;
    public static double convertir(float litros, float costoGalon){
        double GalonesEntregados= litros /Galon;
        double costo=GalonesEntregados*costoGalon;



        return costo;
    }
}
