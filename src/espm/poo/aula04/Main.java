package src.espm.poo.aula04;

public class Main {

    public static void main(String[] args){
        Aluno a1 = new Aluno(10, "Selmini");
        System.out.println(a1.toString());
        Aluno a2 = new Aluno(10, "Sandrinha");
        System.out.println(a2.toString());

        if (a1.equals(a2)){
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }

        Integer n1 = 10;
        Integer n2 = 10;
        
    }
    
}
