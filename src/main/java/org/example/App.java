package org.example;

import java.io.*;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String[] pronomes = {"je", "tu", "il/ elle", "nous", "vous", "ils/elles"};
        String[] verbes = {"aller","faire", "être", "vouloir","pouvoir" ,"devoir", "avoir", "savoir", "prendre", "mettre"};
        String pr;
        int count = 0;
        String answ;
        int pansw;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        Input i = new Input();

        System.out.println("Choisir la numero de verbe");

        for(String s : verbes){
            count++;
            System.out.println(count+". " + s);
        }

        //input number
        System.out.println("Numero: ");
        answ = reader.readLine();
        // parse string to int
        pansw = Integer.parseInt(answ);


        // Get a random index from pronouns
        int randomIndex = random.nextInt(pronomes.length);

        // save pronoun in string
        pr = pronomes[randomIndex];

        //save answer in string
        String s = i.NumberVerb(pansw, pr);
        String uansw = "";

        System.out.println(pr + ": ");
        uansw = reader.readLine();

        //compare the given string with solution
        if(uansw.equals(s))
        {
            System.out.println("vrai");
        } else{
            System.out.println("faux, la solution est:" + pr + " " + s);
        }


    }
}
