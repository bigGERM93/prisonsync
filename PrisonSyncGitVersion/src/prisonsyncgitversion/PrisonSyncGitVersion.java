package prisonsyncgitversion;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author glrob_000
 */
public class PrisonSyncGitVersion extends JFrame {

    //class variables
    private String first;
    private String middle;
    private String last;
    private String address;
    private String dob;
    private String ssn;
    private String height;
    private String weight;
    private String desc;

    private JPanel contentPane;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JLabel lTitle;
    private JPanel ppLogin;
    private PS_Panel pLogin;
    private JPanel pMainMenu;
    private JPanel pFunctionScreen;
    private JMenuBar menuBar;
    private JMenu mFile;
    private JMenu mView;
    private JMenuItem iExit;
    private JMenuItem iMainMenu;
    private JMenuItem iLogout;
    private JMenuItem iSave;
    private JButton btnCreateInmate;
    private JButton btnViewInmate;
    private JPasswordField passwordField;
    private JButton btnCreateEmployee;
    private JButton btnViewActivities;
    private JButton btnViewEmployee;
    private JButton btnCreateActivity;
    private JButton btnPrisonMap;
    private JButton button_4;
    private JButton btnLogOut;
    private JLabel lblNewLabel;
    private JPanel pCreateInmate;
    private JLabel lblCreateInmate;
    private JLabel lblFirst_in;
    private JTextField txtFirst_in;
    private JTextField txtMidInit_in;
    private JLabel lblLast_in;
    private JTextField txtLast_in;
    private JTextField txtAddress_in;
    private JLabel lblPicture_in;
    private JLabel lblSSN_in;
    private JTextField txtDOB_in;
    private JLabel lblGender_in;
    private JTextField txtSSN_in;
    private JLabel lblAddress_in;
    private JRadioButton rbMale_in;
    private JRadioButton rbFemale_in;
    private ButtonGroup btnGroup;
    private JLabel lblHeight_in;
    private JTextField txtHeight_in;
    private JLabel lblWeight_in;
    private JTextField txtWeight_in;
    private JPanel pCreateEmployee;
    private JLabel lblCreateEmployee;
    private JLabel lblFirst_emp;
    private JTextField txtFirst_emp;
    private JLabel lblMidInit_emp;
    private JTextField txtMidInit_emp;
    private JLabel lblLast_emp;
    private JTextField txtLast_emp;
    private JLabel lblDOB_emp;
    private JTextField txtAddress_emp;
    private JLabel lblPicture_emp;
    private JLabel lblSSN_emp;
    private JTextField txtDOB_emp;
    private JLabel lblAddress_emp;
    private JTextField txtSSN_emp;
    private JLabel lblGender_emp;
    private JRadioButton rbMale_emp;
    private JRadioButton rbFemale_emp;
    private JLabel lblHeight_emp;
    private JTextField txtHeight_emp;
    private JLabel lblWeight_emp;
    private JTextField txtWeight_emp;
    private JButton btnCancel_emp;
    private JButton btnSubmit_emp;
    private JLabel lblDescription_emp;
    private JTextArea txtDescription_emp;
    private JPanel pViewInmate;
    private JPanel pCreateActivity;
    private JPanel pViewActivities;
    private JPanel pPrisonMap;
    private JLabel lblViewInmate;
    private JLabel lblName;
    private JTextField txtName_in;
    private JButton btnName_in;
    private JLabel lblSSNSearch_in;
    private JTextField txtSSNSearch_in;
    private JButton btnBack_in;
    private JTextArea txtView_in;
    private JButton btnBack;
    private JPanel pViewEmployee;
    private JLabel lblViewEmployee;
    private JLabel lblName_emp;
    private JTextField txtName_emp;
    private JButton btnNameSearch_emp;
    private JLabel lblSSNSearch_emp;
    private JTextField txtSSNSearch_emp;
    private JButton btnSSNSearch_emp;
    private JTextArea txtView_emp;
    private JButton btnBack_emp;
    private JPanel pMoreInfoScreen_in;
    private JLabel lblCreateUsername_in;
    private JLabel lblCreatePassword_in;
    private JLabel lblVerifyPassword_in;
    private JButton btnContinue_in;
    private JButton btnCancel_in;
    private JButton btnCancel2_in;
    private JButton btnSubmit_in;
    private JTextArea txtDescription_in;
    private JLabel lblDescription_in;
    private JLabel lblCreateInmate2;
    private JPanel pMoreInfoScreen_emp;
    private JLabel lblCreateUsername_emp;
    private JTextField txtCreateUsername_emp;
    private JLabel lblCreatePassword_emp;
    private JTextField txtCreatePassword_emp;
    private JLabel lblVerifyPassword_emp;
    private JTextField txtVerifyPassword_emp;
    private JLabel lblCreateEmployee2;
    private JButton btnCancel2_emp;
    private JButton btnContinue_emp;

