/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program01;

/**
 *
 * @author ronsilva
 */
import java.util.Scanner;

public class Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double tempc, tempf;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        tempc = keyboard.nextDouble();
        tempf = (9.0 / 5.0) * tempc + 32;
        System.out.println("Temperature in Fahrenheit " + tempf);
    }
}
