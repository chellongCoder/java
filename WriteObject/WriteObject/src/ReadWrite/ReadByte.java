/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWrite;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Scanner;

/**
 *
 * @author Nguyen Thai Son
 */
public class ReadByte {

    public static void main(String[] args) {
        int a=10;
        try {
            //Scanner s = new Scanner(System.in);
//            InputStreamReader isr = new InputStreamReader(System.in);
//            BufferedReader br = new BufferedReader(isr);
//
//            String hoten = "";
//            int tuoi = 0;
//
//            System.out.println("Input Name:");
//            
//            hoten = br.readLine();
//            System.out.println("Input age:");
//            tuoi=Integer.parseInt(br.readLine());
//            
//            System.out.println("name:"+hoten);
//            System.out.println("age:"+tuoi);
            //InputStreamReader inputStreamReader= new InputStreamReader(new File(""));
//            FileInputStream fis = new FileInputStream("test.txt");
//            BufferedInputStream br = new BufferedInputStream(fis);
//            int c;
//            while((c=br.read())>0){
//                System.out.print(c+" ");
//            }
            
            //File file = new File("te1.txt");
            //File file = new File("abc.xyz");
            //file.createNewFile();
            //file.mkdir();
            //doc file
//            File f = new File("te1.txt");
//            FileReader fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            String line;
//            int i=1;
//            while((line=br.readLine())!=null){
//                System.out.println(i+++":"+line);
//            }
            //gi file
//            File file = new File("te2.txt");
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            for (int j = 0; j < 9; j++) {
//                String arg = "";
//                if(j==0)
//                    arg="Phan Quan";
//                else if(j==1)
//                    arg="Phan Hai";
//                else if(j==2)
//                    arg="Luong Bong";
//                else if(j==3)
//                    arg="Hung Ca Ro";
//                else if(j==4)
//                    arg="The Chot";
//                else
//                    arg="Tuc Anh Ach";                
//                bw.write(arg);
//                bw.write("\n");
//            }
//            bw.close();
            //copy file
            //doc file
            File f = new File("te1.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            File file = new File("te2.txt");
            FileWriter fw = new FileWriter(file);
            //BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(file);
            String line;
            while((line=br.readLine())!=null){
                //bw.write(line+"\n");
                pw.println(line);
            }
            br.close();
            //bw.close();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
