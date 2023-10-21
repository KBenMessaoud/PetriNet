/**
 * The OutEdge class represents an outgoing edge in a Petri net, extending the Edge class.
 * When triggered, it removes tokens from the associated place based on the edge's value,
 * provided there are enough tokens available.
 */
public class OutEdge extends Edge {

    Place place = new Place();
    private Transition transition;
    
    /**
     * Constructs a new OutEdge object with a specified value.
     *
     * @param value the initial value of the edge
     */
    public OutEdge(int value) {
        super(value);
    }

    /**
     * Triggers the edge, removing tokens from the associated place.
     * The number of tokens removed is equal to the edge's current value,
     * if there are enough tokens available in the place.
     */
    @Override
    public void trigger() {
        if(this.getValue() > place.getTokens()){
            System.out.println("Not enough tokens");
        }
        else {
            try {
                place.remove(this.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Checks if the edge is triggerable. 
     * The edge is triggerable if the associated place has equal or more tokens than the edge's value.
     *
     * @return true if there are enough tokens in the associated place, otherwise false
     */
    @Override
    public boolean isTriggerable() {
        return this.getValue() <= place.getTokens();
    }

    /**
     * Sets the associated place for this edge.
     *
     * @param place the place to be associated with this edge
     */
    public void setPlace(Place place) {
        this.place = place;
    }

    /**
     * Sets the associated transition for this edge.
     *
     * @param transition the transition to be associated with this edge
     */
    public void setTransition(Transition transition) {
        this.transition = transition;
    }
}
