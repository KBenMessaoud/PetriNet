import javax.swing.JOptionPane;

/**
 * The InEdge class represents an incoming edge in a Petri net, extending the Edge class.
 * When triggered, it adds tokens to the associated place based on the edge's value.
 */
public class InEdge extends Edge {

    Place place = new Place();
    private Transition transition;
    
    /**
     * Constructs a new InEdge object with a specified value.
     *
     * @param value the initial value of the edge
     */
    public InEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }

    /**
     * Triggers the edge, adding tokens to the associated place.
     * The number of tokens added is equal to the edge's current value.
     */
    @Override
    public void trigger() {
        place.add(this.getValue());
    }

    /**
     * Sets the associated place for this edge.
     *
     * @param place2 the place to be associated with this edge
     */
    public void setPlace(Place place2) {
        this.place = place2;
    }

    /**
     * Sets the associated transition for this edge.
     * If the provided transition is null, a message is printed to the console.
     *
     * @param transition the transition to be associated with this edge
     */
    public void setTransition(Transition transition) {
        if (transition != null){
            this.transition = transition;
        } else {
            System.out.println("the transition " + transition + " is null");
        }
    }
}
