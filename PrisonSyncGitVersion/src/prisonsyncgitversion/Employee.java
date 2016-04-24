package prisonsyncgitversion;

public class Employee{

	private String first;
	private String middle;
	private String last;
	private String address;
	private String dob;
	private String ssn;
	private String height;
	private String weight;
	private String desc;
	PrisonSyncGitVersion git = new PrisonSyncGitVersion();
	
	public Employee(){
		first = git.getTxtFirst_emp();
		middle = git.getTxtMidInit_emp();
		last = git.getTxtMidInit_emp();
		address = git.getTxtAddress_emp();
		dob = git.getTxtDOB_emp();
		ssn = git.getTxtSSN_emp();
		height = git.getTxtHeight_emp();
		weight = git.getTxtWeight_emp();
		desc = git.getTxtDescription_emp();
	}
	
	public String toString(){
		
		return "First Name: " + first + "\n\n" + "Middle Initial: " + middle + "\n\n" + "Last Name: " + last + "\n\n" + "Address: " + address + "\n\n" + "DOB: " +
				dob + "\n\n" + "SSN: " + ssn + "\n\n" + "Height: " + height + "\n\n" + "Weight: " + weight + "\n\n" + "Description : " + desc;
		
	}

	public void printToGUI(){
		
		git.getTxtView_emp().setText(toString());
	}
}
