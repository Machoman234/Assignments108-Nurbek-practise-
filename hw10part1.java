import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class hw10part1 {
    public static void main(String[] args) throws IOException {
        File file=new File("alphabet.txt");
        System.out.println("Text file is passed:");


        Scanner in=new Scanner(file);

        ArrayList<String> arr=new ArrayList<>();
        while (in.hasNext()){
            arr.add(in.next());
        }
        String[] ars=new String[arr.size()];
        for(int i=0;i< arr.size();i++){
            ars[i]=arr.get(i);
        }
        Sort(ars);
        in.close();
        for (int i=0;i<ars.length;i++){
        System.out.print(ars[i]+" ");}
    }
    private static void Sort(String[] a) {
        String temp;
        for (int i=0;i<a.length;i++){
            for (int j=1;j< a.length;j++){
                String as= String.valueOf(a[j-1].charAt(0));
                String ass=String.valueOf(a[j].charAt(0));
                if(as.compareToIgnoreCase(ass)>0){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;

                }
            }
        }

    }
}
