package com.njxxyizhifei.javase.day10.test009;

public class ChineseTest {
public static void main(String[] args) {
	
	//创建中国人对象1
	Chinese zhangsan = new Chinese("1","zhangsan");
	System.out.println(zhangsan.id +","+zhangsan.name +","+Chinese.country);

    Chinese Lisi = new Chinese("2","Lisi");
    System.out.println(Lisi.id +","+Lisi.name +","+Chinese.country);
	
    System.out.println(Chinese.country);
    System.out.println(zhangsan.country);
    zhangsan = null;
    System.out.println(zhangsan.country);//可以访问，说明跟对象没有关系，会收到警告
}
}
