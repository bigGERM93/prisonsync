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

    public Employee(String first) {
        this.first = first; //git.getFirst();

        middle = git.getMiddle();

        last = git.getLast();

        address = git.getAddress();

        dob = git.getDob();

        ssn = git.getSsn();

        height = git.getHeightIn();

        weight = git.getWeight();

        desc = git.getDesc();

    }

    public String toString() {

        return "First Name: " + first + "\n\n" + "Middle Initial: " + middle + "\n\n" + "Last Name: " + last + "\n\n" + "Address: " + address + "\n\n" + "DOB: "
                + dob + "\n\n" + "SSN: " + ssn + "\n\n" + "Height: " + height + "\n\n" + "Weight: " + weight + "\n\n" + "Description : " + desc;

    }

    public void printToGUI() {

        git.getTxtView_emp().setText(toString());

    }

}
