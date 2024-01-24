package CodeAcademy.DNASequencing;

public class DNA2 {
    private String sequence;            // NON STATIC DNA class with an instance variable to hold the DNA sequence


    // define non static methods to work with instance variables, which allows
    // us to create DNA objects representing different DNA strands;
    public DNA2(String sequence){
        this.sequence = sequence;
    }

    public int indexOfATG(){
        return sequence.indexOf("ATG");
    }
    public int indexOfTGA(){
        return sequence.indexOf("TGA");
    }

    // hasProtein method to encapsulate logic for checking if a protein is present;
    public boolean hasProtein(){
        int start = indexOfATG();
        int stop = indexOfTGA();
        return start!=-1 && stop!=-1 && (stop-start)%3==0;
    }

    //getProtein method to encapsulate logic for extracting the protein
    public String getProtein(){
        if(hasProtein()){
            int start = indexOfATG();
            int stop = indexOfTGA();
            return sequence.substring(start, stop);
        }
        return null;
    }


    public static void main(String[] args) {
        // array of DNA objects // each DNA object can manage its own state and behavior
        DNA3[] dnaStrands ={
                new DNA3("ATGCGATACGCTTGA"),
                new DNA3("ATGCGATACGTGA"),
                new DNA3("ATTAATATGTACTGA")
        };
        for( DNA3 dna : dnaStrands){
            if (dna.hasProtein()){
                System.out.println("There is a Protein ! "+dna.getProtein());
            }else{
                System.out.println("No Protein!");
            }
        }

    }
}