    /**
     * Launch the prison system application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PrisonSyncGitVersion frame = new PrisonSyncGitVersion();
                    frame.setVisible(true);
                    //frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application frame
     */
    public PrisonSyncGitVersion() {
        //initialize variables
        contentPane = new JPanel();

        //set JFrame settings
        this.setTitle("Prison Sync");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set a few sizing/position constraints
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setBounds(300, 300, 850, 600);
        this.setResizable(false);
        this.setMinimumSize(new Dimension(850, 600));
        this.setLocationRelativeTo(null);

        //create the content pane to house all the jpanels in cardlayout
        contentPane.setBackground(Color.black);
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        //call methods to build gui screens
        createMenuBar();
        createpLoginScreen();
        createMainMenuScreen();
        functionScreen();
    }

    /*
     * create the window menu bar
     */
    public void createMenuBar() {
        menuBar = new JMenuBar();

        //File menu
        mFile = new JMenu("File");
        iMainMenu = new JMenuItem("Main Menu");
        iSave = new JMenuItem("Save");
        iLogout = new JMenuItem("Logout");
        iExit = new JMenuItem("Exit");
        //add action listener to items
        iMainMenu.addActionListener(new MenuListener());
        iSave.addActionListener(new MenuListener());
        iLogout.addActionListener(new MenuListener());
        iExit.addActionListener(new MenuListener());
        //add menu items under mFile menu
        mFile.add(iMainMenu);
        mFile.add(iSave);
        mFile.add(iLogout);
        mFile.add(iExit);
        //add mFile to menu bar
        menuBar.add(mFile);

        //view menu
        mView = new JMenu("View");
		//add menu items under mView menu

        //add mView to menu bar
        menuBar.add(mView);

        //contentPane.add(menuBar, "name_134465845777054");
        this.setJMenuBar(menuBar);
    }

    /*
     * create the create employee screen
     */
    public void functionScreen() {
        pFunctionScreen = new PS_Panel();
        pFunctionScreen.setBackground(SystemColor.windowBorder);
        contentPane.add(pFunctionScreen, "name_133620821462709");
        pFunctionScreen.setVisible(false);
        pFunctionScreen.setBorder(new EmptyBorder(50, 100, 50, 100));
        pFunctionScreen.setLayout(new CardLayout(0, 0));

        //call methods to construct panels inside this panels card layout
        createInmateScreen();
        createEmployeeScreen();
        viewInmateScreen();
        viewEmployeeScreen();
        inmateMoreInfoScreen();
        employeeMoreInfoScreen();
    }

