package edu.upvictoria.fpoo.Ejercicio5;

public class Area {
        public static float area(float A, float B, float C){
            float a=A-C;
            float AreaTriangulo=(a*B)/2;
            float AreaRectangulo=B*C;
            float areafigura=AreaTriangulo+AreaRectangulo;

            return areafigura;
        }
}
