package com.company.InputOutput.JavaNio.putMethod;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream binFile= new FileOutputStream("data2.dat");
             FileChannel binChannel = binFile.getChannel()){
            ByteBuffer buffer = ByteBuffer.allocate(100);
//  PUT jednoliniowy łańcuchowy (chained put method)
            byte[] outputBytes = "Hello World!".getBytes();
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes).putInt(245).putInt(-98732).put(outputBytes2).putInt(1000);
            buffer.flip();

//            PUT rozłożony na kilka linii
//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            buffer.putInt(245);
//            buffer.putInt(-98732);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            buffer.putInt(1000);
//            buffer.flip();


            binChannel.write(buffer);
            RandomAccessFile ra = new RandomAccessFile("data2.dat","rwd");
            FileChannel channel = ra.getChannel();
            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);
//            flip() przełacznik pomiędzy czynnosciami wczytywanie i zapisywanie
            readBuffer.flip();
            byte[] inputString = new byte[outputBytes.length];
            readBuffer.get(inputString);
            System.out.println("inputString = " + new String(inputString));
            System.out.println("int1 = " + readBuffer.getInt());
            System.out.println("int2 = " + readBuffer.getInt());
            byte[] inputString2 = new byte[outputBytes2.length];
            readBuffer.get(inputString2);
            System.out.println("inputString2 = " + new String(inputString2));
            System.out.println("int3 = " + readBuffer.getInt());


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