    /*
     * this method create the screen to add a new inmate to database
     */
    public void createInmateScreen() {
        pCreateInmate = new JPanel();
        pCreateInmate.setBackground(new Color(250, 250, 250, 150));
        pFunctionScreen.add(pCreateInmate);
        pCreateInmate.setLayout(null);

        lblCreateInmate = new JLabel("Create Inmate");
        lblCreateInmate.setFont(new Font("Dialog", Font.BOLD, 24));
        lblCreateInmate.setBounds(40, 12, 198, 29);
        pCreateInmate.add(lblCreateInmate);

        lblFirst_in = new JLabel("First:");
        lblFirst_in.setBounds(40, 67, 46, 15);
        pCreateInmate.add(lblFirst_in);

        txtFirst_in = new JTextField();
        txtFirst_in.setBounds(40, 87, 114, 19);
        pCreateInmate.add(txtFirst_in);
        txtFirst_in.setColumns(10);

        JLabel lblMidInit_in = new JLabel("MI:");
        lblMidInit_in.setBounds(166, 67, 27, 15);
        pCreateInmate.add(lblMidInit_in);

        txtMidInit_in = new JTextField();
        txtMidInit_in.setBounds(166, 87, 27, 19);
        pCreateInmate.add(txtMidInit_in);
        txtMidInit_in.setColumns(10);

        lblLast_in = new JLabel("Last:");
        lblLast_in.setBounds(205, 67, 46, 15);
        pCreateInmate.add(lblLast_in);

        txtLast_in = new JTextField();
        txtLast_in.setColumns(10);
        txtLast_in.setBounds(205, 87, 133, 19);
        pCreateInmate.add(txtLast_in);

        JLabel lblDOB_in = new JLabel("DOB (mm/dd/yyyy) :");
        lblDOB_in.setBounds(40, 154, 143, 15);
        pCreateInmate.add(lblDOB_in);

        txtAddress_in = new JTextField();
        txtAddress_in.setBounds(40, 126, 143, 19);
        pCreateInmate.add(txtAddress_in);
        txtAddress_in.setColumns(10);

        lblPicture_in = new JLabel("Upload Picture");
        lblPicture_in.setHorizontalAlignment(SwingConstants.CENTER);
        lblPicture_in.setBounds(365, 87, 205, 260);
        lblPicture_in.setBackground(Color.white);
        pCreateInmate.add(lblPicture_in);

        lblSSN_in = new JLabel("SSN (###-##-####):");
        lblSSN_in.setBounds(40, 197, 161, 15);
        pCreateInmate.add(lblSSN_in);

        txtDOB_in = new JTextField();
        txtDOB_in.setBounds(40, 171, 114, 19);
        pCreateInmate.add(txtDOB_in);
        txtDOB_in.setColumns(3);

        lblAddress_in = new JLabel("Address:");
        lblAddress_in.setBounds(40, 108, 70, 15);
        pCreateInmate.add(lblAddress_in);

        txtSSN_in = new JTextField();
        txtSSN_in.setBounds(40, 213, 114, 19);
        pCreateInmate.add(txtSSN_in);
        txtSSN_in.setColumns(10);

        lblGender_in = new JLabel("Gender:");
        lblGender_in.setBounds(40, 235, 84, 15);
        pCreateInmate.add(lblGender_in);

        rbMale_in = new JRadioButton("Male");
        rbMale_in.setBounds(40, 250, 70, 23);
        pCreateInmate.add(rbMale_in);

        rbFemale_in = new JRadioButton("Female");
        rbFemale_in.setBounds(121, 250, 80, 23);
        pCreateInmate.add(rbFemale_in);

        btnGroup = new ButtonGroup();
        btnGroup.add(rbMale_in);
        btnGroup.add(rbFemale_in);

        lblHeight_in = new JLabel("Height (inches):");
        lblHeight_in.setHorizontalAlignment(SwingConstants.LEFT);
        lblHeight_in.setBounds(40, 281, 133, 15);
        pCreateInmate.add(lblHeight_in);

        txtHeight_in = new JTextField();
        txtHeight_in.setBounds(40, 296, 55, 19);
        pCreateInmate.add(txtHeight_in);
        txtHeight_in.setColumns(10);

        lblWeight_in = new JLabel("Weight (lbs):");
        lblWeight_in.setBounds(185, 281, 101, 15);
        pCreateInmate.add(lblWeight_in);

        txtWeight_in = new JTextField();
        txtWeight_in.setBounds(185, 296, 53, 19);
        pCreateInmate.add(txtWeight_in);
        txtWeight_in.setColumns(10);

        btnCancel_in = new JButton("Cancel");
        btnCancel_in.setBounds(344, 375, 117, 25);
        pCreateInmate.add(btnCancel_in);
        btnCancel_in.addActionListener(new NavigationListener());

        btnContinue_in = new JButton("Continue");
        btnContinue_in.setBounds(473, 375, 117, 25);
        pCreateInmate.add(btnContinue_in);
        btnContinue_in.addActionListener(new NavigationListener());

        lblDescription_in = new JLabel("Description:");
        lblDescription_in.setBounds(40, 321, 114, 15);
        pCreateInmate.add(lblDescription_in);

        txtDescription_in = new JTextArea();
        txtDescription_in.setBounds(40, 337, 246, 65);
        pCreateInmate.add(txtDescription_in);
    }

    /*
     * create the screen to gather more information to create the employee
     */
    public void inmateMoreInfoScreen() {
        pMoreInfoScreen_in = new JPanel();
        pMoreInfoScreen_in.setBackground(new Color(250, 250, 250, 150));
        pFunctionScreen.add(pMoreInfoScreen_in);
        pMoreInfoScreen_in.setLayout(null);

        lblCreateInmate2 = new JLabel("Create Employee Continued");
        lblCreateInmate2.setFont(new Font("Dialog", Font.BOLD, 24));
        lblCreateInmate2.setBounds(40, 12, 350, 29);
        pMoreInfoScreen_in.add(lblCreateInmate2);

        lblCreateUsername_in = new JLabel("Create Username:");
        lblCreateUsername_in.setBounds(40, 67, 120, 15);
        pMoreInfoScreen_in.add(lblCreateUsername_in);

        lblCreatePassword_in = new JLabel("Create Password");
        lblCreatePassword_in.setBounds(40, 154, 143, 15);
        pMoreInfoScreen_in.add(lblCreatePassword_in);

        btnCancel2_in = new JButton("Cancel");
        btnCancel2_in.setBounds(215, 375, 117, 25);
        pMoreInfoScreen_in.add(btnCancel2_in);
        btnCancel_in.addActionListener(new NavigationListener());

        btnBack_in = new JButton("Back");
        btnBack_in.setBounds(344, 375, 117, 25);
        pMoreInfoScreen_in.add(btnBack_in);
        btnBack_in.addActionListener(new NavigationListener());

        btnSubmit_in = new JButton("Submit");
        btnSubmit_in.setBounds(473, 375, 117, 25);
        pMoreInfoScreen_in.add(btnSubmit_in);
        btnSubmit_in.addActionListener(new NavigationListener());
    }

