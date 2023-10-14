import javax.swing.JOptionPane;

public class InEdge extends Edge {

    
    Place place = new Place();
    private Transition transition;
    
    
    public InEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void trigger() {
       
            place.add(this.getValue());
        }
      

    


    public void setPlace(Place place2) {
        this.place = place2;
    }


    public void setTransition(Transition transition) {
        
               if (transition != null){
                   this.transition = transition;
               }else{
                System.out.println("the transition "+ transition + " is null");
               }
              
            

    }
    
}
