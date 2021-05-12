package at.dbo.cc.strings;

public class test {

    public static void main(String[] args){

        String wort = "katze";
        char[] wortAlsChar = wort.toCharArray();
        System.out.println(wortAlsChar);

        char c = 'a';

        boolean[] wortSuche = new boolean[wortAlsChar.length];

        for (int i = 0; i < wortSuche.length; i++) {
            if (c == wortAlsChar[i]){
                System.out.print(c);
            } else{
                System.out.print('*');
            }
        }


    }
}
