import java.util.List;

public class Paev {
    public String kuupaev;
    public List<Tund> tundideNimekiri;
    public String paev;

    @Override
    public String toString() {
        return "Paev: " + paev +
                "\nkuupaev: " + kuupaev +
                "\nTunnid: " + tundideNimekiri +
                "\n"
                ;
    }
}