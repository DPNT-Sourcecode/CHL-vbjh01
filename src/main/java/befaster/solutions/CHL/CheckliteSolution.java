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

        int cost = 0;

        if (skus == null || skus.length() < 1) {
            return -1;
        }

        for (String str : skus.split(",")) {
            int count = itemCount.getOrDefault(str, 0) + 1;

            itemCount.put(str, count);
        }

        for (Map.Entry<String, Integer> items : itemCount.entrySet()) {
            String item = items.getKey();
            Integer count = items.getValue();

            Integer itemPrice = itemPriceMap.get(item);

            if (item.equals("A") && count == 3) {
                cost += 130;
            } else if (item.equals("B") && count == 2) {
                cost += 45;
            } else {
                cost += (itemPrice * cost);
            }

        }

        return cost;
    }
}




