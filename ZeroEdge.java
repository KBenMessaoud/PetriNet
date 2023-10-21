/**
 * Represents a ZeroEdge in a Petri net. This specialized outgoing edge triggers 
 * when the source place is empty (has zero tokens).
 */
public class ZeroEdge extends OutEdge {

    /**
     * Constructs a ZeroEdge with a specified value.
     *
     * @param value The value associated with the ZeroEdge.
     */
    public ZeroEdge(int value) {
        super(value);
    }

    /**
     * Triggers the transition if the source place is empty. If the transition is
     * triggered, it prints a message indicating that there are no tokens in the source place.
     */
    @Override
    public void trigger() {
        if (isTriggerable()) {
            System.out.println("You have no token in this place");
        }
    }

    /**
     * Determines if the transition is triggerable. The transition is triggerable if
     * the source place has zero tokens.
     *
     * @return true if the source place has zero tokens, false otherwise.
     */
    @Override
    public boolean isTriggerable() {
        return super.place.getTokens() == 0;
    }
}
