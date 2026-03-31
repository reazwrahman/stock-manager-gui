package stock.manager.ui.utility;

import com.google.gson.Gson;
import stock.manager.ui.Configs;
import stock.manager.ui.stock_manager.StockWithPrice;

import java.util.List;

public class OutputWriter {

    public static boolean writeStocksWithPrice(List<StockWithPrice> data){
        try {
            Gson gson = new Gson();
            String json = gson.toJson(data);
            new FileHandler().writeToFile(Configs.STOCK_OUTPUT_FILE_NAME, json);
            return true;
        }catch(Exception ex) {
            throw(ex);
        }
    }
}
