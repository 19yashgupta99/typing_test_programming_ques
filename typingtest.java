import java.util.Scanner;

public class typingtest {
    public static String callme(String operationString,int position,String result,int input3,String prevResult){
        if(position >= operationString.length()){
            return (result);
        }
        else {
            switch (operationString.charAt(position)){
                case 'w':{
                    prevResult = result;
                    result = callme(operationString,position+1,result,input3,prevResult);
                    break;
                }
                case 'd':{
                    prevResult = result;
                    result = result.substring(0,result.length() - input3);
                    result = callme(operationString , position+1,result,input3,prevResult);
                    break;
                }
                case 'u':{
                    result = callme(operationString,position+1,prevResult,input3,result);
                    break;
                }
                default:{
                    result = result + operationString.charAt(position);
                    result = callme(operationString,position+1,result,input3,prevResult);
                }
            }
        }
        return result;
    }
    public static void main(String k[]){
        Scanner ob = new Scanner(System.in);
        String input1 = ob.nextLine();
        String input2 = ob.nextLine();
        int input3 = ob.nextInt();
        String result = callme(input2,0,input1,input3,"");
        System.out.println(result);
    }
}
