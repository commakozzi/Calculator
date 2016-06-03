import java.util.ArrayList;
import java.util.Arrays;

public class RegExp {

    // Set up utilities:
    Calculator calculator = new Calculator();

    public void splitExp(String theexp){

        ArrayList<String> tokens = new ArrayList<>();
        String expression = theexp.replaceAll("\\s+", "");
        String tem[] = expression.split("(?<=[-+*/%(),])(?=.)|(?<=.)(?=[-+*/%(),])");
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(tem));
        String orig = null;
        String regex = "[-+/%*]+";
        String first = temp.get(0);
        tokens.add(first);
        String second = temp.get(1);
        if(first.equals("-")){
            tokens.remove(0);
            tokens.add(first+second);
        }
        for (int i = 0; i < temp.size(); i++) {
            String a = temp.get(i);
            if (i >= 1){
                String b = temp.get(i-1);
                if(b.matches(regex) && a.matches("[-+]+")){
                    String c = temp.get(i-2);
                    if(c.matches("[-+]+")){
                        break;
                    }else{
                        orig = a;
                    }
                }else if(orig != null && orig.equals("-")){
                    tokens.add(orig + a);
                    orig = null;
                }else{
                    tokens.add(a);
                }
            }
        }
        if(first.equals("+")){
            tokens.remove(0);
        }
        if(first.equals("-")){
            tokens.remove(1);
        }
        String[]tokenArray = new String[tokens.size()];
        tokenArray = tokens.toArray(tokenArray);
        System.out.println(tokens);
        calculator.calculate(tokenArray);
    } // End splitExp()

}
