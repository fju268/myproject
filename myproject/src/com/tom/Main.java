package com.tom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args)throws Exception {
		
		        System.out.println("Hello World!");
		        FileOutputStream fos = new FileOutputStream("dd.txt");
		        FileWriter fs = new FileWriter("dd.txt");
		        char c []= {0x5E79,0x4F60,0x7DA0,0x8C46 ,0x6E6F };
		        fs.write(c);
		        fs.flush();
		        fs.close();
		    }

		}


