import java.util.ArrayList;

/**
 * Represents a transition in a Petri net. Transitions are connected to places via 
 * incoming and outgoing edges and can trigger to move tokens between places.
 */
public class Transition {
    
    private String name;
    
    private ArrayList<InEdge> inEdgeList = new ArrayList<>();
    private ArrayList<OutEdge> outEdgeList = new ArrayList<>();
    private OutEdge outEdge;
    private InEdge inEdge;
    
    /**
     * Constructs a transition with a given name.
     * 
     * @param name The name of the transition.
     */
    Transition(String name) {
        this.name = name;
    }

    /**
     * Default constructor.
     */
    Transition() {}

    /**
     * Executes the transition, triggering outgoing and incoming edges
     * to move tokens between connected places, if the transition is triggerable.
     */
    // public void step() {
    //     for (int i = 0; i < outEdgeList.size() - 1; i++) {
    //         if (outEdgeList.get(i).isTriggerable()) {
    //             outEdgeList.get(i).trigger();
    //         } else {
    //             System.out.println("OutEdge: " + outEdgeList.get(i) + " is Not Triggerable");
    //         }
    //         inEdgeList.get(i).trigger();
    //     }
    // }

    /**
     * Returns the name of the transition.
     * 
     * @return The name of the transition.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds an outgoing edge to the transition.
     * 
     * @param outEdge The outgoing edge to be added.
     */
    public void addOutEdge(OutEdge outEdge) {
        outEdgeList.add(outEdge);
    }

    /**
     * Adds an incoming edge to the transition.
     * 
     * @param inEdge The incoming edge to be added.
     */
    public void addInEdge(InEdge inEdge) {
        inEdgeList.add(inEdge);
    }

    /**
     * Returns the current incoming edge.
     * 
     * @return The current incoming edge.
     */
    public InEdge getInEdge() {
        return inEdge;
    }

    /**
     * Sets an incoming edge to the transition.
     * 
     * @param inEdge The incoming edge to be set.
     */
    public void setInEdge(InEdge inEdge) {
        this.inEdge = inEdge;
    }

    /**
     * Returns the list of incoming edges.
     * 
     * @return The list of incoming edges.
     */
    public ArrayList<InEdge> getInEdgeList() {
        return inEdgeList;
    }

    /**
     * Sets the list of incoming edges to the transition.
     * 
     * @param inEdgeList The list of incoming edges to be set.
     */
    public void setInEdgeList(ArrayList<InEdge> inEdgeList) {
        this.inEdgeList = inEdgeList;
    }

    /**
     * Returns the current outgoing edge.
     * 
     * @return The current outgoing edge.
     */
    public OutEdge getOutEdge() {
        return outEdge;
    }

    /**
     * Sets the list of outgoing edges to the transition.
     * 
     * @param outEdgeList The list of outgoing edges to be set.
     */
    public void setOutEdgeList(ArrayList<OutEdge> outEdgeList) {
        this.outEdgeList = outEdgeList;
    }

    /**
     * Returns the list of outgoing edges.
     * 
     * @return The list of outgoing edges.
     */
    public ArrayList<OutEdge> getOutEdgeList() {
        return outEdgeList;
    }
}