    /*
     * create the screen for more information to create the inmate
     */
    public void employeeMoreInfoScreen() {
        pMoreInfoScreen_emp = new JPanel();
        pMoreInfoScreen_emp.setBackground(new Color(250, 250, 250, 150));
        pFunctionScreen.add(pMoreInfoScreen_emp);
        pMoreInfoScreen_emp.setLayout(null);

        lblCreateEmployee2 = new JLabel("Create Employee Continued");
        lblCreateEmployee2.setFont(new Font("Dialog", Font.BOLD, 24));
        lblCreateEmployee2.setBounds(40, 12, 350, 29);
        pMoreInfoScreen_emp.add(lblCreateEmployee2);

        lblCreateUsername_emp = new JLabel("Create Username:");
        lblCreateUsername_emp.setBounds(40, 67, 120, 15);
        pMoreInfoScreen_emp.add(lblCreateUsername_emp);

        txtCreateUsername_emp = new JTextField();
        txtCreateUsername_emp.setBounds(40, 82, 114, 19);
        pMoreInfoScreen_emp.add(txtCreateUsername_emp);
        txtCreateUsername_emp.setColumns(10);

        lblVerifyPassword_emp = new JLabel("Verify Password");
        lblVerifyPassword_emp.setBounds(40, 108, 143, 15);
        pMoreInfoScreen_emp.add(lblVerifyPassword_emp);

        lblCreatePassword_emp = new JLabel("Create Password");
        lblCreatePassword_emp.setBounds(40, 154, 143, 15);
        pMoreInfoScreen_emp.add(lblCreatePassword_emp);

        btnCancel2_emp = new JButton("Cancel");
        btnCancel2_emp.setBounds(215, 375, 117, 25);
        pMoreInfoScreen_emp.add(btnCancel2_emp);
        btnCancel2_emp.addActionListener(new NavigationListener());

        btnBack_emp = new JButton("Back");
        btnBack_emp.setBounds(344, 375, 117, 25);
        pMoreInfoScreen_emp.add(btnBack_emp);
        btnBack_emp.addActionListener(new NavigationListener());

        btnSubmit_emp = new JButton("Submit");
        btnSubmit_emp.setBounds(473, 375, 117, 25);
        pMoreInfoScreen_emp.add(btnSubmit_emp);
        btnSubmit_emp.addActionListener(new NavigationListener());
    }

    /*
     * this method creates the screen to add a new employee
     */
    public void createEmployeeScreen() {
        pCreateEmployee = new JPanel();
        pCreateEmployee.setLayout(null);
        pCreateEmployee.setBackground(new Color(250, 250, 250, 150));
        pFunctionScreen.add(pCreateEmployee, "name_380696571586024");

        lblCreateEmployee = new JLabel("Create Employee");
        lblCreateEmployee.setFont(new Font("Dialog", Font.BOLD, 24));
        lblCreateEmployee.setBounds(40, 12, 246, 29);
        pCreateEmployee.add(lblCreateEmployee);

        lblFirst_emp = new JLabel("First:");
        lblFirst_emp.setBounds(40, 67, 46, 15);
        pCreateEmployee.add(lblFirst_emp);

        txtFirst_emp = new JTextField();
        txtFirst_emp.setColumns(10);
        txtFirst_emp.setBounds(40, 87, 114, 19);
        pCreateEmployee.add(txtFirst_emp);

        lblMidInit_emp = new JLabel("MI:");
        lblMidInit_emp.setBounds(166, 67, 27, 15);
        pCreateEmployee.add(lblMidInit_emp);

        txtMidInit_emp = new JTextField();
        txtMidInit_emp.setColumns(10);
        txtMidInit_emp.setBounds(166, 87, 27, 19);
        pCreateEmployee.add(txtMidInit_emp);

        lblLast_emp = new JLabel("Last:");
        lblLast_emp.setBounds(205, 67, 46, 15);
        pCreateEmployee.add(lblLast_emp);

        txtLast_emp = new JTextField();
        txtLast_emp.setColumns(10);
        txtLast_emp.setBounds(205, 87, 133, 19);
        pCreateEmployee.add(txtLast_emp);

        lblDOB_emp = new JLabel("DOB (mm/dd/yyyy) :");
        lblDOB_emp.setBounds(40, 154, 143, 15);
        pCreateEmployee.add(lblDOB_emp);

        txtAddress_emp = new JTextField();
        txtAddress_emp.setColumns(10);
        txtAddress_emp.setBounds(40, 126, 143, 19);
        pCreateEmployee.add(txtAddress_emp);

        lblPicture_emp = new JLabel("Upload Picture");
        lblPicture_emp.setHorizontalAlignment(SwingConstants.CENTER);
        lblPicture_emp.setBackground(Color.WHITE);
        lblPicture_emp.setBounds(365, 87, 205, 260);
        pCreateEmployee.add(lblPicture_emp);

        lblSSN_emp = new JLabel("SSN (###-##-####) :");
        lblSSN_emp.setBounds(40, 197, 161, 15);
        pCreateEmployee.add(lblSSN_emp);

        txtDOB_emp = new JTextField();
        txtDOB_emp.setColumns(3);
        txtDOB_emp.setBounds(40, 171, 114, 19);
        pCreateEmployee.add(txtDOB_emp);

        lblAddress_emp = new JLabel("Address:");
        lblAddress_emp.setBounds(40, 108, 70, 15);
        pCreateEmployee.add(lblAddress_emp);

        txtSSN_emp = new JTextField();
        txtSSN_emp.setColumns(10);
        txtSSN_emp.setBounds(40, 213, 114, 19);
        pCreateEmployee.add(txtSSN_emp);

        lblGender_emp = new JLabel("Gender:");
        lblGender_emp.setBounds(40, 235, 84, 15);
        pCreateEmployee.add(lblGender_emp);

        rbMale_emp = new JRadioButton("Male");
        rbMale_emp.setBounds(40, 250, 70, 23);
        pCreateEmployee.add(rbMale_emp);

        rbFemale_emp = new JRadioButton("Female");
        rbFemale_emp.setBounds(121, 250, 80, 23);
        pCreateEmployee.add(rbFemale_emp);

        lblHeight_emp = new JLabel("Height (inches):");
        lblHeight_emp.setHorizontalAlignment(SwingConstants.LEFT);
        lblHeight_emp.setBounds(40, 281, 133, 15);
        pCreateEmployee.add(lblHeight_emp);

        txtHeight_emp = new JTextField();
        txtHeight_emp.setColumns(10);
        txtHeight_emp.setBounds(40, 296, 55, 19);
        pCreateEmployee.add(txtHeight_emp);

        lblWeight_emp = new JLabel("Weight (lbs):");
        lblWeight_emp.setBounds(185, 281, 101, 15);
        pCreateEmployee.add(lblWeight_emp);

        txtWeight_emp = new JTextField();
        txtWeight_emp.setColumns(10);
        txtWeight_emp.setBounds(185, 296, 53, 19);
        pCreateEmployee.add(txtWeight_emp);

        btnCancel_emp = new JButton("Cancel");
        btnCancel_emp.setBounds(344, 375, 117, 25);
        pCreateEmployee.add(btnCancel_emp);
        btnCancel_emp.addActionListener(new NavigationListener());

        btnContinue_emp = new JButton("Continue");
        btnContinue_emp.setBounds(473, 375, 117, 25);
        btnContinue_emp.addActionListener(new NavigationListener());
        pCreateEmployee.add(btnContinue_emp);

        lblDescription_emp = new JLabel("Description:");
        lblDescription_emp.setBounds(40, 321, 114, 15);
        pCreateEmployee.add(lblDescription_emp);

        txtDescription_emp = new JTextArea();
        txtDescription_emp.setBounds(40, 337, 246, 65);
        pCreateEmployee.add(txtDescription_emp);

    }

