import java.util.*;
import java.lang.*;

class ComputeMethods5026211153{

	public double fToC(double degreesF){

            float degreeC = (float)5 / 9 ;
            double result = degreeC * (degreesF - 32);
            System.out.println("Temp in celcius is " + result);
            return degreeC;
        }

        public double hypotenuse(int a, int b){

            double   c = Math.sqrt((a*a)+(b*b));
            System.out.println("Hypotenuse is " + c);
            return c;
        }

        public int roll(){
            Random randomNumber = new Random();
            int a1 = randomNumber.nextInt(5) + 1;
            int a2 = randomNumber.nextInt(5) + 2;
            int sumd = a1 + a2;
            System.out.println("The sum of the values is" + sumd);
            return sumd;
        }
    }