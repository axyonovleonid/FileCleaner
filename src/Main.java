import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        String filename = args[0] + " ";
//        for (int i = 1; i < args.length - 1; i++) {
//            filename = filename + args[i] + " ";
//        }
//        filename = filename + args[args.length-1];
        Scanner in2 = new Scanner(System.in);
        String fname = in2.nextLine();

        while (!fname.equals("exit")) {
            fname = in2.nextLine();
            if(fname.length() > 0) {
                List<String> list = new ArrayList<>();
                Scanner in = new Scanner(new File(fname));
                while (in.hasNextLine()) {
                    list.add(in.nextLine());
                }

                FileWriter fw = new FileWriter("cleaned" + fname);

                for (String line : list) {
                    if (line.length() > 3 && line.charAt(0) != '0' && line.charAt(1) != '0')
                        fw.write(line + "\n");
                }
                fw.flush();
            }
        }
    }
}
