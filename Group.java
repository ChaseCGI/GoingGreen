


public void Group
{
	Date dateCarpoolDate;
	list listPerMembers<Person>;
	Person perDriver;
	string strAddressStreet;
	string strAddressCity;
	string strAddressState;
	string strAddressZip;
	Time timeDepartWork;
	Time timeDepartMeeting;

	public Group(Person perDriver, string strAddressStreet, string strAddressCity,
					string strAddressState, string strAddressZip, Time timeDepartMeeting,
					Time timeDepartWork, Date dateCarpoolDate)
	{
		this.perDriver = perDriver;
		this.strAddressStreet = strAddressStreet;
		this.strAddressCity = strAddressCity;
		this.strAddressState = strAddressState;
		this.strAddressZip = strAddressZip;
		this.timeDepartMeeting = timeDepartMeeting;
		this.timeDepartWork = timeDepartWork;
		this.dateCarpoolDate = dateCarpoolDate;
		listPerMembers.add(perDriver);
	}
	
	public void addMember(Person member)
	{
		listPerMembers.add(member);
	}
	
	public void removeMember(Person member)
	{
		listPerMembers.remove(member);
	}
	
	public void notifiyDriver()
	{
		int mNotificationId = 001;
		NotificationManager mNotifyMgr = 
				(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		mNotifyMgr.notify(mNotificationId, mBuilder.build());
	}
}