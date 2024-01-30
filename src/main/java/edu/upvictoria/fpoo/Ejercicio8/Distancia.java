package edu.upvictoria.fpoo.Ejercicio8;

public class Distancia {
    public static float puntos(int x1,int x2, int y1, int y2){
        float distancia=(float)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));


        return distancia;
    }
}
