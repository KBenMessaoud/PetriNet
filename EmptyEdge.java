/**
 * The EmptyEdge class represents a specialized type of OutEdge in a Petri net.
 * An EmptyEdge is triggered if there are tokens available in the associated place.
 * When triggered, it removes all tokens from the associated place.
 */
public class EmptyEdge extends OutEdge {

    /**
     * Constructs a new EmptyEdge object with a specified value.
     *
     * @param value the initial value of the edge
     */
    public EmptyEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }

    /**
     * Triggers the edge if it is triggerable. All tokens from the associated place are removed
     * when this edge is triggered.
     */
    @Override
    public void trigger() {
        if(isTriggerable() == true){

            try {
                super.place.remove(super.place.getTokens());
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    /**
     * Checks if the edge is triggerable. The edge is triggerable if there are tokens in the associated place.
     *
     * @return true if there are more than 0 tokens in the associated place, otherwise false
     */
    public boolean isTriggerable() {
         if(super.place.getTokens() <= 0){
            System.out.println("Not enough tokens");
            return false;
        } else {
            return true;
        }
    }
}
