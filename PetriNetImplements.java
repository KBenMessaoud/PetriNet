import java.util.ArrayList;

/**
 * This class implements the Petri net structure and behaviour.
 * It manages the transitions and places of the Petri net and performs the necessary operations on them.
 */
public class PetriNetImplements implements petrinet {
    
    private ArrayList<Transition> transitions = new ArrayList<Transition>();
    private ArrayList<Place> places = new ArrayList<Place>();

    /**
     * Returns a formatted string representing the number of places and transitions
     * in the current Petri net.
     * @return String representation of the Petri net's state.
     */
    @Override
    public String toString() {
        return "Le nombre de places : " + places.size() + "    /////     Le nombre de transition : "+ transitions.size();
    }

    /**
     * Adds a place to the Petri net.
     * @param place The place to be added.
     */
    @Override
    public void add(Place place) {
        places.add(place);
    }

    /**
     * Removes a place from the Petri net if the list is not empty; otherwise,
     * prints a message indicating that the list of places is empty.
     * @param place The place to be removed.
     */
    @Override
    public void remove(Place place) {
        if(places.size() != 0){
            places.remove(place);
        } else {
            System.out.println("the list of places is empty");
        }
    }

    /**
     * Adds a transition to the Petri net.
     * @param transition The transition to be added.
     */
    @Override
    public void add(Transition transition) {
        transitions.add(transition);
    }

    /**
     * Adds an outgoing arc from a place to a transition with a specific weight.
     * @param place The source place.
     * @param transition The destination transition.
     * @param valeur The weight of the outgoing arc.
     */
    @Override
    public void addOutgoingArc(Place place, Transition transition, int valeur) {
        OutEdge outEdge = new OutEdge(valeur);
        outEdge.setPlace(place);
        outEdge.setTransition(transition);
        transition.addOutEdge(outEdge);
        place.addOutEdge(outEdge);
    }

    /**
     * Adds an incoming arc from a transition to a place with a specific weight.
     * @param transition The source transition.
     * @param place The destination place.
     * @param valeur The weight of the incoming arc.
     */
    @Override
    public void addIncomingArc(Transition transition, Place place, int valeur) {
        InEdge inEdge = new InEdge(valeur);
        inEdge.setPlace(place);
        inEdge.setTransition(transition);
        transition.addInEdge(inEdge);
        place.addInEdge(inEdge);
    }

    /**
     * Removes a specific transition from the Petri net.
     * @param transition The transition to be removed.
     */
    @Override
    public void remove(Transition transition) {
        transitions.remove(transition);
    }

    /**
     * Executes a simulation step, triggering transitions and their connected arcs.
     * It checks the triggerable state of all outgoing arcs before triggering any of them.
     * If all outgoing arcs of a transition are triggerable, they are all triggered, and subsequently,
     * all incoming arcs of the transition are also triggered.
     * @throws Exception In case an error occurs during the simulation step.
     */
    @Override
    public void step() throws Exception {
        for (int i = 0; i < transitions.size(); i++) {
            if (transitions.size() != 0) {
                boolean isTriggerable = true;

                for (int j = 0; j < transitions.get(i).getOutEdgeList().size(); j++) {
                    if (!transitions.get(i).getOutEdgeList().get(j).isTriggerable()) {
                        isTriggerable = false;
                        System.out.println("un arc n'est pas triggerable");
                        break;
                    }
                }

                if (isTriggerable) {
                    for (int k = 0; k < transitions.get(i).getOutEdgeList().size(); k++) {
                        transitions.get(i).getOutEdgeList().get(k).trigger();
                    }

                    for (int l = 0; l < transitions.get(i).getInEdgeList().size(); l++) {
                        transitions.get(i).getInEdgeList().get(l).trigger();
                    }
                }
            }
        }
    }

    /**
     * Removes a specific outgoing arc that connects a given place and transition.
     * @param place The connected place.
     * @param transition The connected transition.
     */
    @Override
    public void removeOutgoingArc(Place place, Transition transition) {
        place.getOutEdgeList().remove(place.getOutEdge());
        transition.getOutEdgeList().remove(transition.getOutEdge());
    }

    /**
     * Removes a specific incoming arc that connects a given transition and place.
     * @param transition The connected transition.
     * @param place The connected place.
     */
    @Override
    public void removeIncominggArc(Transition transition, Place place) {
        place.getInEdgeList().remove(place.getInEdge());
        transition.getInEdgeList().remove(transition.getInEdge());
    }

    /**
     * Finds and returns the name of a place by its name, or null if not found.
     * @param name The name of the place to find.
     * @return The name of the found place or null if not found.
     */
    @Override
    public String findPlaceByName(String name) {
        for (Place p : getAllPlaces()) {
            if (p.getName().equals(name)) {  
                return p.getName();
            }
        }
        System.out.println("the place " + name + " is not found");
        return null;
    }

    /**
     * Finds and returns the name of a transition by its name, or null if not found.
     * @param name The name of the transition to find.
     * @return The name of the found transition or null if not found.
     */
    @Override
    public String findTransitionByName(String name) {
        for (Transition t : getAllTransitions()) {
            if (t.getName().equals(name)) {  
                return t.getName();
            }
        }
        System.out.println("the transition " + name + " is not found");
        return null;
    }

    /**
     * Returns an ArrayList containing all the places in the Petri net.
     * @return ArrayList of all places.
     */
    @Override
    public ArrayList<Place> getAllPlaces() {
        return places;
    }

    /**
     * Returns an ArrayList containing all the transitions in the Petri net.
     * @return ArrayList of all transitions.
     */
    @Override
    public ArrayList<Transition> getAllTransitions() {
        return transitions;
    }

    /**
     * Retrieves all incoming edges connected to a specific place in the Petri net.
     * @param place The place whose incoming edges are to be retrieved.
     * @return ArrayList of all incoming edges connected to the specified place.
     */
    @Override
    public ArrayList<InEdge> getAllInComingEdges(Place place) {
        return place.getInEdgeList();
    }

    /**
     * Retrieves all outgoing edges connected to a specific place in the Petri net.
     * @param place The place whose outgoing edges are to be retrieved.
     * @return ArrayList of all outgoing edges connected to the specified place.
     */
    @Override
    public ArrayList<OutEdge> getAllOutGoingEdges(Place place) {
        return place.getOutEdgeList();
    }
}
