package prisonsyncgitversion;

public class Employee {

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

    public Employee(String first, String middle, String last, String address, String dob, String ssn, String height, String weight, String desc) {
        this.first = first; //git.getFirst();
        this.middle = middle;
        this.last = last;
        this.address = address;
        this.dob = dob;
        this.ssn = ssn;
        this.height = height;
        this.weight = weight;
        this.desc = desc;
    }

    public String toString() {

        return "First Name: " + first + "\n\n" + "Middle Initial: " + middle + "\n\n" + "Last Name: " + last + "\n\n" + "Address: " + address + "\n\n" + "DOB: "
                + dob + "\n\n" + "SSN: " + ssn + "\n\n" + "Height: " + height + "\n\n" + "Weight: " + weight + "\n\n" + "Description : " + desc;

    }

    public void printToGUI() {

        git.getTxtView_emp().setText(toString());

    }

}