import java.util.ArrayList;

public class PetriNetImplements implements petrinet{
    
    private ArrayList<Transition> transistions = new ArrayList<Transition>();
    private ArrayList<Place> places = new ArrayList<Place>();
	
    


    @Override
    public String toString() {

    // TODO Auto-generated method stub
    return "Le nombre de places : " + places.size() + "    /////     Le nombre de transition : "+ transistions.size();

    }


    @Override
	public void add(Place place) {
		// TODO Auto-generated method stub
        int nombreElementPlaceList;

        nombreElementPlaceList = places.size();

        places.add(nombreElementPlaceList, place);
	}

    @Override
	public void remove(Place place) {
     
        if(places.size()!=0){
			
           places.remove(place);
        }else{
            System.out.println("the list of places is empty");
        }
       
    
    }

	@Override
	public void add(Transition transition) {
		// TODO Auto-generated method stub


        transistions.add(transistions.size(), transition);



	}
	@Override
	public void addOutgoingArc(Place place, Transition transition, int valeur) {
		// TODO Auto-generated method stub
       
		OutEdge outEdge = new OutEdge(valeur);
		outEdge.setPlace(place);
		outEdge.setTransition(transition);
		transition.addOutEdge(outEdge);
		place.addOutEdge(outEdge);

	}
	@Override
	public void addIncomingArc(Transition transition, Place place, int valeur) {
		// TODO Auto-generated method stub
		InEdge inEdge = new InEdge(valeur);
		inEdge.setPlace(place);
		inEdge.setTransition(transition);
		transition.addInEdge(inEdge);
		place.addInEdge(inEdge);

	}
	
	@Override
	public void remove(Transition transition) {
		// TODO Auto-generated method stub



		
	}
	// @Override
	// public void step(Transition transition) {
	// 	// TODO Auto-generated method stub
	// }

	@Override
	public void removeOutgoingArc(Place place, Transition transition) {
		// TODO Auto-generated method stub
		place.getOutEdgeList().remove(place.getOutEdge());
		transition.getOutEdgeList().remove(transition.getOutEdge());
		
	}
	@Override
	public void removeIncominggArc(Transition transition, Place place) {
		// TODO Auto-generated method stub
		place.getInEdgeList().remove(place.getInEdge());
		transition.getInEdgeList().remove(transition.getInEdge());
	}
	@Override
	public String findPlaceByName(String name) {
		for (Place p : getAllPlaces()) {
			if (p.getName() == name) {
				return p.getName();
			}
		}
		System.out.println("the place "+ name + " is not found");
		return null;
	}
	@Override
	public String findTransitionByName(String name) {
		// TODO Auto-generated method stub
				for (Transition t : getAllTransitions()) {
			if (t.getName() == name) {
				return t.getName();
			}
		}
		System.out.println("the transition "+ name + " is not found");
		return null;
	}
	}
	@Override
	public ArrayList<Place> getAllPlaces() {
		return places;
		// TODO Auto-generated method stub
	}
	@Override
	public ArrayList<Transition> getAllTransitions() {
		return transistions;
		// TODO Auto-generated method stub
	}
	
	@Override
	public ArrayList<Edge> getAllInComingEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Edge> getAllOutGoingEdges() {
		// TODO Auto-generated method stub
		return null;
	}



}
