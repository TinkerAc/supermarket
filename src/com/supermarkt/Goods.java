package com.supermarkt;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Goods {
    private int id;  //��ƷID
    private String name; //��Ʒ��
    private double price;  //��Ʒ�۸�
    private int stock;  //��Ʒ���
    private Date production_date;  //��������
	private String shelf_life;  //������
	private String factory;   //��������
	private static Connection conn=null; //�������ݿ����Ӷ���
	
	//�������ݿ�����
	
	private static Connection getConn(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		conn = DriverManager.getConnection(
     				"jdbc:mysql://127.0.0.1:3306/supermarkt?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return conn;
    }
	
	
	
	//get()�Լ�set()����
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getProduction_date() {
		return production_date;
	}
	public void setProduction_date(Date production_date) {
		this.production_date = production_date;
	}
	public String getShelf_life() {
		return shelf_life;
	}
	public void setShelf_life(String shelf_life) {
		this.shelf_life = shelf_life;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
}
