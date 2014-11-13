package Entity;

import java.util.ArrayList;

public class Restaurant {

	private Menu mMenu;
	private ArrayList<Table> mTableList;
	private ArrayList<Staff> mStaffList;
	private ArrayList<Order> mOrderList;
	public Restaurant() {
		mMenu = new Menu();
		mTableList = new ArrayList<Table>();
		mStaffList = new ArrayList<Staff>();
		mOrderList = new ArrayList<Order>();
	}

	public Menu getMenu() {
		return mMenu;
	}

	public ArrayList<Table> getTableList() {
		return mTableList;
	}

	public void setTableList(ArrayList<Table> tableList) {
		mTableList = tableList;
	}

	public ArrayList<Staff> getStaffList() {
		return mStaffList;
	}

	public void setStaffList(ArrayList<Staff> staffList) {
		mStaffList = staffList;
	}
	
	public Table getTableById (int id){
		return mTableList.get(id);
	}
	
	public void addStaff(Staff staff){
		mStaffList.add(staff);
	}
	
	public ArrayList<Order> getOrderList() {
		return mOrderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		mOrderList = orderList;
	}
}
