package JavaTest.a;

import JavaTest.a.util.StringUtil;

import java.io.File;
import java.io.IOException;

public class BqyDemo {
    public static void main(String[] args) {
        String dontSubMe = "别截取我求你了！";
        String dontSplitMe = "别把我拆开，ok？";
        String bigOrSmall = "bIg oR SmaLl";
        String dontReplace = "别给我替换字符！";

        StringUtil stringUtil = new StringUtil();
        //字符串截取
        String subString = stringUtil.SubString(dontSubMe,1,dontSubMe.length()-1);
        System.out.println(subString);
        //字符串分割
        String Split1[] = stringUtil.Split(dontSplitMe,"别");
        String Split2[] = stringUtil.Split(Split1[Split1.length-1],"，");
        for(int i = 0;i < Split1.length;i ++){
            System.out.println(Split1[i]);
        }
        for(int i = 0;i <= Split2.length-1;i ++){
            System.out.println(Split2[i]);
        }
        //大小写转换
        String bigOne = stringUtil.ToUpperCase(bigOrSmall);
        System.out.println(bigOne);
        String smallOne = stringUtil.ToLowerCase(bigOrSmall);
        System.out.println(smallOne);
        //字符替换
        dontReplace = stringUtil.Replace(dontReplace,"别","请");
        System.out.println(dontReplace);
        //字节输出
        StringBuffer fkZhongjie = new StringBuffer();
        fkZhongjie.append("老子的空调扇呢？"+"\t");
        fkZhongjie.append("今天才下单，还没发货呢。\t");
        fkZhongjie.append("老子给你吗一刀！");
        File f = new File("d" + File.separator + "IOTestBqy");
        f.mkdir();
        String path1 = "d:"+File.separator+"IOTestBqy"+File.separator+"bqy.txt";
        File f2 = new File(path1);
        if(f2.exists()){
            f2.delete();
        }else try{
            f2.createNewFile();
            System.out.println("bqy创建成功!");
        }catch (IOException e){
            e.printStackTrace();
        }
        String outPutFile = "d:" + File.separator + "IOTestBqy" + File.separator + "bqy.txt";
        try{
            stringUtil.OutputStreamNext(outPutFile,fkZhongjie);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
