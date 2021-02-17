/**
 * バブルソート
 *  チェックテスト-Java1章
 *
 */
 public class Check{
     public static void main(String[] args){
         /*
         * 問１
         * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
         */
        int[] data = {3,1,2,7,5};
         /*
         * 問２
         * 以下のfor文を完成させなさい
         */
         for(int i = 0; i < data.length ; i++){
             System.out.print(data[i]+" ");
         }
         System.out.println();

        //最後の要素を除いて全ての要素をならびかえます
         for(int i = 0 ; i < data.length ; i++){

             //下から上に順番に並び替えます
             for(int j = 4 ; j > i ; j--){
                /*
                * 問３
                *以下、配列の添字を入れてソートを完成させなさい
                *上の方が大きい時は互いに入れ替えます
                */
                if(data[i] > data[i + 1]){
                    int box = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = box;
                }
            }
        }
         for(int i = 0 ; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
 }