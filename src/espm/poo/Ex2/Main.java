package src.espm.poo.Ex2;

import java.util.Scanner;

public class Main {
    
    private static Banco banco = null;
    public static void main(String[] args) {

        banco = new Banco("ESPM");
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            try{
            System.out.print("ESPM>");
            String input = scan.nextLine().trim().toLowerCase();

            if("".equals(input)){

            
            }else if("exit".equals(input)){
                exit = true;
            }else if("help".equals(input)){
                help();
            }else if ("list".equals(input)){
                listCustomers(banco);
            }else if ("add".equals(input)){
                addCustomers(banco);
            } else if ("find".equals(input)){
                throw new UnsupportedOperationException();
            } else {
                System.out.println("Comando inválido");
            }
        }catch(UnsupportedOperationException e){
            e.printStackTrace();
        }
        
        }
        System.out.println("Bye Bye!");
        

    }

    private static void help(){
        System.out.println("ESPM Sistema de Clientes");
        System.out.println("------------------------");
        System.out.println("add -> Cadastra Cliente");
        System.out.println("list -> Lista Clientes");
        System.out.println("del -> Apaga Cliente");
        System.out.println("find -> Localiza Cliente");
        System.out.println();
        System.out.println("exit -> Sair do Sistema");
    }

    private static void listCustomers(Banco banco){
        banco.getClientes().forEach(c -> System.out.println(c)); // notação lâmbida

        //poderia ser:
        // for (Cliente c : banco.getClientes()){
        //     System.out.println(c);
       //  }
     }

     private static void addCustomers(Banco banco){
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
         String nome = scan.nextLine();

        System.out.print("CPF: ");
         String cpf = scan.nextLine();

        Cliente c = new Cliente();
            c.setNome(nome );
            c.setCpf(cpf);
            banco.addCliente(c);
     }
    
}
