package com.tom;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
		public class JavaExam    {
		    public static void main(String[] args) {
		        PrintWriter out= null;
		        try {

		            FileWriter fs = new FileWriter(" result.txt");
		            out= new PrintWriter(fs);
		            out.write("JAVA �x��A");
		            out.flush();
		            out.close();
		        } catch (FileNotFoundException e) {
		            System.out.println("�S���ɮ�");
		        }catch( java.io.IOException e){
		            System.out.println("�S���ɮ�");
		        }finally {
		            if(out!=null) {
		                out.close();
		            }
		        }
		    
		
		}
	
	}

