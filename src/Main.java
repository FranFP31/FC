import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jugadores Portero=new Jugadores("Mente Fria",50,"71357574M",1,0);
        Jugadores Def1=new Jugadores("Antonio Recio",47,"55662211M",2,0);
        ArrayList<Jugadores> jugadores=new ArrayList<>();
        jugadores.add(Portero);
        jugadores.add(Def1);
        System.out.println(jugadores+"\n");
    }



}