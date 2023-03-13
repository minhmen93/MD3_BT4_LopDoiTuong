package phuong_trinh_bac_2;

public class Phuong_Trinh_Bac_2 {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(2,5,2);
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        System.out.println("Root 1: "+ root1);
        System.out.println("Root 2: "+ root2);
    }
}
