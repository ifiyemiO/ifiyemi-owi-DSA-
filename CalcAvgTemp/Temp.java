package CalcAvgTemp;

import java.util.Scanner;
public class Temp{
    double [] temp;

    public Temp (){
        temp = new double[5];
    }

    public double getAverageTemp(double[] temp){
        double sum = 0.0;
        for(int i = 0; i < temp.length; i++){
            sum += temp[i];
        }
        return sum / temp.length;
    }

    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Temp t = new Temp();

        for(int i = 0; i < t.temp.length; i++){
            System.out.print(" Enter Temperature: ");
            t.temp[i] = input.nextDouble();
        }
       
        double average = t.getAverageTemp(t.temp);
        System.out.println("Average Temperature: " + average);


    }
}


