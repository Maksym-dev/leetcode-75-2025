package org.mhridin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EvaluateDivision {
    // Parent map for Union-Find structure
    private Map<String, String> parent;
    // Weight map storing the division result from node to its root
    private Map<String, Double> weight;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int numEquations = equations.size();
        parent = new HashMap<>();
        weight = new HashMap<>();

        // Initialize each variable as its own parent with weight 1.0
        for (List<String> equation : equations) {
            String numerator = equation.get(0);
            String denominator = equation.get(1);
            parent.put(numerator, numerator);
            parent.put(denominator, denominator);
            weight.put(numerator, 1.0);
            weight.put(denominator, 1.0);
        }

        // Build the Union-Find structure with weighted edges
        for (int i = 0; i < numEquations; ++i) {
            List<String> equation = equations.get(i);
            String numerator = equation.get(0);
            String denominator = equation.get(1);

            // Find the root of both variables
            String rootNumerator = find(numerator);
            String rootDenominator = find(denominator);

            // Skip if they already belong to the same set
            if (Objects.equals(rootNumerator, rootDenominator)) {
                continue;
            }

            // Union: connect rootNumerator to rootDenominator
            parent.put(rootNumerator, rootDenominator);
            // Update weight: rootNumerator / rootDenominator = (denominator / root) * value / (numerator / root)
            weight.put(rootNumerator, weight.get(denominator) * values[i] / weight.get(numerator));
        }

        // Process queries
        int numQueries = queries.size();
        double[] results = new double[numQueries];

        for (int i = 0; i < numQueries; ++i) {
            String dividend = queries.get(i).get(0);
            String divisor = queries.get(i).get(1);

            // Check if both variables exist and belong to the same connected component
            if (!parent.containsKey(dividend) ||
                    !parent.containsKey(divisor) ||
                    !Objects.equals(find(dividend), find(divisor))) {
                results[i] = -1.0;
            } else {
                // Calculate dividend / divisor using their weights to the common root
                results[i] = weight.get(dividend) / weight.get(divisor);
            }
        }

        return results;
    }

    /**
     * Find operation with path compression.
     * Returns the root of the set containing x.
     * Also updates the weight from x to its root during path compression.
     */
    private String find(String x) {
        if (!Objects.equals(parent.get(x), x)) {
            String originalParent = parent.get(x);
            // Recursively find the root and compress the path
            parent.put(x, find(parent.get(x)));
            // Update weight: x/root = x/originalParent * originalParent/root
            weight.put(x, weight.get(x) * weight.get(originalParent));
        }
        return parent.get(x);
    }
}
