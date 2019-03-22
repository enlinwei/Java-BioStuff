import java.util.Scanner;

public class mRNA_translator{
 public static void main(String[] args){
	 Scanner reader = new Scanner(System.in);
	 System.out.println("Please enter mRNA sequence to be translated, 5' end first:");
	 String mRNA_sequence = reader.nextLine();
	 
	 System.out.println(" ");
	 System.out.println("Protein sequence is:");
	 Ribosome.translate(mRNA_sequence);
 }
}
