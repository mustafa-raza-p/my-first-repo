package CodeAcademy.DNASequencing;
public class DNA{
    // Write a DNA.java program that determines whether there is a protein in a
    // strand of DNA.

    // Find the index where ATG begins using indexOf().
    static int indexOfATG(final String codon){
        return codon.indexOf("ATG");
    }
    // Find the index where TGA begins.
    static int indexOfTGA(final String codon){
            return codon.indexOf("TGA");
    }
    // Create a generic String variable called dna that can be set to any DNA
    // sequence (dna1, dna2, dna3).
    static int dnaLength(final String dna){
        return dna.length();
    }
    public static void main(String [] args){
        // Here are the three DNA strands that you are going to use to test your
        // program:
            final String dna1 = "ATGCGATACGCTTGA";
            final String dna2 = "ATGCGATACGTGA";
            final String dna3 = "ATTAATATGTACTGA";

        final String [] arrayDNA = {dna1, dna2, dna3};
        // Let’s start with an if statement that checks for a start codon and a stop
        // codon using the && operator.

        for(final String element : arrayDNA){
            final int start = indexOfATG(element);
            final int stop  = indexOfTGA(element);

                if(start != -1 && stop !=-1 && (stop-start)%3==0){
                    // Inside the if statement, create a String variable named protein.
                    final String protein = element.substring(start, stop);
                    System.out.println("There is a protein! "+protein);
                }else{
                    System.out.println("No Protein!");
                }
        }
    }

}