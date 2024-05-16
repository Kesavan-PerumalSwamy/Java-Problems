package Arrays;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<ArrayList<Integer>>  Arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arr.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            int m=3;
            for(int j = 0; j<m; j++) {
                Arr.get(i).add(input.nextInt());
            }
        }
        System.out.println(Arr);

    }
}



