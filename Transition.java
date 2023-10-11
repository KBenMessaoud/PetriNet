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

        	for(int i = 0;i<outEdgeList.size()-1;i++){
               if(outEdgeList.get(i).isTriggerable()) {
                     outEdgeList.get(i).trigger();
                    
               }else{
                     System.out.println("OutEdge : "+ outEdgeList.get(i)+ " is Not Triggerable");
               }
                 inEdgeList.get(i).trigger();
            }




    }

    public String getName(){
		return name;
    }

}
