package edu.upvictoria.fpoo.Ejercicio15;

public class Redondear {
    static final int Costo = 15;
    public static int convertir(float horas){

        int HorasRedondeadas= (int)Math.ceil(horas);
        int CostoTotal=HorasRedondeadas*Costo;
        return CostoTotal;
    }
}
