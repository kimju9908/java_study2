package 제네릭프린터;

public class GenericMainEX {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderprinter = new GenericPrinter<>();
        powderprinter.setMaterial(new Powder());
        Powder powder = powderprinter.getMaterial();
        System.out.println(powder.toString());
        powder.doPrinting();

        GenericPrinter<Plastic> plasicprinter = new GenericPrinter<>();
        plasicprinter.setMaterial(new Plastic());
        Plastic plastic = plasicprinter.getMaterial();
        System.out.println(powder.toString());
        plastic.doPrinting();


    }
}
