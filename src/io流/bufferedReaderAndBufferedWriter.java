package io流;

import java.io.*;

public class bufferedReaderAndBufferedWriter
{
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:/abc/2.txt");
        BufferedReader br=new BufferedReader(fr);


        FileWriter wr=new FileWriter("D:/abc/1.txt");
        BufferedWriter we=new BufferedWriter(wr);
        int len;
        while((len=br.read())!=-1)
        {
            we.write(len);
        }
        br.close();
    we.close();}
}
