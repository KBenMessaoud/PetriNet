public class ZeroEdge extends OutEdge{

    public ZeroEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void trigger() {
        if(this.getValue()> place.getTokens()){
            System.out.println("Not enough tokens");
        }
        
    }

    @Override
    public boolean isTriggerable() {
        return true;
    }
    
}
