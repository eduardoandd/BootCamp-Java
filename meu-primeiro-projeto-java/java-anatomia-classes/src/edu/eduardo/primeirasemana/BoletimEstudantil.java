package edu.eduardo.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {

        int mediaFinal = 10;

        if(mediaFinal < 6){
            System.out.println("Reprovado");
        }

        else if(mediaFinal == 6){
            System.out.println("Passou na sorte");
        }
        else if(mediaFinal == 10){
            System.out.println("GABARITOU");
        }
        else{
            System.out.println("APROVADO");
        }
        
    }
}
