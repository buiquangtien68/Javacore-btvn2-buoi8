import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SummonRift {
    private ArrayList<SKT> sktList;
    private ArrayList<G2> g2List;
    private LocalDateTime timeOfMatch=LocalDateTime.now();

    public SummonRift(ArrayList<SKT> sktList, ArrayList<G2> g2List) {
        this.sktList = sktList;
        this.g2List = g2List;
    }

    @Override
    public String toString() {
        return "SummonRift{" +"\n"+
                "sktList=" + sktList +"\n"+
                "g2List=" + g2List +"\n"+
                "timeOfMatch=" + timeOfMatch +"\n"+
                '}';
    }
}
