package org.mhridin;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        // Use a stack to track asteroids that haven't been destroyed
        Deque<Integer> stack = new ArrayDeque<>();

        // Process each asteroid
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                // Right-moving asteroid: always add to stack
                stack.offerLast(asteroid);
            } else {
                // Left-moving asteroid: check for collisions with right-moving asteroids

                // Destroy all smaller right-moving asteroids
                while (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() < -asteroid) {
                    stack.pollLast();
                }

                // Check the outcome after destroying smaller asteroids
                if (!stack.isEmpty() && stack.peekLast() == -asteroid) {
                    // Equal size collision: both asteroids are destroyed
                    stack.pollLast();
                } else if (stack.isEmpty() || stack.peekLast() < 0) {
                    // No collision: either stack is empty or top asteroid is also left-moving
                    stack.offerLast(asteroid);
                }
                // If stack.peekLast() > -asteroid, current asteroid is destroyed (do nothing)
            }
        }

        // Convert stack to array and return the result
        return stack.stream().mapToInt(Integer::valueOf).toArray();
    }
}
