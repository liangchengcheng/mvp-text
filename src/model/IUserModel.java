package model;

import bean.UserBean;
import android.R.integer;

public interface IUserModel {
	//设置值， 读取的就通过load 进行操作
	void setID(int id);
	
	int getID();

	void setFirstName(String firstName);

	void setLastName(String lastName);

	UserBean load(int id);// 通过id读取user信息,返回一个UserBean

}
