package p4.ejluces;

public class P4EjLuces {

    public static void main(String[] args) {
        Lampara l1 = new Lampara();
        System.out.println(l1.toString());
        
        l1.setIntensidad(5);
        System.out.println(l1.toString());
        
        l1.setIntensidad(12.4);
        System.out.println(l1.toString());
        
        l1.setIntensidad(50);
        System.out.println(l1.toString());
    }
    
}
