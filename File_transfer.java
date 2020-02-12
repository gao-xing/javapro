package com.neuedu.Test;

import java.io.*;

/**
 * Created by 13930 on 2020/2/12.
 */
public class File_transfer {
    public static void main(String[] args) {
        File file1 = new File("d:/Test.java");
        File file2 = new File("d:/a");
        if (!file2.exists()){
            file2.mkdir();
        }
        File file3 = new File("d:/a/"+file1.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];
        try {
            inputStream = new FileInputStream(file1);
            outputStream = new FileOutputStream(file3);
            int len = inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("finally");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
               if (outputStream!=null)
                   outputStream.close();
                if(inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
