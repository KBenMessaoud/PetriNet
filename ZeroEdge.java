public class ZeroEdge extends OutEdge{

    public ZeroEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }

    //trigger: active la transition lorsque la place source est vide.

    @Override
    public void trigger() {
        if(isTriggerable() == true ){
            System.out.println("You have no token in this place");
        }
    }

    @Override
    public boolean isTriggerable() {

        if (super.place.getTokens() == 0){
            return true;
        }else{
            return false;
        }

    }
    
}
