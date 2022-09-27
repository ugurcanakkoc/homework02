package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.set_id(15);
        product.set_name("Laptop");
        product.set_description("Asus");
        product.set_price(15200);
        product.set_stockAmount(15);


        ProductManger productManger=new ProductManger();
        productManger.Add(product);
        System.out.println(product.get_kod());
    }
}
