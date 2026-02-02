package strings;

public class RemoveWordFromString {

    public static void main(String[] args) {
        String str="bdaappledfeappleve";
        String word="apple";
        System.out.println("Word removed: "+removeWord(str,word));
    }

    static String removeWord(String str, String word){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(word)){
            return removeWord(str.substring(word.length()),word);
        }
        else{
            return str.charAt(0) + removeWord(str.substring(1),word);
        }
    }

}


