package org.mhridin;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        int senateLength = senate.length();

        // Queue to store indices of Radiant senators
        Deque<Integer> radiantQueue = new ArrayDeque<>();
        // Queue to store indices of Dire senators
        Deque<Integer> direQueue = new ArrayDeque<>();

        // Initialize queues with initial positions of senators
        for (int i = 0; i < senateLength; ++i) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }

        // Simulate the voting process until one party has no senators left
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            // Get the indices of the next senators from each party
            int radiantIndex = radiantQueue.poll();
            int direIndex = direQueue.poll();

            // The senator with the smaller index acts first and bans the other
            // The winning senator gets to act again in the next round (index + n)
            if (radiantIndex < direIndex) {
                // Radiant senator bans Dire senator and queues for next round
                radiantQueue.offer(radiantIndex + senateLength);
            } else {
                // Dire senator bans Radiant senator and queues for next round
                direQueue.offer(direIndex + senateLength);
            }
        }

        // Return the name of the winning party
        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
