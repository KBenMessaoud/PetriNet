public class EmptyEdge extends OutEdge {

    public EmptyEdge(int value) {
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
