


public class Person
{
	//public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };

	
	string strFirstName;
	string strLastName;
	string strAddressStreet;
	string strAddressCity;
	string strAddressZip;
	string strAddressState;
	string strPhoneNum;
	Time strStartWork;
	Time strLeaveWork;
	string strVehicleType;
	int intMaxPassengers;
	bool bolWillDrive;
	list<bool> listBolDriveDays;
	Group grpArriveWith;
	Group grpDepartWith;
	
	//default constructor
	public Person()
	{
		strFirstName = "";
		strLastName = "";
		strAddressStreet = "";
		string strAddressCity = "";
		string strAddressZip = "";
		string strAddressState = "";
		strPhoneNum = "";
		strStartWork = new Time(0,0,0);
		strLeaveWork = new Time(0,0,0);
		strVehicleType = "";
		intMaxPassengers = 0;
		bolWillDrive = false;
		listBolDriveDays = {0, 0, 0, 0, 0, 0, 0};
		grpArriveWith = new Group();
		grpDepartWith = new Group();
	}
	
	//constructor for users not willing or able to drive.
	public Person(string strFirstName, string strLastName, string strAddressStreet,
					string strAddressCity, string strAddressZip, string strAddressState, 
					string strPhoneNum, Time strStartWork, Time strLeaveWork, 
					string strVehicleType, int intMaxPassengers)
	{
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strAddressStreet = strAddressStreet;
		this.strAddressCity = strAddressCity;
		this.strAddressZip = strAddressZip;
		this.strAddressState = strAddressState;
		this.strPhoneNum = strPhoneNum;
		this.strStartWork = strStartWork;
		this.strLeaveWork = strLeaveWork;
		this.strVehicleType = strVehicleType;
		this.intMaxPassengers = intMaxPassengers;
		bolWillDrive = false;
		listBolDriveDays = {0, 0, 0, 0, 0, 0, 0};
		grpArriveWith = new Group();
		grpDepartWith = new Group();
	}
	
	//constructor for user willing and able to drive
	public Person(string strFirstName, string strLastName, string strAddressStreet,
					string strAddressCity, string strAddressZip, string strAddressState, 
					string strPhoneNum, Time strStartWork, Time strLeaveWork, 
					string strVehicleType, int intMaxPassengers, bool bolWillDrive,
					list listBolDriveDays)
	{
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strAddressStreet = strAddressStreet;
		this.strAddressCity = strAddressCity;
		this.strAddressZip = strAddressZip;
		this.strAddressState = strAddressState;
		this.strPhoneNum = strPhoneNum;
		this.strStartWork = strStartWork;
		this.strLeaveWork = strLeaveWork;
		this.strVehicleType = strVehicleType;
		this.intMaxPassengers = intMaxPassengers;
		bolWillDrive = true;
		for(i = 0 -> 7)
			this.listBolDriveDays[i] = listBolDriveDays[i];
	}
	
	public void editProfile(string strFirstName, string strLastName, string strAddressStreet, string strPhoneNum, 
					Time strStartWork, Time strLeaveWork, string strVehicleType,
					int intMaxPassengers, bool bolWillDrive array<bool> listBolDriveDays)
	{
		Person(strFirstName, strLastName, strAddressStreet, strPhoneNum, strStartWork, strLeaveWork, strVehicleType, intMaxPassengers, listBolDriveDays);
		this.bolWillDrive = bolWillDrive;
	}
	
	public bool doesDrive()
	{
		return bolWillDrive;
	}
	
	public bool doesDrive(int day)
	{
		if(listBolDriveDays[day] == 1)
			return true;
		else
			return false;
	}
	
	public void joinArrivalGroup(Group group)
	{
		this.grpArriveWith = group;
	}
	
	public void joinDepartGroup(Group group)
	{
		this.grpDepartWith = group;
	}
	
	public void leaveArrivalGroup(Group group)
	{
		this.grpArriveWith = "";
	}
	
	public void leaveDepartGroup(Group group)
	{
		this.grpDepartWith = "";
	}
	
	
	
}