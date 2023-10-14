import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        
        InEdge intest = new InEdge(4);
       
        OutEdge outEdge = new OutEdge(10);
        
       
       


        ArrayList<Integer> a = new ArrayList<>();
        
        a.add(1);
        a.add(2);
        a.add(3);
        a.size();
       // System.out.println("voila c moi "+ a.size());
PetriNetImplements p = new PetriNetImplements();

Place p1 = new Place("p1",10);
Place p2 = new Place("p2",30);
Place p3 = new Place("p3",20);
Place p4 = new Place("p4",35);

Transition t1 = new Transition("transition 1");
p.add(p1);
p.add(p2);
p.add(p3);
p.add(p4);
p.add(t1);
p.addIncomingArc(t1, p2, 5);
p.addOutgoingArc(p1, t1, 2);
p.addOutgoingArc(p1, t1, 6);
p.addOutgoingArc(p3, t1, 6);



p.step();
System.out.println("valeur de p1 apres step :" +p1.getTokens());
System.out.println("valeur de p2 apres step :"+ p2.getTokens());
    }
}