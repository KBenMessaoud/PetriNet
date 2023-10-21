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


//getvalue out, gettokens p1, getvalue in <= getvalue out -> trigger
	// @Override
	//  public void step(){

	// 	for (int i =0; i<transitions.size();i++) { //boucle sur toutes les places
			
	// 		if(transitions.size()!=0){

	// 		for(int j = 0;j< transitions.get(i).getOutEdgeList().size();j++){                //boucle sur les arcsortants associés aux places i
 					
	// 				if(transitions.get(i).getOutEdgeList().get(j).isTriggerable()) {                     //ouehhh
    //                  transitions.get(i).getOutEdgeList().get(j).trigger();
    //     			}
	// 				 else{
    //                  System.out.println("OutEdge : "+ transitions.get(i).getOutEdgeList().get(j)+ " is Not Triggerable");
	// 				 System.out.println(transitions.size());
    //            }
			   
	// 		 			for(int m=0;m<transitions.get(i).getInEdgeList().size()-1;m++){
	// 						 a += transitions.get(i).getInEdgeList().get(m).getValue();
	// 					}
	// 					for(int n=0;n<transitions.get(i).getOutEdgeList().size()-1;n++){
	// 						 b += transitions.get(i).getInEdgeList().get(n).getValue();
	// 					}
	// 		 for(int k = 0;k< transitions.get(i).getInEdgeList().size();k++){
						
    //                 	if(transitions.get(i).getInEdgeList().get(k).getValue()<= transitions.get(i).getOutEdgeList().get(j).getValue() && b>=a){
							
	// 						transitions.get(i).getInEdgeList().get(k).trigger(); // il faut aussi boucler sur tous les arcs entrants associés à la place 
	// 		   }else{System.out.println("poids de l'arc entrant trop grand");}
    //            }}}
			 
			  
			
			
	// 		}
	// 	}
                 
			//getvalue out, gettokens p1, getvalue in <= getvalue out -> trigger
	@Override
	 public void step() throws Exception{

		for (int i =0; i<transitions.size();i++) { //boucle sur toutes les places
						
					

			if(transitions.size()!=0){


				boolean isTriggerable = true;

			for(int j = 0;j< transitions.get(i).getOutEdgeList().size();j++){                //boucle sur les arcsortants associés aux places i
 					
					if(!(transitions.get(i).getOutEdgeList().get(j).isTriggerable())) {  
						      isTriggerable = false;   
							  System.out.println("un arc n'est pas triggerable");
							  break; 
							           
                     
        			}}

					for(int q = 0;q< transitions.get(i).getOutEdgeList().size();q++){    
					if(isTriggerable){
						

 						  
						
							 transitions.get(i).getOutEdgeList().get(q).trigger();
							
							
						
					}}
					
					
                   
					
					
              
				
				
				
					
			 			
						if(isTriggerable){
							for(int k = 0;k< transitions.get(i).getInEdgeList().size();k++){
							
							transitions.get(i).getInEdgeList().get(k).trigger(); // il faut aussi boucler sur tous les arcs entrants associés à la place 
							
							
						}   
					}
							
			   }
			 
                    
               }
			   
			 //  else{
				//throw new Exception("Le poids des arcs entrants associés à une transition : "+ transitions.get(i) +" n'est pas égal au poids des arcs sortants");
			   //}
			
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
