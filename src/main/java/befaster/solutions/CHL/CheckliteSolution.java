package befaster.solutions.CHL;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckliteSolution {

    public Integer checklite(String skus) {

       if (skus.isEmpty()) {
           return -1;
       }

        Map<Character, Integer> itemPriceMap = new HashMap<>();
        itemPriceMap.put('A', 50);
        itemPriceMap.put('B', 30);
        itemPriceMap.put('C', 20);
        itemPriceMap.put('D', 15);

        Map<Character, Integer> itemCount = new HashMap<>();

        int cost = 0;

        for (int i = 0; i < skus.length(); i++) {
            int count = itemCount.getOrDefault(skus.charAt(i), 0) + 1;

            itemCount.put(skus.charAt(i), count);
        }

        for (Map.Entry<Character, Integer> items : itemCount.entrySet()) {
            Character item = items.getKey();
            Integer count = items.getValue();

            Integer itemPrice = itemPriceMap.get(item);

            if (item.equals('A') && count == 3) {
                cost = 130;
            } else if (item.equals('B') && count == 2) {
                cost = 45;
            } else {
                cost += (itemPrice * count);
            }

        }

        return cost;
    }
}







