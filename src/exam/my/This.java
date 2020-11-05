package exam.my;

public class This {
    private int a;
    private int b;
    
    public This() {
        this(0, 0);
    }
    
    public This(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void setVar(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    // Esercizio: crea un metodo resetVar che ressetta tutti i valori allo stato inziale.

    // ese2. crea un toString dove vengono printate i valori.
    public String toString() {
        String objectState = "[a: " + a;
        return objectState;
    }

    public static void main(String[] args) {
        This ex1 = new This();
        System.out.println("ex1 fase 1: " + ex1);
    
        ex1.setVar(4, 7);
        System.out.println("ex1 fase 1: " + ex1);
    
        This ex2 = new This(2, 2);
        System.out.println("ex2 fase 1: " + ex2);
    }
}
