package com.bobo.common.utils;


import java.util.GregorianCalendar;
import java.util.Random;

public class UserUtils {

    //随机生成名字
    public static String getName(){
        String name = "";
//        System.out.println(c);
        for (int i = 0; i <3 ; i++) {
            char c = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
            name+=c;
        }
        return name;
    }
    //随机生成性别
    public static String getSex(){
        Random r = new Random();
        int i = r.nextInt(2);
        if(i==0){
            return "��?";
        }else{
            return "Ů?";
        }

    }

    //随机生成生日
    public static String getBirthday(int start,int end){
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(start, end);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
    //随机生成邮箱
    public static String getMail(){
        String [] last = {"@qq.com", "@gmail.com", "@163.com", "@sina.com", "@hotmail.com", "@sohu.com"};
        StringBuffer sb = new StringBuffer();
        // 3~20长度，包�?3�?20
        int length = 3 + (int) (Math.random() * 9);
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char) randomChar();
        }
        sb.append(word);
        Random r = new Random();
        final int j = r.nextInt(6);
        sb.append(last[j]);
        return sb.toString();
    }
    private static byte randomChar() {
        // 0<= Math.random()< 1
        int flag = (int) (Math.random() * 2);// 0小写字母1大写字母
        byte resultBt;
        if (flag == 0) {
            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
            resultBt = (byte) (65 + bt);
        } else {
            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
            resultBt = (byte) (97 + bt);
        }
        return resultBt;
    }

    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }
    //随机生成电话号码133�?�?
    private static String[] telFirst = "133".split(",");
    public static String getPhone(){
        int index=getNum(0,telFirst.length-1);
        String first=telFirst[index];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String thrid=String.valueOf(getNum(1,9100)+10000).substring(1);
        return first+second+thrid;

    }
   
}
