package impl;

import bean.UserBean;
import model.IUserModel;

public class UserModel  implements IUserModel{

	@Override
	public void setID(int id) {
		// �洢id
	}

	@Override
	public void setFirstName(String firstName) {
		// �洢firstName
	}

	@Override
	public void setLastName(String lastName) {
		// �洢lastName
	}

	@Override
	public int getID() {
		// ��ȡid
		return 0;
	}

	@Override
	public UserBean load(int id) {
		// �����ݿ����������ȡid��userbean
		return new UserBean("11", "22");
	}
}
