import Abstract.Dinosaurus;
import Interface.IMengambilTelur;

public class AnakPemburu extends Pemburu implements IMengambilTelur{
    public void mengambilTelur(Dinosaurus dino){
        System.out.println("Saya mengambil telur Dinosaurus yang diburu ayah");
    }
}
