package project;

import java.util.Scanner;

public class CaculetorWithF {
    public static float InputNum(){
        float number1,number2;
        String opretor;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number:");
        number1 = in.nextFloat();
        System.out.print("Enter Second Number:");
        number2 = in.nextFloat();
        System.out.print("Enter opretor like(+,-,*,/,%):");
        opretor = in.next();

        return Calculet(number1,number2,opretor);
    }
    public static float Calculet(float num1,float num2,String opr){
        float result;
        switch(opr)
        {
            case "+":{
                result= num1+num2;
                break;
            }
            case "-": {
                result= num1 - num2;
                break;
            }
            case "*":{
                result= num1*num2;
                break;
            }
            case "/":{
                result= num1/num2;
                break;
            }
            case "%":{
                result= num1%num2;
                break;
            }
            default:{
                System.out.println("Opretor is invatid.");
                return 0;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(InputNum());
    }
}
