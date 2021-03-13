package io流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDemo {

    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("D:/abc/2.txt" );
        /*int ch1=reader.read();
        System.out.println(ch1);
        reader.close();


         */
int ch;
        while((ch=reader.read())!=-1){

            System.out.println(ch);

        }


    }
}
