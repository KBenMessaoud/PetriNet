
public class Place {

    private int token;
    private String name;
    private OutEdge outEdge;

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
}
