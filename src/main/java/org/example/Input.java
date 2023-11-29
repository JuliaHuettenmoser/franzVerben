package org.example;

public class Input {

    public String NumberVerb(int answ, String pronomen){

        Verbes v = new Verbes();

        //switch case für alle verben
            switch (answ) {
                case 1:
                    System.out.println("aller");
                    return v.konjugiereAller(pronomen);
                case 2:
                    System.out.println("faire");
                    return v.konjugiereFaire(pronomen);
                case 3:
                    System.out.println("être");
                    return v.konjugiereEtre(pronomen);
                case 4:
                    System.out.println("vouloir");
                    return v.konjugiereVouloir(pronomen);
                case 5:
                    System.out.println("pouvoir");
                    return v.konjugierePouvoir(pronomen);
                case 6:
                    System.out.println("devoir");
                    return v.konjugiereDevoir(pronomen);
                case 7:
                    System.out.println("avoir");
                    return v.konjugiereAvoir(pronomen);
                case 8:
                    System.out.println("savoir");
                    return v.konjugiereSavoir(pronomen);
                case 9:
                    System.out.println("prendre");
                    return v.konjugierePrendre(pronomen);
                case 10:
                    System.out.println("mettre");
                    return v.konjugiereMettre(pronomen);
                default:
                    return "TODO";
            }
        }
}
