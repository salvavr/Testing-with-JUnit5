//import junit.framework.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class ShoppingCartTest {

    private ShoppingCart _bookCart;
    private Product _defaultBook;

    /**
     * Constructs a ShoppingCartTest with the specified name.
     * @param name Test case name.
     */
//    public ShoppingCartTest(String name) {
//        super(name);
//    }

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @BeforeEach
    protected void setUp() {

        _bookCart = new ShoppingCart();

        _defaultBook = new Product("Extreme Programming", 23.95);
        _bookCart.addItem(_defaultBook);
    }

    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
    @AfterEach
    protected void tearDown() {
        _bookCart = null;
    }

    /**
     * Tests adding a product to the cart.
     */
    @Test
    @DisplayName("Añadir producto")
    public void testProductAdd() {

        Product newBook = new Product("Refactoring", 53.95);
        _bookCart.addItem(newBook);

        double expectedBalance = _defaultBook.getPrice() + newBook.getPrice();

        assertEquals(expectedBalance, _bookCart.getBalance(), 0.0);

        assertEquals(2, _bookCart.getItemCount());
    }

    /**
     * Tests the emptying of the cart.
     */
    @Test
    @DisplayName("Carro Vacío")
    public void testEmpty() {

        _bookCart.empty();

        assertTrue(_bookCart.isEmpty());
    }

    /**
     * Tests removing a product from the cart.
     *
     * @throws ProductNotFoundException If the product was not in the cart.
     */
    @Test
    @DisplayName("Vaciar Carro")
    public void testProductRemove() throws ProductNotFoundException {

        _bookCart.removeItem(_defaultBook);

        assertEquals(0, _bookCart.getItemCount());

        assertEquals(0.0, _bookCart.getBalance(), 0.0);
    }

    /**
     * Tests removing an unknown product from the cart.
     * This test is successful if the
     * ProductNotFoundException is raised.
     */
    @Test
    @DisplayName("Quitando Producto")
    public void testProductNotFound() {

        try {

            Product book = new Product("Ender's Game", 4.95);
            _bookCart.removeItem(book);

            fail("Should raise a ProductNotFoundException");

        } catch (ProductNotFoundException success) {
            // successful test
        }
    }

    /**
     * Assembles and returns a test suite for
     * all the test methods of this test case.
     * @return A non-null test suite.
     */
    //public static Test suite() {

    //
    // Reflection is used here to add all
    // the testXXX() methods to the suite.
    //
    //TestSuite suite = new TestSuite(ShoppingCartTest.class);

    //
    // Alternatively, but prone to error when adding more
    // test case methods...
    //
    // TestSuite suite = new TestSuite();
    // suite.addTest(new ShoppingCartTest("testEmpty"));
    // suite.addTest(new ShoppingCartTest("testProductAdd"));
    // suite.addTest(new ShoppingCartTest("testProductRemove"));
    // suite.addTest(new ShoppingCartTest("testProductNotFound"));
    //

    //return suite;
    //}

    /**
     * Runs the test case.
     */
//    public static void main(String args[]) {
//        junit.textui.TestRunner.run(suite());
//    }
}