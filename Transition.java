import java.util.ArrayList;

public class Transition {
    
    private String name;
    
    private ArrayList<InEdge> inEdgeList = new ArrayList<>();
    private ArrayList<OutEdge> outEdgeList = new ArrayList<>(); // Added ArrayList of OutEdge
    private OutEdge outEdge;
    private InEdge inEdge;
    
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

    public void addOutEdge(OutEdge outEdge) {
        outEdgeList.add(outEdge);
    }

    public void addInEdge(InEdge inEdge) {
        inEdgeList.add(inEdge);
    }


    public InEdge getInEdge() {
        return inEdge;
    }
    public void setInEdge(InEdge inEdge) {
        this.inEdge = inEdge;
    }
    public ArrayList<InEdge> getInEdgeList() {
        return inEdgeList;
    }
    public void setInEdgeList(ArrayList<InEdge> inEdgeList) {
        this.inEdgeList = inEdgeList;
    }
    public OutEdge getOutEdge() {
        return outEdge;
    }
    public void setOutEdgeList(ArrayList<OutEdge> outEdgeList) {
        this.outEdgeList = outEdgeList;
    }
    public ArrayList<OutEdge> getOutEdgeList() {
        return outEdgeList;
    }

}
