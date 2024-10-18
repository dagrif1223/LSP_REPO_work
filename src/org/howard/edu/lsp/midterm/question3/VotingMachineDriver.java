package org.howard.edu.lsp.midterm.question3;
/**
 * A driver class to demonstrate the functionality of the VotingMachine class.
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toString());
    }
}
