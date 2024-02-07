package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * asdsee
 * @author 0423
 *
 */
public class FileCopyPractice {
    public static void main(String[] args) {
    	
    	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        BufferedReader br = null;
        PrintWriter pw = null;
        if(args.length != 2) {
            System.out.println("2つのファイル名を正しく指定してください");
            return;
        }
        try {
            // コピー元ファイル名のオープン〇
            
            br = new BufferedReader(new FileReader(args[0]));
            // コピー先ファイル名のオープン
            pw = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
            String str;
            // コピー元ファイルから1行分の文字列を取得
            while((str = br.readLine()) != null) {
                // 取得した文字列をコピー先ファイルに書き込み
                pw.println(str);
            }
        } catch(FileNotFoundException e) {
            System.out.println("ファイル名の指定が不正です");
        } catch(IOException e) {
            System.out.println("入出力エラーです");
        } finally {
            try {
                if(br != null) {
                    br.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
            // PrintWriterのcloseメソッドはIOException例外を送出しないため
            if(pw != null) {
                pw.close();
            }
        }
    }
}
