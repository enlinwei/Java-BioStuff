import java.util.Scanner;

public class DNA_transcriber{
 public static void main(String[] args){
	 Scanner reader = new Scanner(System.in);
	 System.out.println("Please enter DNA sequence to be transcribed, 5' end first:");
	 String DNA_sequence = reader.nextLine();
	 
	 System.out.println(" ");
	 System.out.println("mRNA sequence is:");
	 System.out.println("5'-"+RNA_polymerase.transcribe(DNA_sequence)+"-3'");
 }
}
