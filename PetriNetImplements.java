import java.util.ArrayList;

public class PetriNetImplements implements petrinet{
    
    private ArrayList<Transition> transistions = new ArrayList<Transition>();
    private ArrayList<Place> places = new ArrayList<Place>();
	
    
    @Override
	public void add(Place place) {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(Transition transition) {
		// TODO Auto-generated method stub
	}
	@Override
	public void addOutgoingArc(Place place, Transition transition, int valeur) {
		// TODO Auto-generated method stub
	}
	@Override
	public void addIncomingArc(Transition transition, Place place, int valeur) {
		// TODO Auto-generated method stub
	}
	@Override
	public void remove(Place place) {
		// TODO Auto-generated method stub
	}
	@Override
	public void remove(Transition transition) {
		// TODO Auto-generated method stub
	}
	@Override
	public void step(Transition transition) {
		// TODO Auto-generated method stub
	}
	@Override
	public void removeOutgoingArc(Place place, Transition transition) {
		// TODO Auto-generated method stub
	}
	@Override
	public void removeIncominggArc(Transition transition, Place place) {
		// TODO Auto-generated method stub
	}
	@Override
	public String findPlaceByName(String name) {
		return name;
		// TODO Auto-generated method stub
	}
	@Override
	public String findTranistionByName(String name) {
		// TODO Auto-generated method stub
		return name;
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
	public ArrayList<Edge> getAllArcs() {
		return null;
		// TODO Auto-generated method stub
	}

}
