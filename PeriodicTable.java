import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        TreeSet<ChemicalElements> periodicTable = new TreeSet<>();
        periodicTable.add(new ChemicalElements(1, "H", 1));
        periodicTable.add(new ChemicalElements(5, "B", 11));
        periodicTable.add(new ChemicalElements(6, "C", 12));
        periodicTable.add(new ChemicalElements(9, "F", 19));
        periodicTable.add(new ChemicalElements(10, "Ne", 20));
        periodicTable.add(new ChemicalElements(7, "N", 14));
        periodicTable.add(new ChemicalElements(2, "He", 4));
        periodicTable.add(new ChemicalElements(3, "Li", 7));
        periodicTable.add(new ChemicalElements(4, "Be", 9));
        periodicTable.add(new ChemicalElements(8, "O", 16));

        Iterator<ChemicalElements> tablIterator = periodicTable.iterator();

        while (tablIterator.hasNext()) {
            ChemicalElements element = tablIterator.next();
            System.out.println(element);
        }
    }
}

class ChemicalElements implements Comparable<ChemicalElements> {
    int atomicNumber;
    String atomicName;
    int atomicMass;

    public ChemicalElements(int atomicNumber, String atomicName, int atomicMass) {
        super();
        this.atomicNumber = atomicNumber;
        this.atomicName = atomicName;
        this.atomicMass = atomicMass;
    }

    @Override
    public String toString() {
        return "ChemicalElements [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicMass="
                + atomicMass + "]";
    }

    @Override
    public int compareTo(ChemicalElements o) {
        return Integer.compare(atomicNumber, o.atomicNumber);
    }

}