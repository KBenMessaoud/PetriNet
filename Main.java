import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        
        System.out.println("modification");
        InEdge intest = new InEdge(4);
        intest.trigger();
        OutEdge outEdge = new OutEdge(10);
        
       
        outEdge.trigger();


        ArrayList<Integer> a = new ArrayList<>();
        
        a.add(1);
        a.add(2);
        a.add(3);
        a.size();
        System.out.println("voila c moi "+ a.size());



    }
}