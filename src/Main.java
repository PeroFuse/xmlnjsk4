import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int vertinimas;
        char ar_testi_programa;
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Vertinimo apibudinimas");
        ar_testi_programa = 't';
        //Programos ciklas su ivedimo tikrinimu
        while(ar_testi_programa == 't')
        {
            System.out.println("Iveskite vertinima nuo 1 iki 10");
            vertinimas = ivedimas.nextInt();
            System.out.println("Ivestas vertinimas :" + vertinimas + " ");
            switch(vertinimas){
                case 1: vertinimas = 1;
                case 2: vertinimas = 2;
                case 3: vertinimas = 3;
                case 4: vertinimas = 4;
                System.out.print("Netenkinami minimalus reikalavimai");
                break;

                case 5: vertinimas = 5;
                System.out.print("Zinios ir gebejimai(igudziai) tenkina minimalius reikalavimus");
                break;
                case 6: vertinimas = 6;
                System.out.print("Zinios ir gebejimai(igudziai) zemesni nei vidutiniai, yra klaidu");
                break;
                case 7: vertinimas = 7;
                System.out.print("Vidutines zinios ir gebejimai, yra neesminiu klaidu");
                break;
                case 8: vertinimas = 8;
                System.out.print("Geresnes nei vidutines zinios ir gebejimai");
                break;
                case 9: vertinimas = 9;
                System.out.print("Tvirtos zinios ir gebejimai");
                break;
                case 10: vertinimas = 10;
                System.out.print("Puikios, isskirtines zinios ir gebejimai");
                break;
                default:
                System.out.print("Tokio vertinimo ivesti negalima, naudokite skaicius nuo 1 iki 9");
                break;
            }
            System.out.println("\nAr noretumete testi programa? (taip 't'/'n' ne)");
            //  veikia tik stringui, todel naudoju .charAt(0), kad imtu tik viena zenkla
            ar_testi_programa = ivedimas.next().charAt(0);
        }//while
        System.out.println("Programa baige darbą");
    }

}
