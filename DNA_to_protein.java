import java.util.Scanner;

public class DNA_to_protein{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter DNA sequence to be read into protein, 5' end first:");
		String DNA_sequence = reader.nextLine();
		
		String mRNA_sequence = RNA_polymerase.transcribe(DNA_sequence);
	 
		System.out.println(" ");
		System.out.println("Protein sequence is:");
		Ribosome.translate(mRNA_sequence);
	}
}
