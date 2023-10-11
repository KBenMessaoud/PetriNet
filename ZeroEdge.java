public class ZeroEdge extends OutEdge{

    public ZeroEdge(int value) {
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
