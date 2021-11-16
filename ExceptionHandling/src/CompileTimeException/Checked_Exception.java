package CompileTimeException;
// Java Program to Handle Checked Exception
import java.io.*;

public class Checked_Exception {
	
	    public static void main(String args[]) throws FileNotFoundException
	    {
	        FileInputStream GFG
	            = new FileInputStream("/home/mayur/GFG.txt");
	        // this file does not exist in the location
	        /* This constructor FileInputStream
	         * throws FileNotFoundException which
	         * is a checked exception
	         */
	    }
	}
