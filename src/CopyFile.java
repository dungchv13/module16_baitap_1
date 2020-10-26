import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(File input,File output) throws IOException {
        if(!input.exists() || !output.exists()){
            throw new FileNotFoundException();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        StringBuilder result = new StringBuilder();
        int num = 0;
        BufferedReader br = new BufferedReader(new FileReader(input));
        String line = "";

        while((line = br.readLine())!=null){
            result.append(line).append("\n");
            num += line.length();
        }
        br.close();
        bw.write(result.toString());
        bw.close();
        System.out.println("so ky tu trong tep la: "+num);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file input: ");
        Scanner scanner = new Scanner(System.in);

        File input = new File(scanner.nextLine());

        System.out.println("Nhập đường dẫn file output: ");

        File output = new File(scanner.nextLine());

        copyFile(input,output);
    }
}
