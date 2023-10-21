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
Place p2 = new Place("p2",3);
Place p3 = new Place("p3",0);
Place p4 = new Place("p4",8);

Transition t1 = new Transition("transition 1");
Transition t2 = new Transition("transition 2");

p.add(p1);
p.add(p2);
p.add(p3);
//p.add(p4);
p.add(t1);
p.add(t2);

// p.addIncomingArc(t1, p3, 2);
// p.addIncomingArc(t1, p3, 1);

p.addIncomingArc(t1, p3, 100);
p.addIncomingArc(t1, p4, 200);
p.addOutgoingArc(p1, t1, 10);
p.addOutgoingArc(p2, t1, 2);

//getvalue out, gettokens p1, getvalue in <= getvalue out -> trigger




try {
    p.step();
} catch (Exception e) {
    // TODO Auto-generated catch block
   System.out.println("probleme de valeur : la somme des poids des arcs entrants est différente de celle des arcs sortants à une transition donnée");
}
System.out.println("valeur de p1 apres step :" +p1.getTokens());
System.out.println("valeur de p2 apres step :"+ p2.getTokens());
System.out.println("valeur de p3 apres step :"+ p3.getTokens());
System.out.println("valeur de p4 apres step :"+ p4.getTokens());
    }
}