    /*
     * this method creates the screen to view inmates
     */
    public void viewInmateScreen() {
        pViewInmate = new JPanel();
        pFunctionScreen.add(pViewInmate, "name_384628246847050");
        pViewInmate.setLayout(null);
        pViewInmate.setBackground(new Color(250, 250, 250, 150));

        lblViewInmate = new JLabel("View Inmate");
        lblViewInmate.setFont(new Font("Dialog", Font.BOLD, 24));
        lblViewInmate.setBounds(41, 24, 190, 38);
        pViewInmate.add(lblViewInmate);

        lblName = new JLabel("Name:");
        lblName.setBounds(41, 74, 56, 15);
        pViewInmate.add(lblName);

        txtName_in = new JTextField();
        txtName_in.setBounds(98, 72, 107, 19);
        pViewInmate.add(txtName_in);
        txtName_in.setColumns(10);

        btnName_in = new JButton("Search");
        btnName_in.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnName_in.setBounds(217, 71, 83, 20);
        pViewInmate.add(btnName_in);

        /*lblSSNSearch_in = new JLabel("SSN:");
         lblSSNSearch_in.setBounds(317, 74, 100, 15);
         pViewInmate.add(lblSSNSearch_in);
		
         txtSSNSearch_in = new JTextField();
         txtSSNSearch_in.setBounds(357, 72, 114, 19);
         pViewInmate.add(txtSSNSearch_in);
         txtSSNSearch_in.setColumns(10);
		
         btnBack_in = new JButton("Search");
         btnBack_in.setBounds(483, 69, 83, 20);
         pViewInmate.add(btnBack_in);*/
        txtView_in = new JTextArea();
        txtView_in.setEnabled(false);
        txtView_in.setEditable(false);
        txtView_in.setBounds(41, 112, 527, 233);
        pViewInmate.add(txtView_in);

        btnBack = new JButton("Back");
        btnBack.setBounds(451, 373, 117, 25);
        pViewInmate.add(btnBack);

        pCreateActivity = new JPanel();
        pFunctionScreen.add(pCreateActivity, "name_384699661729607");

        pViewActivities = new JPanel();
        pFunctionScreen.add(pViewActivities, "name_384761728106314");

        pPrisonMap = new JPanel();
        pFunctionScreen.add(pPrisonMap, "name_384807218945181");

    }

