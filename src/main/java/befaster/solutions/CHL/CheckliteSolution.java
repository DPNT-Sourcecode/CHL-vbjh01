package befaster.solutions.CHL;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckliteSolution {

    public Integer checklite(String skus) {
        Map<String, Integer> itemPriceMap = new HashMap<>();
        itemPriceMap.put("A", 50);
        itemPriceMap.put("B", 30);
        itemPriceMap.put("C", 20);
        itemPriceMap.put("D", 15);

        Map<String, Integer> itemCount = new HashMap<>();

        int price 

        if (skus == null) {
            return -1;
        }

        for (String str : skus.split(",")) {
            int count = itemCount.getOrDefault(str, 0) + 1;

            itemCount.put(str, count);
        }

        for (Map.Entry<String, Integer> items : itemCount.entrySet()) {
            String item = items.getKey();
            Integer count = items.getValue();


        }
    }
}


