package edu.upvictoria.fpoo.Ejercicio6;

public class Area {
    public static float area(float r, float h){
        float cateto=(float) Math.sqrt(Math.pow(h,2)-Math.pow(r,2));
        float AreaTriangulo =((r*2)*cateto)/2 ;
        float AreaCirculo=(float)((Math.PI*(r*r))/2);
        float AreaFigura=AreaCirculo+AreaTriangulo;



        return AreaFigura;
    }
}
