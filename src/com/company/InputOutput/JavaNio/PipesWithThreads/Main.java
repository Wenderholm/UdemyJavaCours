package com.company.InputOutput.JavaNio.PipesWithThreads;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;

public class Main {
    public static void main(String[] args) {
    try{
        Pipe pipe = Pipe.open();
        Runnable writer = new Runnable() {
            @Override
            public void run() {
                try{
                    Pipe.SinkChannel sinkChannel = pipe.sink();
                    ByteBuffer buffer = ByteBuffer.allocate(56);

                    for (int i = 0; i < 10 ; i++) {
                        String currentTime = "The time is: " + System.currentTimeMillis();

                        buffer.put(currentTime.getBytes());
                        buffer.flip();

                        while (buffer.hasRemaining()){
                            sinkChannel.write(buffer);
                        }
                        buffer.flip();
                        Thread.sleep(100);
                    }
                }catch (Exception e ){
                    e.printStackTrace();
                }
            }
        };

        Runnable reader = new Runnable() {
            @Override
            public void run() {
                try{
                    Pipe.SourceChannel sourceChannel = pipe.source();
                    ByteBuffer buffer = ByteBuffer.allocate(56);

                    for (int i = 0; i < 10; i++) {
                        int bytesRead = sourceChannel.read(buffer);
                        byte[] timeString = new byte[bytesRead];
                        buffer.flip();
                        buffer.get(timeString);
                        System.out.println("Reader Thread: " + new String(timeString));
                        buffer.flip();
                        Thread.sleep(100);
                    }
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        new Thread(writer).start();
        new Thread(reader).start();

    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
//        try (FileOutputStream binFile= new FileOutputStream("data2.dat");
//             FileChannel binChannel = binFile.getChannel()){
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            long int1Pos = outputBytes.length;
//            buffer.putInt(245);
//            long int2Pos = int1Pos + Integer.BYTES;
//            buffer.putInt(-98732);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
//            buffer.putInt(1000);
//            buffer.flip();
//
//
//            binChannel.write(buffer);
//            RandomAccessFile ra = new RandomAccessFile("data2.dat","rwd");
//            FileChannel channel = ra.getChannel();
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//            channel.position(int3Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//
//            System.out.println("int3 = " + readBuffer.getInt());
//            readBuffer.flip();
//            channel.position(int2Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//
//            System.out.println("int2 = " + readBuffer.getInt());
//            readBuffer.flip();
//            channel.position(int1Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//
//            System.out.println("int1 = " + readBuffer.getInt());
//
////            kopiowanie kanału
//            RandomAccessFile copyFile = new RandomAccessFile("datacopyt.dat", "rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            channel.position(0);
////            kopiowanie z kanału
////            long numTransferred = copyChannel.transferFrom(channel, 0 ,channel.size());
//
////            kopiowanie aktualnego kanału do innego
//            long numTransferred = channel.transferTo(0,channel.size(),copyChannel);
//
//            System.out.println("Num transferred = " + numTransferred);
//
//            channel.close();
//            ra.close();
//            copyChannel.close();
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}

