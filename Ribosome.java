public class Ribosome{
	
//////////////////////////CONSTRUCTORS//////////////////////////////////
  /**
   * Constructor that takes no arguments
   */
  public Ribosome(){
	  
  }

/////////////////////////////METHODS////////////////////////////////////
	 /**
      * Helper method to determine if the sequence is an mRNA sequence
      * (in other words if it only contains a,u,g,c)
      */
	 public static boolean if_mRNASequence(String mRNA_sequence){
		 mRNA_sequence=mRNA_sequence.toLowerCase();
		 char[] sequence = mRNA_sequence.toCharArray();
		 boolean result = true;
		 
		 for(int i=0; i<sequence.length; i++){
			 if(sequence[i]!='a' && sequence[i]!='u' && sequence[i]!='g' &&
			    sequence[i]!='c'){
					result = false;
					System.out.println("Not an mRNA sequence! Please enter again!");
					break;
				}
		 }
		 return result;
	 }
	 	 
	 /**
      * Helper method to look for starting nucleotide; returns the index
      * of the first "aug" in the sequence which is the start codon
      */
	 public static int findStartingNucleotide(String mRNA_sequence){
		 char[] sequence = mRNA_sequence.toCharArray();
		 int start_nucleotide_number=0;
		 
		 for(int i=0; i<sequence.length-3; i++){
			 if(sequence[i]=='a' &&
				sequence[i+1]=='u' &&
				sequence[i+2]=='g'){
				start_nucleotide_number=i;
				break;
			 }
		  }
	 return start_nucleotide_number;
	 }
	 
   /** public static void method: translate
	 * Looks for start codon (AUG) using findStartingNucleotide method, then
	 * prints out the corresponding amino acid for each codon.
	 */
	 public static void translate(String mRNA_sequence){
	   if(if_mRNASequence(mRNA_sequence)){
		
		 mRNA_sequence=mRNA_sequence.toLowerCase();
		 int start=findStartingNucleotide(mRNA_sequence);
		 char[] sequence = mRNA_sequence.toCharArray();
		
		 for(int i=start; i<=sequence.length-3; i=i+3){
			 char[] codonCharArr = {sequence[i], sequence[i+1], sequence[i+2]};
			 String codon=new String(codonCharArr);
			 
			 //START codon & methionine(M)
			 if(codon.equals("aug")){
				 System.out.print("M");
			 }
			 //phenylalanine(F)
			 else if(codon.equals("uuu") | codon.equals("uuc")){
				System.out.print("F");
			 }
			 //leucine(L)
			 else if(codon.equals("uua") | codon.equals("uug") | codon.equals("cuu") |
					 codon.equals("cuc") | codon.equals("cua") | codon.equals("cug")){
				System.out.print("L");
			 }
			 //isoleucine(I)
			 else if(codon.equals("auu") | codon.equals("auc") | codon.equals("aua")){
				 System.out.print("I");
			 }
			 //valine(V)
			 else if(codon.equals("guu") | codon.equals("guc") | codon.equals("gua") |
					 codon.equals("gug")){
				 System.out.print("V");
			 }
			 //serine(S)
			 else if(codon.equals("ucu") | codon.equals("ucc") | codon.equals("uca") |
					 codon.equals("ucg") | codon.equals("agu") | codon.equals("agc")){
				 System.out.print("S");
			 }
			 //proline(P)
			 else if(codon.equals("ccu") | codon.equals("ccc") | codon.equals("cca") |
					 codon.equals("ccg")){
				 System.out.print("P");
			 }
			 //threonine(T)
			 else if(codon.equals("acu") | codon.equals("acc") | codon.equals("aca") |
					 codon.equals("acg")){
				 System.out.print("T");
			 }
			 //alanine(A)
			 else if(codon.equals("gcu") | codon.equals("gcc") | codon.equals("gca") |
					 codon.equals("gcg")){
				 System.out.print("A");
			 }
			 //tyrosine(Y)
			 else if(codon.equals("uau") | codon.equals("uac")){
				 System.out.print("Y");
			 }
			 //histidine(H)
			 else if(codon.equals("cau") | codon.equals("cac")){
				 System.out.print("H");
			 }
			 //glutamine(Q)
			 else if(codon.equals("caa") | codon.equals("cag")){
				 System.out.print("Q");
			 }
			 //asparagine(N)
			 else if(codon.equals("aau") | codon.equals("aac")){
				 System.out.print("N");
			 }
			 //lysine(K)
			 else if(codon.equals("aaa") | codon.equals("aag")){
				 System.out.print("K");
			 }
			 //aspartate/aspartic acid(D)
			 else if(codon.equals("gau") | codon.equals("gac")){
				 System.out.print("D");
			 }
			 //glutamate/glutamic acid(E)
			 else if(codon.equals("gaa") | codon.equals("gag")){
				 System.out.print("E");
			 }
			 //cysteine(C)
			 else if(codon.equals("ugu") | codon.equals("ugc")){
				 System.out.print("C");
			 }
			 //tryptophan(W)
			 else if(codon.equals("ugg")){
				 System.out.print("W");
			 }
			 //arginine(R)
			 else if(codon.equals("cgu") | codon.equals("cgc") | codon.equals("cga") |
					 codon.equals("cgg") | codon.equals("aga") | codon.equals("agg")){
				 System.out.print("R");
			 }
			 //glycine(G)
			 else if(codon.equals("ggu") | codon.equals("ggc") | codon.equals("gga") |
					 codon.equals("ggg")){
				 System.out.print("G");
			 }
			 //STOP codons
			 else if(codon.equals("uaa") | codon.equals("uag") | codon.equals("uga")){
				 break;
			 }
		}
	  }
	  
	 }
	 
   /** public static String method: translate
	 * Parameter: Ribosome.translateIntoString(String mRNA_sequence)
	 * Does the same as "translate" except outputs protein sequence as a String
	 */
	 public static String translateIntoString(String mRNA_sequence){
		 String protein_sequence=new String();
		 
		 return protein_sequence;
	 }

} //Last } of Ribosome class! Put all new methods before this.
