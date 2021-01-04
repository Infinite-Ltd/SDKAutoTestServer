package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class FileUtils {

    private final static Logger logger = LoggerFactory.getLogger(FileUtils.class);


    public static void copyFileTo(InputStream from, String path) {
        byte[] data = new byte[1024];
        int left = 0;
        OutputStream out = null;

        try {
            out = new FileOutputStream(new File(path));
            while ((left = from.read(data)) != -1) {
                out.write(data,0, left);
            }
            from.close();
            out.close();
            logger.info("copy file to ["+path+"] success! ");
        } catch (IOException e) {
            logger.error("copy file to ["+path+"] fail! ");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            copyFileTo(new FileInputStream(new File("src/main/1")), "2");



            String a = "D:\\Git\\oldfi\\sdkautotestserver\\lib\\sdk-release.aar";
            System.out.println(a.split("lib")[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
