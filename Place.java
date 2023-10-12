import java.util.ArrayList;

public class Place {

    private int token;
    private String name;
    private OutEdge outEdge;
    private InEdge inEdge;
    private ArrayList<InEdge> inEdgeList = new ArrayList<>();
    private ArrayList<OutEdge> outEdgeList = new ArrayList<>(); // Added ArrayList of OutEdge

    public Place(String name, int token){
        this.name = name;
        this.token = token;
        
    }
    public Place(){
        
    }


    public void remove(int tokenEnMoins) throws Exception{
        if(this.token >= tokenEnMoins && this.token > 0){
        this.token-=tokenEnMoins;

    }else{
        throw new Exception("Not enought tokens in this place");
    }}
    
    public void add(int tokenSupplementaire){
        this.token+=tokenSupplementaire;
        
    }

    public int getTokens(){
		return token;
        
    }

    public String getName(){
		return name;
        
    }

    public boolean isTokenSup(){
		if(this.token>=outEdge.getValue()){
            return true;
        }else{
            return false;
        }

    }
    public void addOutEdge(OutEdge outEdge) {
        outEdgeList.add(outEdge);

    }
    public void addInEdge(InEdge inEdge) {
        inEdgeList.add(inEdge);

        
    }
    public void removeOutgoingArc(){}



    
    public void setInEdgeList(ArrayList<InEdge> inEdgeList) {
        this.inEdgeList = inEdgeList;
    }
    public ArrayList<InEdge> getInEdgeList() {
        return inEdgeList;
    }
    public void setOutEdge(OutEdge outEdge) {
        this.outEdge = outEdge;
    }
    public ArrayList<OutEdge> getOutEdgeList() {
        return outEdgeList;
    }
    public InEdge getInEdge() {
        return inEdge;
    }
    public void setInEdge(InEdge inEdge) {
        this.inEdge = inEdge;
    }
    public OutEdge getOutEdge() {
        return outEdge;
    }
    
}
