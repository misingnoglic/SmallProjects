/* Made for the University of Connecticut Institution of Material Science
GCodeFiler takes in a large text file of GCode and exports to code into seperate files to decrease manual labor.

For those who don't know, GCode is the code that controls the trackpath of 3D printers. The IMS produced a large text file 
of all their test cube 3D models to test matrices that best promote cell growth. This text file needed to be seperated by 
their individual test cubes into independent files.
*/

import java.util.*;
import java.io.*;

public class GCodeFiler {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		System.out.println("Filename:");  // reads main GCode file
		String filename = console.next();
		Scanner input = new Scanner(new File(filename));
		while (input.hasNextLine()) { // prints file by line
			String codeLine = (input.nextLine());
			System.out.println(codeLine);
			if (codeLine.contains("G92 E0")) { // outputs file when the code for the cube ends
				System.out.println("Output Filename:");
				String outputName = console.next();
				PrintStream out = new PrintStream(new FileOutputStream(outputName));
			
			}
		}
	}
}
