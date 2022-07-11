package Level1.Task3;

public class Task3FindingSquare {
    public double FindingSquare(double x1, double x2, double x3, double y1, double y2, double y3){
        double S = ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
        return S;
    }
}
