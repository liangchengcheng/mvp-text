package presenter;

import bean.UserBean;
import impl.UserModel;
import view.IUserView;
import model.IUserModel;

public class UserPresenter {

	private IUserView mUserView;
	private IUserModel mUserModel;

	public UserPresenter(IUserView view) {
		mUserView = view;
		mUserModel = new UserModel();
	}
	// 通过调用IUserModel的方法来保存数据
	public void saveUser(int id, String firstName, String lastName) {
		mUserModel.setID(id);
		mUserModel.setFirstName(firstName);
		mUserModel.setLastName(lastName);
	}
	// 通过调用IUserView的方法来更新显示
	public void loadUser(int id) {
		UserBean user = mUserModel.load(id);
		mUserView.setFirstName(user.getFirstName());
		mUserView.setLastName(user.getLastName());
	}
}
