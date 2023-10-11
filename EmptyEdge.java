public class EmptyEdge extends OutEdge {

    public EmptyEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void trigger() {
        if(isTriggerable() == true){

            try {
                super.place.remove(super.place.getTokens());
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public boolean isTriggerable() {
         if(super.place.getTokens() <= 0){
            System.out.println("Not enough tokens");

        return false;
    }else{
        return true;

    }
    }
    
}
