import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Edge Case:
        if (numRows == 0)
            return triangle;

        // Assigning the first row of the List to 1:
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Determining the mid elements
        for (int i = 1; i < numRows; i++) {
            // Declaring a row List
            List<Integer> row = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i - 1);
            // First Element Which is 1:
            row.add(1);

            // Mid elements Condition
            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            // Last Element is 1
            row.add(1);

            // Finally added the row to the Triangle:
            triangle.add(row);
        }
        return triangle;
    }
}