    /*
     * 
     */
    public void viewEmployeeScreen() {
        pViewEmployee = new JPanel();
        pViewEmployee.setLayout(null);
        pFunctionScreen.add(pViewEmployee, "name_392631449256618");

        lblViewEmployee = new JLabel("View Employee");
        lblViewEmployee.setFont(new Font("Dialog", Font.BOLD, 24));
        lblViewEmployee.setBounds(41, 24, 213, 38);
        pViewEmployee.add(lblViewEmployee);

        lblName_emp = new JLabel("Name:");
        lblName_emp.setBounds(41, 74, 56, 15);
        pViewEmployee.add(lblName_emp);

        txtName_emp = new JTextField();
        txtName_emp.setColumns(10);
        txtName_emp.setBounds(98, 72, 107, 19);
        pViewEmployee.add(txtName_emp);

        btnNameSearch_emp = new JButton("Search");
        btnNameSearch_emp.setBounds(217, 71, 83, 20);
        pViewEmployee.add(btnNameSearch_emp);

        /*lblSSNSearch_emp = new JLabel("SSN:");
         lblSSNSearch_emp.setBounds(317, 74, 100, 15);
         pViewEmployee.add(lblSSNSearch_emp);
		
         txtSSNSearch_emp = new JTextField();
         txtSSNSearch_emp.setColumns(10);
         txtSSNSearch_emp.setBounds(357, 72, 114, 19);
         pViewEmployee.add(txtSSNSearch_emp);
		
         btnSSNSearch_emp = new JButton("Search");
         btnSSNSearch_emp.setBounds(483, 69, 83, 20);
         pViewEmployee.add(btnSSNSearch_emp);*/
        txtView_emp = new JTextArea();
        txtView_emp.setEnabled(false);
        txtView_emp.setEditable(false);
        txtView_emp.setBounds(41, 112, 527, 233);
        pViewEmployee.add(txtView_emp);

        JScrollPane scroll = new JScrollPane(txtView_emp);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        btnBack_emp = new JButton("Back");
        btnBack_emp.setBounds(451, 373, 117, 25);
        pViewEmployee.add(btnBack_emp);
    }
    /*
     * create the pLogin screen 
     */

