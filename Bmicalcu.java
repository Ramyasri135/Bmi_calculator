import java.util.Scanner;
public class Bmicalcu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight: ");
        double weight=sc.nextDouble();
        System.out.println("enter height: ");
        double height=sc.nextDouble();
        System.out.println("weight: "+(weight));
        System.out.println("height: "+(height));
        double bmi=weight/(height*height);
        System.out.println("bmi: "+(bmi)+"kg/m2");
        if(bmi<=18.5){
            System.out.println("underweight");
        }else if(bmi>=18.5 && bmi<=25){
            System.out.println("normal weight");
        }else{
            System.out.println("over weight");
        }
    }
}
