package com.supermarkt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer{
	private int NetId;  //�û���ID
    private String name; //�û���
    private String mypassword; //�û�����
    private String sex; //�û��Ա�
    private String phone; //�û��绰
    private String address; //�û�סַ
    private String details;
    private Connection conn=null; //�������ݿ����Ӷ���
    
    //�������ݿ�����
    
    private Connection getConn(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		conn = DriverManager.getConnection(
     				"jdbc:mysql://127.0.0.1:3306/supermarkt", "root", "wuhahaha");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return conn;
    }

	public int getNetId() {
		return NetId;
	}

	public void setNetId(int netId) {
		NetId = netId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMypassword() {
		return mypassword;
	}

	public void setMypassword(String mypassword) {
		this.mypassword = mypassword;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	
	//���ӹ˿�
	
	public void addCustoms(){
		try {
			this.getConn();
			Statement sta = conn.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�˿�����Լ�����Ϣ
	public void LookUpOwnInformation() {
		
	}
	
	//�˿������Ʒ��Ϣ
	public void LookUpGoodsInformation() {
		
	}
	
}
