package com.njxxyizhifei.javase.day10.test004;
/**
 * "this."ʲôʱ����ʡ�ԣ�
 * �������־ֲ�������ʵ��������ʱ����ʡ
 */
public class User {
   
	//����
	private int id;//ʵ������
    private String name;
   
    //���캯��
    public User(){
    	
    }
    /*
     ��ǰ��д����
      public User(int a,String b){
    	id = a;
    	name = b;
    }
     */
    //UserTest��������ôд
    public User(int id,String name){
    	this.id = id;
    	this.name = name;
    }
  //���³����id��ʵ�������޹أ����ܲ������ַ�ʽ
    //Setter and getter;
    /*
    public void setId(int a){
    	id = a;
    }
    */
  
    //���³����id��ʵ�������޹أ����ܲ������ַ�ʽ
    /*
    public void setId(int id){
    	id = id;
    }
    */
    
    public int getId(){
    	return id;
    }
    public String getName(){
    	return name;
    }
    
    public void setId(int id){
      this.id = id;
    }
      //�Ⱥź����id�Ǿֲ�����id
      //�Ⱥ�ǰ�ߵ�this.id��ʵ��������id
    public void setName(String name){
    	this.name = name;
    }
}