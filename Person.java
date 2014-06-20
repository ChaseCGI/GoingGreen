


public class Person
{
	//public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };

	
	string strFName;
	string lName;
	string address;
	string phoneNo;
	Time startTime;
	Time leaveTime;
	string vehicleType;
	int maxPassengers;
	bool willDrive;
	array<bool> driveDays;
	Group arriveWith;
	Group departWith;
	
	//default constructor
	public Person()
	{
		fName = "";
		lName = "";
		address = '';
		phoneNo = "";
		startTime = new Time(0,0,0);
		leaveTime = new Time(0,0,0);
		vehicleType = "";
		maxPassengers = 0;
		willDrive = false;
		driveDays = {0, 0, 0, 0, 0, 0, 0};
		arriveWith = new Group();
		departWith = new Group();
	}
	
	//constructor for users not willing or able to drive.
	public Person(string fName, string lName, string address, string phoneNo, 
					Time startTime, Time leaveTime, string vehicleType,
					int maxPassengers)
	{
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.startTime = startTime;
		this.leaveTime = leaveTime;
		this.vehicleType = vehicleType;
		this.maxPassengers = maxPassengers;
		willDrive = false;
		driveDays = {0, 0, 0, 0, 0, 0, 0};
		arriveWith = new Group();
		departWith = new Group();
	}
	
	//constructor for user willing and able to drive
	public Person(string fName, string lName, string address, string phoneNo, 
					Time startTime, Time leaveTime, string vehicleType,
					int maxPassengers, array<bool> driveDays)
	{
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.startTime = startTime;
		this.leaveTime = leaveTime;
		this.vehicleType = vehicleType;
		this.maxPassengers = maxPassengers;
		willDrive = true;
		for(i = 0 -> 7)
			this.driveDays[i] = driveDays[i];
	}
	
	public void editProfile(string fName, string lName, string address, string phoneNo, 
					Time startTime, Time leaveTime, string vehicleType,
					int maxPassengers, bool willDrive array<bool> driveDays)
	{
		Person(fName, lName, address, phoneNo, startTime, leaveTime, vehicleType, maxPassengers, driveDays);
		this.willDrive = willDrive;
	}
	
	public bool doesDrive()
	{
		return willDrive;
	}
	
	public bool doesDrive(int day)
	{
		if(driveDays[day] == 1)
			return true;
		else
			return false;
	}
	
	public void joinGroup(Group group)
	{
		
	}
}