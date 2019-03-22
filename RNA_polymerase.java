public class RNA_polymerase{
	
//////////////////////////CONSTRUCTORS//////////////////////////////////
  /**
   * Constructor that takes no arguments
   */
  public RNA_polymerase(){
	  
  }

/////////////////////////////METHODS////////////////////////////////////
	 /**
      * Helper method to determine if the sequence is a DNA sequence
      * (in other words if it only contains a,t,g,c)
      */
	 public static boolean if_DNASequence(String DNA_sequence){
		 DNA_sequence=DNA_sequence.toLowerCase();
		 char[] sequence = DNA_sequence.toCharArray();
		 boolean result = true;
		 
		 for(int i=0; i<sequence.length; i++){
			 if(sequence[i]!='a' && sequence[i]!='t' && sequence[i]!='g' &&
			    sequence[i]!='c'){
					result = false;
					System.out.println("Not a DNA sequence! Please enter again!");
					break;
				}
		 }
		 return result;
	 }
	 
	 /** public static String method: transcribe
	 * Converts a String DNA_sequence into the corresponding mRNA_sequence.
	 */
	 public static String transcribe(String DNA_sequence){
	   DNA_sequence=DNA_sequence.toLowerCase();
	   char[] DNA_sequence_char_array=DNA_sequence.toCharArray();
	   char[] mRNA_sequence_char_array=new char[DNA_sequence_char_array.length];
	   
	   if(if_DNASequence(DNA_sequence)){
		   for(int i=0; i<DNA_sequence_char_array.length; i++){
			 
			 //a-->a
			 if(DNA_sequence_char_array[i]=='a'){
				 mRNA_sequence_char_array[(mRNA_sequence_char_array.length-1)-i]='a';}
			 
			 //t-->u
			 else if(DNA_sequence_char_array[i]=='t'){
				 mRNA_sequence_char_array[(mRNA_sequence_char_array.length-1)-i]='u';}
			 
			 //g-->g
			 else if(DNA_sequence_char_array[i]=='g'){
				 mRNA_sequence_char_array[(mRNA_sequence_char_array.length-1)-i]='g';}
			 
			 //c-->c
			 else if(DNA_sequence_char_array[i]=='c'){
				 mRNA_sequence_char_array[(mRNA_sequence_char_array.length-1)-i]='c';}
		   }
	   }
	   
	   String mRNA_sequence=new String(mRNA_sequence_char_array);
	   return mRNA_sequence.toUpperCase();
	 }

} //Last } of RNA_polymerase class! Put all new methods before this.