    public void createpLoginScreen() {
        //create components for pLogin screen
        lTitle = new JLabel("Prison Sync");
        lTitle.setForeground(new Color(255, 102, 51));
        lTitle.setFont(new Font("Liberation Serif", Font.BOLD | Font.ITALIC, 99));
        lTitle.setBounds(66, 76, 633, 132);

        txtUsername = new JTextField();
        txtUsername.setForeground(new Color(128, 128, 128));
        txtUsername.setText("Username");
        txtUsername.setBounds(66, 339, 187, 30);
        txtUsername.setBackground(new Color(10, 10, 10));
        txtUsername.setColumns(10);
        txtUsername.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txtUsername.getText().equals("Username")) {
                    txtUsername.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txtUsername.getText().equals(null)
                        || txtUsername.getText().toString().trim().equals("")) {
                    txtUsername.setText("Username");
                }
            }
        });

        txtPassword = new JTextField("Password");
        txtPassword.setForeground(new Color(128, 128, 128));
        txtPassword.setBounds(66, 381, 187, 30);
        txtPassword.setColumns(10);
        txtPassword.setBackground(new Color(10, 10, 10));
        txtPassword.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txtPassword.getText().equals("Password")) {
                    txtPassword.setText("");
                    lblNewLabel.setVisible(true);
                }
            }

            public void focusLost(FocusEvent e) {
                if (txtPassword.getText().equals(null)
                        || txtPassword.getText().toString().trim().equals("")) {
                    txtPassword.setText("Password");
                    lblNewLabel.setVisible(false);
                }
            }
        });
        txtPassword.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent k) {
                if (k.getKeyCode() == KeyEvent.VK_ENTER) {

                    //verify pLogin information
                    //go to menu screen
                    clearPanels();
                    pMainMenu.setVisible(true);

                }

            }

            @Override
            public void keyReleased(KeyEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyTyped(KeyEvent arg0) {
                // TODO Auto-generated method stub

            }
        });

        //create pLogin screen
        pLogin = new PS_Panel();

        /*
         passwordField = new JPasswordField("Password");
         passwordField.setBounds(101,450, 187, 30);
         pLogin.add(passwordField);
         pLogin.setVisible(true);
         */
        pLogin.setBackground(Color.gray);
        pLogin.add(lTitle);
        pLogin.add(txtPassword);
        pLogin.add(txtUsername);
        contentPane.add(pLogin, "name_133652214172196");
        pLogin.setLayout(null);

        lblNewLabel = new JLabel("Press \"Enter\"");
        lblNewLabel.setForeground(Color.green);
        lblNewLabel.setBounds(112, 411, 103, 23);
        pLogin.add(lblNewLabel);
        lblNewLabel.setVisible(false);
    }

    /*
     * create the menu screen
     */
    public void createMainMenuScreen() {
        pMainMenu = new PS_Panel();
        pMainMenu.setBorder(new EmptyBorder(80, 150, 80, 150));
        //pMenu.setBackground(Color.GREEN);
        contentPane.add(pMainMenu, "name_133540670975918");
        pMainMenu.setLayout(new GridLayout(1, 2, 0, 0));

        JPanel pBtnSelection_1 = new JPanel();
        //pSelection.setBAckground(new Color());
        JPanel pBtnSelection_2 = new JPanel();
        pMainMenu.add(pBtnSelection_1);
        pMainMenu.add(pBtnSelection_2);
        pBtnSelection_1.setLayout(new GridLayout(4, 1, 0, 20));
        pBtnSelection_1.setBackground(new Color(250, 250, 250, 150));
        pBtnSelection_1.setBorder(new EmptyBorder(20, 20, 20, 20));
        pBtnSelection_2.setLayout(new GridLayout(4, 1, 0, 20));
        pBtnSelection_2.setBackground(new Color(250, 250, 250, 150));
        pBtnSelection_2.setBorder(new EmptyBorder(20, 20, 20, 20));

        btnCreateInmate = new JButton("Create Inmate");
        pBtnSelection_1.add(btnCreateInmate);
        btnCreateInmate.setFont(new Font("Dialog", Font.BOLD, 18));
        btnCreateInmate.setBackground(new Color(220, 220, 220));
        btnCreateInmate.addActionListener(new NavigationListener());

        btnViewInmate = new JButton("View Inmate");
        pBtnSelection_2.add(btnViewInmate);
        btnViewInmate.setFont(new Font("Dialog", Font.BOLD, 18));
        btnViewInmate.setBackground(new Color(220, 220, 220));
        btnViewInmate.addActionListener(new NavigationListener());

        btnCreateEmployee = new JButton("Create Employee");
        btnCreateEmployee.setBackground(new Color(220, 220, 220));
        pBtnSelection_1.add(btnCreateEmployee);
        btnCreateEmployee.setFont(new Font("Dialog", Font.BOLD, 18));
        btnCreateEmployee.addActionListener(new NavigationListener());

        btnViewEmployee = new JButton("View Employee");
        btnViewEmployee.setFont(new Font("Dialog", Font.BOLD, 18));
        btnViewEmployee.setBackground(new Color(220, 220, 220));
        pBtnSelection_2.add(btnViewEmployee);
        btnViewEmployee.addActionListener(new NavigationListener());

        btnCreateActivity = new JButton("Create Activity");
        btnCreateActivity.setFont(new Font("Dialog", Font.BOLD, 18));
        btnCreateActivity.setBackground(new Color(220, 220, 220));
        pBtnSelection_1.add(btnCreateActivity);
        btnCreateActivity.addActionListener(new NavigationListener());

        btnViewActivities = new JButton("View Activities");
        btnViewActivities.setFont(new Font("Dialog", Font.BOLD, 18));
        btnViewActivities.setBackground(new Color(220, 220, 220));
        pBtnSelection_2.add(btnViewActivities);
        btnViewActivities.addActionListener(new NavigationListener());

        btnPrisonMap = new JButton("View Prison \nMap");
        btnPrisonMap.setFont(new Font("Dialog", Font.BOLD, 18));
        btnPrisonMap.setBackground(new Color(220, 220, 220));
        pBtnSelection_1.add(btnPrisonMap);
        btnPrisonMap.addActionListener(new NavigationListener());

        btnLogOut = new JButton("Log Out");
        btnLogOut.setFont(new Font("Dialog", Font.BOLD, 18));
        btnLogOut.setBackground(new Color(220, 220, 220));
        pBtnSelection_2.add(btnLogOut);
        btnLogOut.addActionListener(new NavigationListener());
    }
    /*
     * set all jPanels in the card layout of create panel to false
     */

    public void clearVCPanels() {
        pCreateInmate.setVisible(false);
        pCreateEmployee.setVisible(false);
        pViewInmate.setVisible(false);
        pViewEmployee.setVisible(false);
        pMoreInfoScreen_in.setVisible(false);
        pMoreInfoScreen_emp.setVisible(false);
    }
    /*
     * set all jpanels in card layout to not visible
     */

    public void clearPanels() {
        pMainMenu.setVisible(false);
        pLogin.setVisible(false);
        pFunctionScreen.setVisible(false);
    }

    /*
     * action listener for the menu bar to perform proper action
     */
    public class MenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent action) {
            if (action.getSource() == iMainMenu) {
                //System.out.println("Main menu pressed");
                clearPanels();
                pMainMenu.setVisible(true);
            } else if (action.getSource() == iSave) {
                //save work
            } else if (action.getSource() == iLogout) {
                clearPanels();
                pLogin.setVisible(true);

            } else if (action.getSource() == iExit) {
                //logout and exit program
                System.exit(0);
            }

        }

    }

    /*
     this method generates a unique id number for each inmate created
     */
    public String generateUID() {
        String uid = "";// = UUID.randomUUID().toString();
        return uid;
    }

    /*
     * action listener for the main menu to display proper screen
     */
    public class NavigationListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent action) {
            //clear all the panels
            clearPanels();
            clearVCPanels();
            //then make the proper panel visible
            if (action.getSource() == btnCreateInmate) {
                pFunctionScreen.setVisible(true);
                pCreateInmate.setVisible(true);
            } else if (action.getSource() == btnCreateEmployee) {
                pFunctionScreen.setVisible(true);
                pCreateEmployee.setVisible(true);
            } else if (action.getSource() == btnViewInmate) {
                pFunctionScreen.setVisible(true);
                pViewInmate.setVisible(true);
            } else if (action.getSource() == btnViewEmployee) {
                pFunctionScreen.setVisible(true);
                pViewEmployee.setVisible(true);
            } else if (action.getSource() == btnCreateActivity) {
                pFunctionScreen.setVisible(true);
            } else if (action.getSource() == btnViewActivities) {
                pFunctionScreen.setVisible(true);
            } else if (action.getSource() == btnPrisonMap) {
                pFunctionScreen.setVisible(true);
            } else if (action.getSource() == btnCancel_in || action.getSource() == btnCancel2_in
                    || action.getSource() == btnCancel_emp || action.getSource() == btnCancel2_emp) {
                pMainMenu.setVisible(true);
            } else if (action.getSource() == btnContinue_in) {
                pFunctionScreen.setVisible(true);
                pMoreInfoScreen_in.setVisible(true);
            } else if (action.getSource() == btnContinue_emp) {
                pFunctionScreen.setVisible(true);
                pMoreInfoScreen_emp.setVisible(true);
            } else if (action.getSource() == btnBack_in) {
                pFunctionScreen.setVisible(true);
                pCreateInmate.setVisible(true);
            } else if (action.getSource() == btnBack_emp) {
                pFunctionScreen.setVisible(true);
                pCreateEmployee.setVisible(true);
            } else if (action.getSource() == btnSubmit_in) {
                pFunctionScreen.setVisible(true);

                pCreateInmate.setVisible(true);

                first = txtFirst_in.getText();

                middle = txtMidInit_in.getText();

                last = txtLast_in.getText();

                address = txtAddress_in.getText();

                dob = txtDOB_in.getText();

                ssn = txtSSN_in.getText();

                height = txtHeight_in.getText();

                weight = txtWeight_in.getText();

                desc = txtDescription_in.getText();
                //create a new inmate object

                Inmate inmate = new Inmate();
                System.out.println(inmate.toString());
                //create new form for creating inmate
                createInmateScreen();
                pMainMenu.setVisible(true);
            } else if (action.getSource() == btnSubmit_emp) {
                pFunctionScreen.setVisible(true);

                pCreateEmployee.setVisible(true);

                first = txtFirst_emp.getText();

                middle = txtMidInit_emp.getText();

                last = txtLast_emp.getText();

                address = txtAddress_emp.getText();

                dob = txtDOB_emp.getText();

                ssn = txtSSN_emp.getText();

                height = txtHeight_emp.getText();

                weight = txtWeight_emp.getText();

                desc = txtDescription_emp.getText();
                //create a new employee object
                Employee employee = new Employee();
                System.out.println(employee.toString());
                System.out.println("Hello " + txtFirst_emp.getText());
                //create new form for creating employee
                createEmployeeScreen();

                pMainMenu.setVisible(true);
            } else if (action.getSource() == btnLogOut) {
		//discard changes

                //clear login info
                //go to login screen
                clearPanels();
                pLogin.setVisible(true);
            }
        }

    }

    public String getFirst() {

        return first;

    }

    public void setFirst(String first) {

        this.first = first;

    }

    public String getMiddle() {

        return middle;

    }

    public void setMiddle(String middle) {

        this.middle = middle;

    }

    public String getLast() {

        return last;

    }

    public void setLast(String last) {

        this.last = last;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public String getDob() {

        return dob;

    }

    public void setDob(String dob) {

        this.dob = dob;

    }

    public String getSsn() {

        return ssn;

    }

    public void setSsn(String ssn) {

        this.ssn = ssn;

    }

    public String getHeightIn() {

        return height;

    }

    public void setHeight(String height) {

        this.height = height;

    }

    public String getWeight() {

        return weight;

    }

    public void setWeight(String weight) {

        this.weight = weight;

    }

    public String getDesc() {

        return desc;

    }

    public void setDesc(String desc) {

        this.desc = desc;

    }

    public JTextArea getTxtView_in() {

        return txtView_in;

    }

    public void setTxtView_in(JTextArea txtView_in) {

        this.txtView_in = txtView_in;

    }

    public JTextArea getTxtView_emp() {

        return txtView_emp;

    }

    public void setTxtView_emp(JTextArea txtView_emp) {

        this.txtView_emp = txtView_emp;

    }
}
