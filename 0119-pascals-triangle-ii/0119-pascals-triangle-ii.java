import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        // First Row
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        // Base Case:
        if (rowIndex == 0)
            return triangle.get(0);

        // For 2nd row to the Last row
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i - 1);

            // First Element = 1
            row.add(1);
            // Middle Elements:
            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            // Last elements = 1
            row.add(1);

            // Finally merge the row to the main List
            triangle.add(row);
        }
        // Result:
        return triangle.get(rowIndex);
    }
}
