package java1702.javase.basic.collection;
/**
 * Created by lixuanyu
 * on 2017/3/29.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        //buffer 缓冲
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.toString());
        String s = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(s);
        String s1 = stringBuffer1.toString();
        System.out.println(stringBuffer.append(true).append(123));
        System.out.println(stringBuffer.delete(4,6));
        System.out.println(stringBuffer.insert(4,false));//insert 插入
        System.out.println(stringBuffer.reverse());//左右颠倒顺序输出
        stringBuffer.setCharAt(0,'a');
        System.out.println(stringBuffer);
        String s2 = "abcdefg";
        String[] strings = s2.split("\\s");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static String reverse(String origin) {
        String s = "abcdefg";
        String[] strings = s.split("\\s");
        System.out.println(s);

        return "";
    }
}
