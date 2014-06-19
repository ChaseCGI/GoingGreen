


public class Person
{
	string fName;
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
	
	//constructor for 
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
}