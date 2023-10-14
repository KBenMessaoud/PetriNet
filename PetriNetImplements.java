import java.net.Inet4Address;
import java.util.ArrayList;

public class PetriNetImplements implements petrinet{
    
    private ArrayList<Transition> transitions = new ArrayList<Transition>();
    private ArrayList<Place> places = new ArrayList<Place>();

    


    @Override
    public String toString() {

    // TODO Auto-generated method stub
    return "Le nombre de places : " + places.size() + "    /////     Le nombre de transition : "+ transitions.size();

    }


    @Override
	public void add(Place place) {
		
		places.add(place);
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

        transitions.add(transitions.size(), transition);
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
		transitions.remove(transition);
	}


	@Override
	 public void step(){
		for (int i =0; i<places.size();i++) {                         //boucle sur toutes les places
			if(places.size()!=0){
			for(int j = 0;j< places.get(i).getOutEdgeList().size();j++){                //boucle sur les arcsortants associés aux places i
 					
					if(places.get(i).getOutEdgeList().get(j).isTriggerable()) {                     //ouehhh
                     places.get(i).getOutEdgeList().get(j).trigger();
        	
                    
               }else{
                     System.out.println("OutEdge : "+ places.get(i).getOutEdgeList().get(j)+ " is Not Triggerable");
					 System.out.println(places.size());
               }
			}
			   for(int k = 0;k< places.get(i).getInEdgeList().size();k++){
					places.get(i).getInEdgeList().get(k).trigger(); // il faut aussi boucler sur tous les arcs entrants associés à la place 
			   }
                 
			}
		}
}






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
	
	@Override
	public ArrayList<Place> getAllPlaces() {
		return places;
		// TODO Auto-generated method stub
	}
	@Override
	public ArrayList<Transition> getAllTransitions() {
		return transitions;
		// TODO Auto-generated method stub
	}
	
	@Override
	//récup toutes les inEdge d'une place

	public ArrayList<InEdge> getAllInComingEdges(Place place) {
		ArrayList<InEdge> AllIncomingEdge = new ArrayList<InEdge>() ;
		AllIncomingEdge = place.getInEdgeList();
		return AllIncomingEdge;
	}

	@Override
	public ArrayList<OutEdge> getAllOutGoingEdges(Place place) {
		ArrayList<OutEdge> AllOutGoingEdges = new ArrayList<OutEdge>() ;
		AllOutGoingEdges = place.getOutEdgeList();
		return AllOutGoingEdges;
	}



}
