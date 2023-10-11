public class OutEdge extends Edge{

   
   Place place = new Place();
   
   
   
    public OutEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void trigger() {
        
    }

    @Override
    public boolean isTriggerable() {
        return true;
    }

    
}
