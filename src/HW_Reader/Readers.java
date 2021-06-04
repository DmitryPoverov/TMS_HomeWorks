package HW_Reader;

public class Readers {

    private Reader [] readers;

    public Readers (Reader reader) {
        readers = new Reader[1];
        readers[0] = reader;
    }

    public void addReader(Reader reader) {
        Reader[] temp;
        temp = readers.clone();
        readers = new Reader[temp.length+1];
        for (int i=0; i<temp.length; i++) {
            readers[i] = temp [i];
        }
        readers[readers.length-1] = reader;
    }

    public void showAll () {
        for (Reader r: readers) {
            System.out.printf("A reader: %s id: %d\n", r.getFIO(), r.getReaderID());
        }
    }
}
