import java.util.ArrayList;

/**
 * Represents a place in a Petri net. A place has tokens and can be connected 
 * to transitions via incoming and outgoing edges.
 */
public class Place {

    private int token;
    private String name;
    private OutEdge outEdge;
    private InEdge inEdge;
    private ArrayList<InEdge> inEdgeList = new ArrayList<>();
    private ArrayList<OutEdge> outEdgeList = new ArrayList<>();

    /**
     * Constructor that creates a place with a specified name and token count.
     * 
     * @param name  The name of the place.
     * @param token The initial number of tokens in the place.
     */
    public Place(String name, int token) {
        this.name = name;
        this.token = token;
    }

    /**
     * Default constructor.
     */
    public Place() {}

    /**
     * Removes a certain number of tokens from the place.
     *
     * @param tokenEnMoins The number of tokens to be removed.
     * @throws Exception If there aren't enough tokens in the place.
     */
    public void remove(int tokenEnMoins) throws Exception {
        if(this.token >= tokenEnMoins && this.token > 0) {
            this.token -= tokenEnMoins;
        } else {
            throw new Exception("Not enough tokens in this place");
        }
    }

    /**
     * Adds a certain number of tokens to the place.
     *
     * @param tokenSupplementaire The number of tokens to be added.
     */
    public void add(int tokenSupplementaire) {
        this.token += tokenSupplementaire;
    }

    /**
     * Returns the current number of tokens in the place.
     *
     * @return The number of tokens.
     */
    public int getTokens() {
        return token;
    }

    /**
     * Returns the name of the place.
     *
     * @return The name of the place.
     */
    public String getName() {
        return name;
    }

    /**
     * Checks if there are enough tokens for the outgoing edge.
     *
     * @return true if there are enough tokens, false otherwise.
     */
    public boolean isTokenSup() {
        return this.token >= outEdge.getValue();
    }

    /**
     * Adds an outgoing edge to the list of outgoing edges for this place.
     *
     * @param outEdge The outgoing edge to be added.
     */
    public void addOutEdge(OutEdge outEdge) {
        outEdgeList.add(outEdge);
    }

    /**
     * Adds an incoming edge to the list of incoming edges for this place.
     *
     * @param inEdge The incoming edge to be added.
     */
    public void addInEdge(InEdge inEdge) {
        inEdgeList.add(inEdge);
    }

    /**
     * Sets the list of incoming edges for this place.
     *
     * @param inEdgeList The list of incoming edges.
     */
    public void setInEdgeList(ArrayList<InEdge> inEdgeList) {
        this.inEdgeList = inEdgeList;
    }

    /**
     * Returns the list of incoming edges for this place.
     *
     * @return The list of incoming edges.
     */
    public ArrayList<InEdge> getInEdgeList() {
        return inEdgeList;
    }

    /**
     * Sets the outgoing edge for this place.
     *
     * @param outEdge The outgoing edge.
     */
    public void setOutEdge(OutEdge outEdge) {
        this.outEdge = outEdge;
    }

    /**
     * Returns the list of outgoing edges for this place.
     *
     * @return The list of outgoing edges.
     */
    public ArrayList<OutEdge> getOutEdgeList() {
        return outEdgeList;
    }

    /**
     * Returns the incoming edge for this place.
     *
     * @return The incoming edge.
     */
    public InEdge getInEdge() {
        return inEdge;
    }

    /**
     * Sets the incoming edge for this place.
     *
     * @param inEdge The incoming edge.
     */
    public void setInEdge(InEdge inEdge) {
        this.inEdge = inEdge;
    }

    /**
     * Returns the outgoing edge for this place.
     *
     * @return The outgoing edge.
     */
    public OutEdge getOutEdge() {
        return outEdge;
    }
}
