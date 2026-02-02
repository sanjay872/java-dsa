package strings;

public class RemoveCharacterAFromString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String str="acbagtaioa";
        removeA(str,0,sb);
        System.out.println("Removed String with sb in argument: "+sb);
        System.out.println("Removed String without sb in argument: "+removeAWithoutSB(str,0));
    }

    static void removeA(String str, int index, StringBuilder sb){
        if(index==str.length()){
            return;
        }

        char ch=str.charAt(index);

        if(ch!='a'){
            sb.append(ch);
        }

        removeA(str,index+1,sb);
    }

    static String removeAWithoutSB(String str, int index){
        if(index==str.length()){
            return "";
        }

        char ch=str.charAt(index);

        String res=removeAWithoutSB(str,index+1);

        if(ch!='a'){
            return ch+res;
        }
        return res;
    }
}
