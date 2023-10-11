import java.util.ArrayList;

public class Edge {
    
    private int value;

    public Edge(int value){

        this.value = value;
    }


    public void trigger(){
        System.out.println("triggered");
    }
    
    
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
