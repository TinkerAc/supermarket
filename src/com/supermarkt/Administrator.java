package com.supermarkt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Administrator{
	
	private int NetId;  //�û���ID
    private String name; //�û���
    private String mypassword; //�û�����
    private String sex; //�û��Ա�
    private String phone; //�û��绰
    private String address; //�û�סַ
    private Connection conn=null; //�������ݿ����Ӷ���
    
    //���ӵ����ݿ�
    
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
		this.NetId=netId;
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
    
	//���ӹ���Ա
	
	public void addAdministrator() {
		try {
			this.getConn();
			
			Statement sta = conn.createStatement();
			sta.execute("insert into administrators(id,user,password,sex,phone,adress) values(null,'"
			+this.name+"','"+this.mypassword+"','"+this.sex+"','"+this.phone+"','"+this.address+"')");
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//������Ʒ
	public void addGoodsInformation() {
		try {
			this.getConn();
			Statement sta = conn.createStatement();
		  //  String sql=;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�޸���Ʒ��Ϣ
	public void updateGoodsInformation() {
		
	}
	
	//ɾ������Ա
	public void deleteAdministrators() {
		
	}
	
	//�޸Ĺ���Ա��Ϣ
	public void updateAdministratorsInformation() {
		
	}
	
	//ɾ����Ʒ��Ϣ
	public void deleteGoodsInformation() {
		
	}
	
	//���������Ϣ
	public void LookUpGoodsInformation() {
		
	}
	
	//����˿���Ϣ
	public void LookUpCustomInformation() {
		
	}
	
}
