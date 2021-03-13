package io流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteDemo {
    public static void main(String[] args) throws IOException {
        Writer writer=new FileWriter("D:/abc/2.txt");
        //writer.write("好");
        char [] chs={'黑','马'};
        writer.write(chs,0,2);
        writer.write("好好学习");
        writer.close();
    }
}
