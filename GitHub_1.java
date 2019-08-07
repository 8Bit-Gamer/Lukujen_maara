import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonir
 */
public class GitHub_1 {
    public static void main(String[] args){
        Scanner syote = new Scanner(System.in);
        int maara = 0;
        //Syötetään lähtötiedot.
        System.out.println("Syötä lukujen määrä.");
        maara = syote.nextInt();
        int[] luvut = new int[maara];
        int[] maarat = new int[maara];
        int[] luku = new int[maara]; //Tähän laitetaan tieto siitä, mitä lukuja on.
        int a = 0;
        boolean onkoLuku = false; //Tällä katsotaan, mitä lukuja taulukossa on.
        //Syötetään luvut.
        for (int x = 0; x < maara; x++){
            System.out.println("Syötä " + (x+1) + ". luku.");
            luvut[x] = syote.nextInt();
        }
        //Katsotaan, mitä lukuja taulukossa on.
        for (int x = 0; x < maara; x++){
            onkoLuku = false;
            //Katsotaan, onko luku taulukossa.
            //Lisätään luku, jos sitä ei ole.
            for (int y = 0; y < a; y++){
                if (luvut[x] == luku[y]){
                    //Luku on taulukossa.
                    onkoLuku = true;
                }
            }
            if (onkoLuku == false){
                //Lisätään luku.
                luku[a] = luvut[x];
                a++;
            }
        }
        //Lasketaan lukujen määrä.
        for (int x = 0; x < a; x++){
            for (int y = 0; y < maara; y++){
                if (luku[x] == luvut[y]){
                    //Luku löytyi.
                    maarat[x]++;
                }
            }
        }
        //Katsotaan tulokset.
        for (int x = 0; x < a; x++){
            System.out.println(luku[x] + ":" + maarat[x]);
        }
        
    }
}
