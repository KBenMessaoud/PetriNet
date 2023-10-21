import java.util.ArrayList;

/**
 * The petrinet interface defines the operations that can be performed on a Petri net.
 * It includes methods for adding and removing places and transitions, managing incoming and outgoing arcs,
 * and performing simulation steps.
 */
public interface petrinet {
    
    /**
     * Adds a new place to the Petri net.
     *
     * @param place the place to be added
     */
    public void add(Place place);

    /**
     * Adds a new transition to the Petri net.
     *
     * @param transition the transition to be added
     */
    public void add(Transition transition);

    /**
     * Adds an outgoing arc connecting a source place to a destination transition with a defined weight.
     *
     * @param place the source place
     * @param transition the destination transition
     * @param valeur the weight of the arc
     */
    public void addOutgoingArc(Place place, Transition transition, int valeur);

    /**
     * Adds an incoming arc to the network, connecting a source transition to a destination place with a specific weight.
     *
     * @param transition the source transition
     * @param place the destination place
     * @param valeur the weight of the arc
     */
    public void addIncomingArc(Transition transition, Place place, int valeur);

    /**
     * Removes a place from the Petri net.
     *
     * @param place the place to be removed
     */
    public void remove(Place place);

    /**
     * Removes a transition from the Petri net.
     *
     * @param transition the transition to be removed
     */
    public void remove(Transition transition);

    /**
     * Removes a specific outgoing arc.
     *
     * @param place the source place of the arc
     * @param transition the destination transition of the arc
     */
    public void removeOutgoingArc(Place place, Transition transition);

    /**
     * Removes a specific incoming arc.
     *
     * @param transition the source transition of the arc
     * @param place the destination place of the arc
     */
    public void removeIncominggArc(Transition transition, Place place);

    /**
     * Finds and returns a place by its name.
     *
     * @param name the name of the place
     * @return the name of the found place
     */
    public String findPlaceByName(String name);

    /**
     * Finds and returns a transition by its name.
     *
     * @param name the name of the transition
     * @return the name of the found transition
     */
    public String findTransitionByName(String name);

    /**
     * Executes a simulation step by activating a given transition.
     *
     * @throws Exception if an error occurs during the simulation step
     */
    public void step() throws Exception;

    /**
     * Returns a list of all places in the Petri net.
     *
     * @return a list of all places
     */
    public ArrayList<Place> getAllPlaces();

    /**
     * Returns a list of all transitions in the Petri net.
     *
     * @return a list of all transitions
     */
    public ArrayList<Transition> getAllTransitions();

    /**
     * Returns a list of all outgoing arcs connected to a given place in the Petri net.
     *
     * @param place the place whose outgoing arcs are to be retrieved
     * @return a list of all outgoing arcs connected to the given place
     */
    public ArrayList<OutEdge> getAllOutGoingEdges(Place place);

    /**
     * Returns a list of all incoming arcs connected to a given place in the Petri net.
     *
     * @param place the place whose incoming arcs are to be retrieved
     * @return a list of all incoming arcs connected to the given place
     */
    public ArrayList<InEdge> getAllInComingEdges(Place place);
}
