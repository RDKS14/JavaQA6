package maps;

public class Runner {

    public static void main(String[] args) {
        String text = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";
        MorseTranslator translate = new MorseTranslator();
        System.out.println(translate.translator(text));

    }


}
