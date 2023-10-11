import javax.swing.JOptionPane;

public class InEdge extends Edge {

    Place place = new Place();
    
    
    
    public InEdge(int value) {
        super(value);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void trigger() {
        
        place.add(this.getValue());
    }
    
}
