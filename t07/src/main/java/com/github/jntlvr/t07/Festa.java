package T07.src.main.java.com.github.jntlvr.T07;
import java.util.TreeSet;
public class Festa {
    private TreeSet<Convidado> convidados = new TreeSet<>();

    public void novoConvidado(Convidado c){
        convidados.add(c);
    }

    public Festa(Convidado c){
        convidados.add(c);
    }
}
