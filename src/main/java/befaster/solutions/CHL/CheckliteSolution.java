package befaster.solutions.CHL;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckliteSolution {

    public Integer checklite(String skus) {
        int cost = 0;

        if (skus == null) {
            return -1;
        }

        if (skus.isEmpty()) {
            return cost;
        }

        Map<Character, Integer> itemPriceMap = new HashMap<>();
        itemPriceMap.put('A', 50);
        itemPriceMap.put('B', 30);
        itemPriceMap.put('C', 20);
        itemPriceMap.put('D', 15);

        Map<Character, Integer> itemCount = new HashMap<>();


        for (int i = 0; i < skus.length(); i++) {

            if (!itemPriceMap.containsKey(skus.charAt(i))) {
                return -1;
            }

            int count = itemCount.getOrDefault(skus.charAt(i), 0) + 1;

            itemCount.put(skus.charAt(i), count);
        }

        for (Map.Entry<Character, Integer> items : itemCount.entrySet()) {
            Character item = items.getKey();
            int count = items.getValue();

            int itemPrice = itemPriceMap.get(item);

        }

        return cost;
    }
}



