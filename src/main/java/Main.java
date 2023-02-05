public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a = "10010";
        String b = "10000000";
        System.out.println(bins.sum(a, b));
        System.out.println(bins.mult(a, b));
    }
}