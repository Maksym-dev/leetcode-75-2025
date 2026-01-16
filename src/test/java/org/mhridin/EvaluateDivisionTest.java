package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluateDivisionTest extends TestCase {

    public void testCalcEquationCase1() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));

        double[] result = new EvaluateDivision().calcEquation(equations, values, queries);

        Assert.assertEquals(6.00000, result[0]);
        Assert.assertEquals(0.50000, result[1]);
        Assert.assertEquals(-1.00000, result[2]);
        Assert.assertEquals(1.00000, result[3]);
        Assert.assertEquals(-1.00000, result[4]);
    }

    public void testCalcEquationCase2() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        equations.add(Arrays.asList("bc", "cd"));
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("c", "b"));
        queries.add(Arrays.asList("bc", "cd"));
        queries.add(Arrays.asList("cd", "bc"));

        double[] result = new EvaluateDivision().calcEquation(equations, values, queries);

        Assert.assertEquals(3.75000, result[0]);
        Assert.assertEquals(0.40000, result[1]);
        Assert.assertEquals(5.00000, result[2]);
        Assert.assertEquals(0.20000, result[3]);
    }

    public void testCalcEquationCase3() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        double[] values = {0.5};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "b"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("x", "y"));

        double[] result = new EvaluateDivision().calcEquation(equations, values, queries);

        Assert.assertEquals(0.50000, result[0]);
        Assert.assertEquals(2.00000, result[1]);
        Assert.assertEquals(-1.00000, result[2]);
        Assert.assertEquals(-1.00000, result[3]);
    }
}