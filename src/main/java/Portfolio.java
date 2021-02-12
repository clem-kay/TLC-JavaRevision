import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Portfolio implements PortfolioService{
    private List<Stock> stockList = new ArrayList<>();

    public List<Stock> getStockList() {
        return stockList;
    }

    @Override
    public void addStock(Stock stock) throws StockAlreadyExistException {
//        stockList.add(stock);
        List<Stock> stocks = stockList
                .stream()
                .filter(s-> s.getId() == stock.getId() )
                .collect(Collectors.toList());

        if (stocks.isEmpty()){
            stockList.add(stock);
        }else{
            throw new StockAlreadyExistException("Stock with "+stock.getId()+"already exist");
        }
    }

    @Override
    public Optional<Stock> getStock(int id) {
        return stockList.stream()
                .filter(stock -> stock.getId() == id)
                .findFirst();
    }

//    @Override
//    public void getStock(int id) {
//        stockList.remove(id);
//    }

    @Override
    public int totalStock() {
        return stockList.size();
    }
}
