package decorator.java;

import java.io.*;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        InputStream is = new UpperCaseInputStream(new BufferedInputStream(
                new FileInputStream("E:\\idea\\IdeaProjects\\design-mode\\src\\decorator\\java\\InputTest.java")));
        while((c = is.read()) >= 0) {
            System.out.print((char) c);
        }
    }

}
