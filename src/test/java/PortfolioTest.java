import org.junit.jupiter.api.Test;

import javax.sound.sampled.Port;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

class PortfolioTest {
    @Test
    public void stockAddedToPortfolio() throws StockAlreadyExistException {
        Stock stock = mock(Stock.class);
        Portfolio portfolio = new Portfolio();
        portfolio.addStock(stock);

        assertEquals(1,portfolio.totalStock(),"stock could not be added");

    }

    @Test
    public void addingDuplicateStockToPortfolio() throws StockAlreadyExistException {
        Stock stock = mock(Stock.class);
        Portfolio portfolio = new Portfolio();
        portfolio.addStock(stock);

        assertThrows(StockAlreadyExistException.class,()->{
            portfolio.addStock(stock);
        },"Adding duplicate stock did not throw an exception");
    }

    @Test
    public void gettingNoneExistingStock(){
        Portfolio portfolio = new Portfolio();
        assertFalse(portfolio.getStock(anyInt()).isPresent());
    }
}