
public class Main {
    public static void main(String[] args) {

        Printable print2 = new Printable() {
            @Override
            public void print() {
                System.out.println("Печатаю текст");
                System.out.println(concationTwoStrings("asd", "qwe", (a, b) -> b.concat(a)));
            }
        };

        Printable print1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Печатаю фото");
                System.out.println(concationTwoStrings("asd", "qwe", (a, b) -> a + b + a));
            }
        };

        Printable print3 = new Printable() {
            @Override
            public void print() {
                System.out.println("Печатаю график");
                System.out.println(concationTwoStrings("asd", "qwe", (a, b) -> a + b));
            }
        };


        print1.print();
        print2.print();
        print3.print();



    }

    public static String concationTwoStrings(String a, String b, Concationble<String, String> concationble) {
        return concationble.concat(a, b);
    }
}