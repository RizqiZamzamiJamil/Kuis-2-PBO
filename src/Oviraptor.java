import Abstract.Dinosaurus;
import Interface.IBertelur;

public class Oviraptor extends Dinosaurus implements IBertelur{
    public void makan(){
        System.out.println("Oviraptor sering makan telur");
    }

    public void berjalan(){
        System.out.println("Oviraptor jalannya cepat karena tubuhnya ramping");
    }

    public void bertelur(){
        System.out.println("Oviraptor bisa bertelur");
    }
}
