import java.io.BufferedReader;
import java.io.FileReader;

public class CSVfilereader {
    public static void main(String[] args) {
        int ageSum = 0;
        try{
        BufferedReader br=new BufferedReader(new FileReader("sample.csv"));
        String line;
        br.readLine();
        while ((line=br.readLine())!=null) {
        //    System.out.println(line);
        String[] data = line.split(",");
        ageSum += Integer.parseInt(data[1]);
            
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    System.out.println(ageSum); 
    }
}