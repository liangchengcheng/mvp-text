package model;

import bean.UserBean;
import android.R.integer;

public interface IUserModel {
	//����ֵ�� ��ȡ�ľ�ͨ��load ���в���
	void setID(int id);
	
	int getID();

	void setFirstName(String firstName);

	void setLastName(String lastName);

	UserBean load(int id);// ͨ��id��ȡuser��Ϣ,����һ��UserBean

}
