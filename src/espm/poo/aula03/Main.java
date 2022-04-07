package src.espm.poo.aula03;

import src.espm.poo.aula02.Pessoa;

public class Main {
    
    public static void  main(String[] args){
        int N = 1000000;
        long t = System.currentTimeMillis();
        for(int i = 0; i < N; i++){
            ps[i] = new Pessoa("Humbero");
        }

        long a = System.currentTimeMillis();
        System.out.println("d1: " + (a-t));


        System.gc(); // invoca o gabage collector
        long d = System.currentTimeMillis();
        System.out.println("d2: " + (d - t));

       
    }

    public static boolean decriptar(String senha) {
        // verifica se a senha é válida
        return true;
        }
}
