package string;

/**
 *String toLowerCass()
 * 将当前字符串中的英文部分转换为全小写
 *
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全大写
 */
public class ToUpperCassDemo {
    public static void main(String[] args) {
        String str = "我爱java";
        System.out.println(str);

        String upper = str.toUpperCase();
        System.out.println(upper);


        String lower = str.toLowerCase();
        System.out.println(lower);


    }

}
