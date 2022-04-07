package src.espm.poo.aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MainLCollection {
    
    public static void main(String[] args){

        // Set -> não suporta duplicação
        Set<Integer> sinteiros = new TreeSet<>();
        sinteiros.add(1);
        sinteiros.add(2);
        sinteiros.add(3);
        sinteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(sinteiros).toArray()));

        // List -> suporta duplicação
        List<Integer> linteiros = new ArrayList<>();
        linteiros.add(1);
        linteiros.add(2);
        linteiros.add(3);
        linteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(linteiros).toArray()));


        Set<Aluno> salunos = new TreeSet<>();
        salunos.add(new Aluno(100, "Dezmini"));
        salunos.add(new Aluno(200, "Doismini"));
        salunos.add(new Aluno(100, null));
        System.out.println(Arrays.toString(Arrays.asList(salunos).toArray()));

        List<Aluno> lalunos = new ArrayList<>();
        lalunos.add(new Aluno(100, "Dezmini"));
        lalunos.add(new Aluno(200, "Doismini"));
        lalunos.add(new Aluno(100, null));
        System.out.println(Arrays.toString(Arrays.asList(lalunos).toArray()));

        Map<Integer, Aluno> mapa = new HashMap<>();
        mapa.put(100, new Aluno(100, "Dezmini"));
        mapa.put(200, new Aluno(200, "Doismini"));
        mapa.put(300, null);
        mapa.forEach((k, v) -> System.out.println(k + " ->" + v);));

    }



}
