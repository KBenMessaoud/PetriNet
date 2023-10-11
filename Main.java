class Main{
    public static void main(String[] args) {
        
        System.out.println("modification");
        InEdge intest = new InEdge(4);
        intest.trigger();
        OutEdge outEdge = new OutEdge(10);
        
       
        outEdge.trigger();

    }
}