public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(-3)); //Expected outcome ==> -1
        System.out.println(area(-1)); //Expected outcome ==> -1

        System.out.println("Calculate area: " + area(4)); // Expected outcome ==> 50.26
        System.out.println("Calculate area: " + area(5,5)); //Expected outcome ==> 25.00
        System.out.println("Calculate area: " + area(2.0,5.5)); //Expected outcome ==> 11.0

    }

    //calculate the area of a circle
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * (radius * radius);
    }

    //Calculate the area of a rectangle
    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }


}
