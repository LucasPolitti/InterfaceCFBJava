public class AulaInterface {

    public static void main(String[] args) { 
        Sapo a1=new Sapo(10, 10, 10);
        Aranha a2=new Aranha(5,5,5, 2);
        Formiga a3=new Formiga(2,2,2);
        Vegetal v1=new Vegetal(1);
        Vegetal v2=new Vegetal(2);
        Vegetal v3=new Vegetal(3);

        a2.info();
        a2.atacar(a3);
        a2.comer(a3.getMassa());
        a2.info();
        System.out.println(a3.getVivo());

        //System.out.println(a3.getVivo());
        
        
        



        
      
    }
    
}
