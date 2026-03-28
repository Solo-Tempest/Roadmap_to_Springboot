package Phase_1.week_1.part_3.Probem_1;

public class Problem_1 {
    public static void main(String[] args) {
        Printable[] printable = {
                new Invoice(), new Label(), new Report(), new Receipt()
        };

        for (Printable p : printable) {
            p.print();
            p.preview();
            System.out.println("------------------");

        }
    }
}

interface Printable {
    void print();

    void preview();
}

class Invoice implements Printable {
    @Override
    public void print() {
        System.out.println("printing Invoice");
    }
    @Override
    public void preview() {
        System.out.println("previewing Invoice");
    }

}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("printing Report");
    }
    @Override
    public void preview() {
        System.out.println("previewing Report");
    }
}

class Receipt implements Printable {
    @Override
    public void print() {
        System.out.println("printing Receipt");
    }
    @Override
    public void preview() {
        System.out.println("previewing Receipt");
    }
}

class Label implements Printable {
    @Override
    public void print() {
        System.out.println("printing Label");
    }
    @Override
    public void preview() {
        System.out.println("previewing Label");
    }
}



