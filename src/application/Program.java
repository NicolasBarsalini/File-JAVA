package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] Args) {
		
		String path = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			//fr = new FileReader(path); //estabelece uma sequencia de leitura a partir do arquivo que estiver neste caminho
			//br = new BufferedReader(fr); //o buffered reader é instanciado a partir do file reader, lê o que esta nas memórias deixa + rápido a leitura
			//ou br = new BufferedReader(new FileReader(path))
			
			String line = br.readLine(); //Lê uma linha
			
			while(line != null) {
					System.out.println(line);
					line = br.readLine();
			}
			
		}
			
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
			
	}	
}
		
	
