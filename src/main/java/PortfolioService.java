import java.util.Optional;

public interface PortfolioService {
    public void addStock(Stock stock) throws StockAlreadyExistException;
    public Optional<Stock> getStock(int id);
    public int totalStock();
}
