package bai2;

import java.io.*;
public class Main {
    public static void readListIntegers(String file) {
        try {	   
            checkEmptyString(file);
            BufferedReader input = 
                new BufferedReader(new FileReader(file));
            try {
                int n = Integer.parseInt(input.readLine());
                String line = null;
                while (n > 0) { 
                    n = n - 1;	  
                    line = input.readLine();
                    int i = Integer.parseInt(line);
                    System.out.println("OK int:" + i);
                }
            }
            finally {
                input.close();
            }
        } 
        catch (EmptyStringException ex){
            System.out.println("FileName Empty Exception");
            ex.printStackTrace();
        }
        catch (NumberFormatException ex) {
            System.out.println("Need integer in file!");
            ex.printStackTrace();
        } 	    
        catch (FileNotFoundException ex){
            System.out.println("File Not Found Exception");
            ex.printStackTrace();
        }
        catch (IOException ex){
            System.out.println("IO Exception");
            ex.printStackTrace();
        }	    
    }	
    public static void main(String[] args) {
        readListIntegers("filenamets");
    }
    public static void checkEmptyString(String s) 
    throws EmptyStringException {
        if(s.trim().equals("")) throw new EmptyStringException();
    }
}
class EmptyStringException extends Exception {}