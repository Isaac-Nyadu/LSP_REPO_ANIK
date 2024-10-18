package org.howard.edu.lsp.midterm.question3;
import java.util.HashMap;
import java.util.Map;

/**
 * The VotingMachine class simulates a simple electronic voting machine.
 * It allows adding candidates, casting votes, and displaying the vote count for each candidate.
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
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);
        }
    }

    /**
     * Casts a vote for the specified candidate.
     *
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    /**
     * Returns a string representation of the vote counts for each candidate.
     *
     * @return a string displaying each candidate and their number of votes
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey())
                  .append(": ")
                  .append(entry.getValue())
                  .append(" votes\n");
        }
        return result.toString();
    }

    // Example usage
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toString());
    }
}
