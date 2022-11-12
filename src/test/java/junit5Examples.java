import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class junit5Examples {

    @BeforeAll
    static void BeforeAll() {
        System.out.println("###    @BeforeAll() !");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("###    @AfterAll() !");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("###    @beforeEach() !");
    }

    @AfterEach
    void AfterEach(){
        System.out.println("###    @AfterEach() !");
    }

    @Test
    void firstTest() {
        System.out.println("###      @Test firstTest() !");
        assertTrue(3>2);
    }

    @Test
    void secondTest() {
        System.out.println("###      @Test secondTest() !");
        assertFalse(3<2);
    }
}


