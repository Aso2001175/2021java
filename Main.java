public class Main{
    public static void main(String[] args){
        System.out.println("戦艦ゲーム");
        int [][] senkan = new int[5][5];
        for(int i=0;i<senkan.length;i++){
            for(int j=0;j<senkan.length;j++){
            senkan[i][j]=0;
            }
        }
        Random rnd = new Random();

        int value = rnd.nextInt(5);

        System.out.println(value);
    }
}