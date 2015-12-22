package view;

public interface IUserView {

	//view的时候只是控制了  设置和读取的
	int getID();

	String getFristName();

	String getLastName();

	void setFirstName(String firstName);

	void setLastName(String lastName);
	
}
