package org.howard.edu.lsp.midterm.question3;
import java.util.HashMap;
import java.util.Map;

/**
 * A simplified implementation of an electronic voting machine.
 */
public class VotingMachine {
    private Map<String, Integer> candidates;

    /**
     * Constructs a new VotingMachine with an empty list of candidates.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the voting machine.
     *
     * @param name The name of the candidate to add.
     */
    public void addCandidate(String name) {
        candidates.putIfAbsent(name, 0);
    }

    /**
     * Casts a vote for the specified candidate.
     * If the candidate doesn't exist, the vote is ignored.
     *
     * @param name The name of the candidate to vote for.
     */
    public void castVote(String name) {
        candidates.computeIfPresent(name, (k, v) -> v + 1);
    }

    /**
     * Returns a string representation of the current vote counts.
     *
     * @return A string showing the number of votes each candidate has received.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Vote Counts:\n");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
