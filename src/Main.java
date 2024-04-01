

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(3,4));
        System.out.println(p.product(3,4,5));
        System.out.println(p.product(3.5,4.5));

    }

    // class of Main.Product
    static class  Product{


        public int product(int x, int y) {
            int totalOfAllProduct = x * y;
            return totalOfAllProduct;
        }
        public int product(int x, int y, int z) {
            int totalOfAllProduct = x * y * z;
            return totalOfAllProduct;
        }
        public double product(double x, double y) {
            double totalOfAllProduct = x * y;
            return totalOfAllProduct;
        }

    }
}
