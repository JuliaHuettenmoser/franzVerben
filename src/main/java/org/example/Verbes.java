package org.example;

public class Verbes {


    // pronom returned konjugiertes verb
    public static String konjugiereAller(String pronomen) {
        return switch (pronomen) {
            case "je" -> "vais";
            case "tu" -> "vas";
            case "il/elle/on" -> "va";
            case "nous" -> "allons";
            case "vous" -> "allez";
            case "ils/elles" -> "vont";
            default -> "";
        };
    }

    public static String konjugiereFaire(String pronomen) {
        return switch (pronomen) {
            case "je" -> "fais";
            case "tu" -> "fais";
            case "il/elle/on" -> "fait";
            case "nous" -> "faisons";
            case "vous" -> "faites";
            case "ils/elles" -> "font";
            default -> "";
        };
    }

    public static String konjugiereEtre(String pronomen) {
        return switch (pronomen) {
            case "je" -> "suis";
            case "tu" -> "es";
            case "il/elle/on" -> "est";
            case "nous" -> "sommes";
            case "vous" -> "êtes";
            case "ils/elles" -> "sont";
            default -> "";
        };
    }

    public static String konjugiereVouloir(String pronomen) {
        return switch (pronomen) {
            case "je" -> "veux";
            case "tu" -> "veux";
            case "il/elle/on" -> "veut";
            case "nous" -> "voulons";
            case "vous" -> "voulez";
            case "ils/elles" -> "veulent";
            default -> "";
        };
    }

    public static String konjugierePouvoir(String pronomen) {
        return switch (pronomen) {
            case "je" -> "peux";
            case "tu" -> "peux";
            case "il/elle/on" -> "peut";
            case "nous" -> "pouvons";
            case "vous" -> "pouvez";
            case "ils/elles" -> "peuvent";
            default -> "";
        };
    }

    public static String konjugiereDevoir(String pronomen) {
        return switch (pronomen) {
            case "je" -> "dois";
            case "tu" -> "dois";
            case "il/elle/on" -> "doit";
            case "nous" -> "devons";
            case "vous" -> "devez";
            case "ils/elles" -> "doivent";
            default -> "";
        };
    }

    public static String konjugiereAvoir(String pronomen) {
        return switch (pronomen) {
            case "je" -> "ai";
            case "tu" -> "as";
            case "il/elle/on" -> "a";
            case "nous" -> "avons";
            case "vous" -> "avez";
            case "ils/elles" -> "ont";
            default -> "";
        };
    }

    public static String konjugiereSavoir(String pronomen) {
        return switch (pronomen) {
            case "je" -> "sais";
            case "tu" -> "sais";
            case "il/elle/on" -> "sait";
            case "nous" -> "savons";
            case "vous" -> "savez";
            case "ils/elles" -> "savent";
            default -> "";
        };
    }

    public static String konjugierePrendre(String pronomen) {
        return switch (pronomen) {
            case "je" -> "prends";
            case "tu" -> "prends";
            case "il/elle/on" -> "prend";
            case "nous" -> "prenons";
            case "vous" -> "prenez";
            case "ils/elles" -> "prennent";
            default -> "";
        };
    }

    public static String konjugiereMettre(String pronomen) {
        return switch (pronomen) {
            case "je" -> "mets";
            case "tu" -> "mets";
            case "il/elle/on" -> "met";
            case "nous" -> "mettons";
            case "vous" -> "mettez";
            case "ils/elles" -> "mettent";
            default -> "";
        };
    }

}
