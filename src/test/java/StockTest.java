import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StockTest {
    @Test
    public void userCanGetStockQuantity(){
        //mock the class
        Stock mockedStock = mock(Stock.class);
        //declare the dummy result to return
        when(mockedStock.getQuantity()).thenReturn(50);
        //write assertion
        assertEquals(50,mockedStock.getQuantity(),"User cannot get stock quantity");
    }

    @Test
    public void userCanGetStockPrice(){
        Stock mockedStock = mock(Stock.class);
        when(mockedStock.getStockPrice()).thenReturn(6.0);

        assertTrue(mockedStock.getStockPrice() != null,"user cannot get stock price");
    }

}