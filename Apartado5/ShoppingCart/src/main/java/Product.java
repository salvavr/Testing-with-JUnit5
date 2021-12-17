/**
 * An example product for use in the example shopping cart.
 * @author <a href="mailto:mike@clarkware.com">Mike Clark</a>
 * @author <a href="http://www.clarkware.com">Clarkware Consulting, Inc.</a>
 */

public class Product {

    private String _title;
    private double _price;

    /**
     * Constructs a <codigoenlinea>Product</codigoenlinea>.
     * @param title Product title.
     * @param price Product price.
     */
    public Product(String title, double price) {
        _title = title;
        _price = price;
    }

    /**
     * Returns the product title.
     * @return Title.
     */
    public String getTitle() {
        return _title;
    }

    /**
     * Returns the product price.
     * @return Price.
     */
    public double getPrice() {
        return _price;
    }

    /**
     * Tests product equality.
     * @return true if the products
     *         are equal.
     */
    public boolean equals(Object o) {

        if (o instanceof Product) {
            Product p = (Product)o;
            return p.getTitle().equals(_title);
        }

        return false;
    }
}
