public class OutEdge extends Edge{

   
   Place place = new Place();
   
   
   
    public OutEdge(int value) {
        super(value);
    }


    @Override
    public void trigger() {
        if(this.getValue()> place.getTokens()){
            System.out.println("Not enough tokens");
        }
        else{
            try {
                place.remove(this.getValue());
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
       
    }

    @Override
    public boolean isTriggerable() {
        if(this.getValue() <= place.getTokens()){
            return true;
        }else{
            return false;
        }
    }

    
}
