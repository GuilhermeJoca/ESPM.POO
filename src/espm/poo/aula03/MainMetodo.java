package espm.poo.aula03;
import espm.poo.aula02.Pessoa;

public class MainMetodo {
   

    public static void main(String[] args){
        int v = 10;
        int y = mult2(v);
        System.out.println ("v: " + v);
        System.out.println ("y: " + y);
        System.out.println ("v: " + v);

        Pessoa vip = new Pessoa("Mariana");

    }

    public static int mult2(int x){
        x = x * 2;
        return x;

    }

    public static void muultSalario(Pessoa p){
        p.salario *= 2;
    }
}
