package CodeAcademy.DNASequencing;

public class DNA3 {
    private String sequence;
    private int start;
    private int stop;

    public DNA3(String sequence) {
        this.sequence = sequence;
        this.start = indexOfATG();
        this.stop = indexOfTGA();
    }

    public int indexOfATG() {
        return sequence.indexOf("ATG");
    }

    public int indexOfTGA() {
        return sequence.indexOf("TGA");
    }

    public boolean hasProtein() {
        return start != -1 && stop != -1 && (stop - start) % 3 == 0;
    }

    public String getProtein() {
            return sequence.substring(start, stop + 3); // Adding 3 to include the stop codon
    }

    public static void main(String[] args) {
        DNA3[] dnaStrands = {
                new DNA3("ATGCGATACGCTTGA"),
                new DNA3("ATGCGATACGTGA"),
                new DNA3("ATTAATATGTACTGA")
        };

        for (DNA3 dna : dnaStrands) {
            if (dna.hasProtein()) {
                System.out.println("There is a Protein! " + dna.getProtein());
            } else {
                System.out.println("No Protein!");
            }
        }
    }
}
