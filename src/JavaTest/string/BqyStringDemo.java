package JavaTest.string;

public class BqyStringDemo {
    public static void main(String[] args) {
        /**
        *字符串的内容不可变
        */
        String str1 = "hello";//开辟空间存放 hello
        str1 = str1 + "world";//开辟两个空间分别存放 world   helloworld
        System.out.println("str1=" + str1);

        /**
         *String常用方法
         */
        /**
         *字符串连接 append
         */
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append("换锁师傅");
        stringBuffer1.append("太吵了").append("，").append("电钻声音太大了!");
        stringBuffer1.append("\n");
        stringBuffer1.append("当！当！当！").append("\n");
        stringBuffer1.append("咚！咚！咚！").append("\n");
        stringBuffer1.append("震耳欲聋").append("，").append("太要命了！");
        System.out.println(stringBuffer1);

        /*
        * 内容修改
        */
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("你说什么？");
        KongTiaoShan(stringBuffer2);
        System.out.println(stringBuffer2);
        /*
        * insert方法，任意位置添加内容
        */
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("今天吃的面条");
        stringBuffer3.insert(2,"中午");
        System.out.println(stringBuffer3);
        stringBuffer3.insert(stringBuffer3.length(),"还不错。");
        System.out.println(stringBuffer3);

        /*
        * 字符串反转 reverse
        */
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("级两");
        stringBuffer4.insert(0,"!转反");
        System.out.println(stringBuffer4.reverse());

        /*
        * 替换指定内容 replace
        */
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("门锁还没换？");
        stringBuffer5.replace(2,6,"换了！");
        System.out.println(stringBuffer5);

        /*
        * 字符串截取 substring
        */
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("三把钥匙给我，一把放在门外。");
        System.out.println(stringBuffer6.substring(7,stringBuffer6.length()));

        /*
        * 删除指定范围的字符串  delete
        */
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("今晚睡不睡在次卧");
        System.out.println(stringBuffer7.delete(2,4));

        /*
        * 查找指定内容是否存在
        */
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("手上扎了个刺");
        if (stringBuffer8.indexOf("刺",2) == -1){
            System.out.println("没刺");
        }else{
            System.out.println("有刺");
        }
    }

    public static void KongTiaoShan(StringBuffer stringBuffer) {
        stringBuffer.append("\n我说！").append("我要空调扇！");
    }
}
