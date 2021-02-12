public class Task1_4{
    String i = "mayu";
    String x = "memo";
    
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS ="パスワード誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    public static void main(String[] args){
        
        String name = "alice";
        String pass = "pass";
        
        if (name.equals("alice") && pass.equals("pass")){
        System.out.println("ログイン成功です");
        
        
        } else if (name.equals("alice")){
        System.out.println("パスワードに誤りがあります");

        } else if (pass.equals("pass")){
        System.out.println("名前に誤りがあります。");

        } else{
        System.out.println("入力情報に誤りがあります。");
        }

    }

}