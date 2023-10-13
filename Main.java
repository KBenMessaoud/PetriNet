import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        
        InEdge intest = new InEdge(4);
        intest.trigger();
        OutEdge outEdge = new OutEdge(10);
        
       
       


        ArrayList<Integer> a = new ArrayList<>();
        
        a.add(1);
        a.add(2);
        a.add(3);
        a.size();
       // System.out.println("voila c moi "+ a.size());
PetriNetImplements p = new PetriNetImplements();

Place p1 = new Place("p1",10);
Place p2 = new Place("p2",2);
Place p3 = new Place("p3",2);
Place p4 = new Place("p4",2);

Transition t1 = new Transition();
p.add(p1);
p.add(p2);
p.add(p3);
p.add(p4);
p.add(t1);
p.addIncomingArc(t1, p2, 5);
p.addOutgoingArc(p1, t1, 2);
p.addOutgoingArc(p1, t1, 6);
p.addOutgoingArc(p3, t1, 6);

System.out.println("nombre d'outedge de p1  :"  +p1.getOutEdgeList().size() );
p.step();


//p1.outEdge.trigger();
System.out.println("p1 a " + p1.getTokens());


System.out.println(p.toString());

    }
}