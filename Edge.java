import java.util.ArrayList;

/**
 * The Edge class represents an edge in a Petri net.
 * Each edge has an associated value that can be modified.
 */
public class Edge {
    
    private int value;

    /**
     * Constructs a new Edge object with a specified value.
     *
     * @param value the initial value of the edge
     */
    public Edge(int value){
        this.value = value;
    }

    /**
     * Triggers an action associated with this edge and prints a message to the console.
     */
    public void trigger(){
        System.out.println("triggered");
    }
    
    /**
     * Checks if the edge is triggerable.
     *
     * @return true, as the edge is always triggerable in the current implementation
     */
    public boolean isTriggerable(){
        return true;
    }
    
    /**
     * Gets the value of the edge.
     *
     * @return the current value of the edge
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the edge.
     *
     * @param value the new value to be assigned to the edge
     */
    public void setValue(int value) {
        this.value = value;
    }
}
