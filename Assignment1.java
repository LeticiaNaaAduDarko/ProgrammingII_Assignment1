import java.util.Formatter;
import java.util.Scanner;

class BMICalculator{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Name: ");
        String name = userInput.nextLine();
        System.out.println("Height: ");
        double height = userInput.nextDouble();
        System.out.println("Weight: ");
        double weight = userInput.nextDouble();
        double BMI = weight/(height*height);
        Formatter formatter = new Formatter();
        formatter.format("%.2f",BMI);
        System.out.println(name + ", your BMI is "  + formatter.toString() + " kg/m^2 ");
    }
}

class Rectangle{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Length: ");
        int length = userInput.nextInt();
        System.out.println("Width: ");
        int width = userInput.nextInt();
        double surfaceArea = length*width;
        Formatter formatter = new Formatter();
        formatter.format("%.4f", surfaceArea);
        long perimeter = (long) 2*(length + width);
        System.out.println("The area of a rectangle using double datatype is " + formatter.toString() + " m^2");
        System.out.println("The perimeter of the rectangle using long datatype is " + perimeter + " m");
    }
}

