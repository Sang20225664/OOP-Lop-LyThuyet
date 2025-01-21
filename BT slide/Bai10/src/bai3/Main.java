package bai3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void splitListIntegers(String file) {
        OutputData out = readListIntegers(file);		
        if(out.data==null) return;
        for(int i=0;i<out.data.length;i++) {
            try {
                File myObj = new File("filename"+i+".txt");
                System.out.println();
                if (myObj.createNewFile()) {
                    System.out.println("File created: " 
                        + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }		
            try {
                FileWriter myWriter = 
                new FileWriter("filename"+i+".txt");	   	  
                try {
                    myWriter.write("" + out.size[i]+"\n");
                    if(out.size[i]!=0) {				    	
                        for(int j=0;j<out.data[i].length;j++) 
                            myWriter.write(""+out.data[i][j]+"\n");					  
                    }
                }	      
                finally {
                    myWriter.close();
                }
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }	
    public static OutputData readListIntegers(String file) {
        OutputData output = new OutputData();	
        try {	      
            checkEmptyString(file);
            BufferedReader input = 
                new BufferedReader(new FileReader(file));
            try {
                String line = null; 
                int num = 0, n = -1;
                int j = 0, k = -1;
                while ((n<num)&&((line = input.readLine()) != null)){        
                    int i = Integer.parseInt(line);
                    System.out.println("OK int:" + i);
                    if(num==0) {
                        if(i<=0) break;	          
                        else {
                            num = i;
                            n = 0;		        	  
                            int[][] oo;
                            if(num%4==0) {
                                oo = new int[4][num/4];
                            } else {
                                oo = new int[4][num/4 + 1];
                            }
                            output.data = oo;		       	 		        	  
                        }
                    } else {
                        n++;
                        k++;
                        int dim2 = output.data[0].length;
                        if(k == dim2) {k=0; j++;}
                        output.data[j][k] = i;
                        output.size[j] = k+1;
                        output.n = n;
                    }
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
            output.data = null;
            output.n = 0;
            ex.printStackTrace();
        } 	    
        catch (FileNotFoundException ex){
            System.out.println("File Not Found Exception");
            ex.printStackTrace();
        }
        catch (IOException ex){
            System.out.println("IO Exception");
            output.data = null;
            output.n = 0;
            ex.printStackTrace();
        }	    
        return output;
    }	
    public static void main(String[] args) {
        splitListIntegers("filenamets");
    }
    public static void checkEmptyString(String s) 
    throws EmptyStringException {
        if(s.trim().equals("")) throw new EmptyStringException();
    }
}
class EmptyStringException extends Exception {}
class OutputData {
    int[][] data;
    int[] size = new int[4];
    int n;
}