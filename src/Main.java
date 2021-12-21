import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Utilities utilities = new Utilities();
        try {
			utilities.readBinaryFile("binFile.bin");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 	 

	//	utilities.readInputFile("a.txt");
		utilities.setCharactersAndFrequencies();
		utilities.buildHuffmanQueue();
		utilities.buildHuffmanTree();
		utilities.writeEncodedFile();    	 
        } 

	}
			
		
		
		

		
		//		utilities.readEncodedFile("outputFile.txt");
//		utilities.writeDecodedFile();
	

