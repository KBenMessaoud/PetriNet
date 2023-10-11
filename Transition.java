import java.util.ArrayList;

public class Transition {
    
    private String name;
    private ArrayList<InEdge> inEdgeList = new ArrayList<>();
    private ArrayList<OutEdge> outEdgeList = new ArrayList<>(); // Added ArrayList of OutEdge
    
    Transition(String name){
        this.name = name;
    }

    Transition(){

    }

    public void step(){

    }

    public String getName(){
		return name;
    }

}
