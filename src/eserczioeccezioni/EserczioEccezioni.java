/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eserczioeccezioni;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author B045_07
 */
public class EserczioEccezioni {


    public class TestExceptionReadInt {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		String line = in.next();
		int intValue = Integer.parseInt(line);
	    
		System.out.println("Valore: " + intValue);
		in.close();
                
                BufferedReader inr = new BufferedReader(new InputStreamReader(System.in));
                int lineR = inr.read();

	}

}
    
}
