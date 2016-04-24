package prisonsyncgitversion;

public class Inmate{

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
	
	public Inmate(){
		first = git.getTxtFirst_in();
		middle = git.getTxtMidInit_in();
		last = git.getTxtMidInit_in();
		address = git.getTxtAddress_in();
		dob = git.getTxtDOB_in();
		ssn = git.getTxtSSN_in();
		height = git.getTxtHeight_in();
		weight = git.getTxtWeight_in();
		desc = git.getTxtDescription_in();
	}
	
	public String toString(){
		
		return "First Name: " + first + "\n\n" + "Middle Initial: " + middle + "\n\n" + "Last Name: " + last + "\n\n" + "Address: " + address + "\n\n" + "DOB: " +
				dob + "\n\n" + "SSN: " + ssn + "\n\n" + "Height: " + height + "\n\n" + "Weight: " + weight + "\n\n" + "Description : " + desc;
		
	}
	
	public void printToGUI(){
		
		git.getTxtView_in().setText(toString());
	}
}