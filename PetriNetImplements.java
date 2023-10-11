import java.util.ArrayList;

public class PetriNetImplements implements petrinet{
    
    private ArrayList<Transition> transistions = new ArrayList<Transition>();
    private ArrayList<Place> places = new ArrayList<Place>();
	@Override
	public void add(Place place) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'add'");
	}
	@Override
	public void add(Transition transition) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'add'");
	}
	@Override
	public void OutgoingArc(Place place, Transition transition, int valeur) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'OutgoingArc'");
	}
	@Override
	public void addIncomingArc(Transition transition, Place place, int valeur) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addIncomingArc'");
	}
	@Override
	public void remove(Place place) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'remove'");
	}
	@Override
	public void remove(Transition transition) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'remove'");
	}
	@Override
	public void step(Transition transition) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'step'");
	}
	@Override
	public void removeOutgoingArc(Place place, Transition transition) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeOutgoingArc'");
	}
	@Override
	public void removeIncominggArc(Transition transition, Place place) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'removeIncominggArc'");
	}
	@Override
	public String findPlaceByName(String name) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findPlaceByName'");
	}
	@Override
	public String findTranistionByName(String name) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findTranistionByName'");
	}
	@Override
	public ArrayList<Place> getAllPlaces() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAllPlaces'");
	}
	@Override
	public ArrayList<Transition> getAllTransitions() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAllTransitions'");
	}
	@Override
	public ArrayList<Edge> getAllArcs() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getAllArcs'");
	}

}
