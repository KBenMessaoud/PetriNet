import java.util.ArrayList;

public interface petrinet {
    
    //add(Place place): ajoute une nouvelle place au réseau de Petri.
    public void add(Place place);

    //add(Transition transition): Intègre une transition au réseau.
    public void add (Transition transition);

    //addOutgoingArc(Place source, Transition destination, int weight): Cette méthode ajoute un arc sortant, connectant une place source à une transition de destination avec un poids défini.
    public void addOutgoingArc(Place place, Transition transition, int valeur);

    //addIncomingArc(Transition source, Place destination, int weight): Ajoute un arc entrant au réseau, où l'arc est connecté d'une transition source à une place de destination et cela avec un poids spécifique qui correspond dans notre diagramme de classe à l’attribut value.
    public void addIncomingArc(Transition transition, Place place, int valeur);

    //remove(Place place) : supprime une place
    public void remove (Place place);

    //remove(Transition transition): supprime une transition du réseau
    public void remove (Transition transition);

    //step(Transition transition): exécute une étape de simulation en activant une transition donnée.
  //  public void step (Transition transition);
    
    //removeOutgoingArc(Place source, Transition destination): Élimine un arc sortant spécifique.
    public void removeOutgoingArc(Place place, Transition transition);

    //removeIncomingArc(Transition source, Place destination): Retire un arc entrant spécifique.
    public void removeIncominggArc(Transition transition, Place place);

    //findPlaceByName(string): Elle recherche et retourne une place par son nom.
    public String findPlaceByName(String name);

    //findTransitionByName(string): Elle retourne une transition grâce à son nom.
    public String findTranistionByName(String name);

    //getAllPlaces(): Elle retourne une liste de toutes les places dans le réseau.
    public ArrayList<Place> getAllPlaces();

    //getAllTransitions(): Elle retourne une liste de toutes les transitions dans le réseau.
    public ArrayList<Transition> getAllTransitions();

    //getAllArcs(): Elle retourne une liste de tous les arcs dans le réseau.
    public ArrayList<Edge> getAllOutGoingEdges();

    public ArrayList<Edge> getAllInComingEdges();













}
