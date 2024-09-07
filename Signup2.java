package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener 
{
	JLabel lblAdditional,lblReligion,lblCategory,lblIncome,lblEducation,lblQualification,lblOccupation,lblPan,lblAadhar,lblCitizen,lblAccount,lblFormNum,lblFormValue;
	JButton btnNext;
	JTextField txtPan,txtAadhar;
	// jcb= j combo box
	JComboBox jcbReligion,jcbCategory,jcbIncome,jcbEducation,jcbOccupation;
	JRadioButton rbnCitizenYes,rbnCitizenNo,rbnAccountYes,rbnAccountNo;
	
	String formno="";
	
	public Signup2(String formNum)
	{
		this.formno=formNum;
		setTitle("New Account Application Form-Page 2");
		setLayout(null);
		lblAdditional=new JLabel("Page 2: Additional Details");
		Font f=new Font("Tahoma",Font.BOLD, 30);
		lblAdditional.setFont(f);
		lblAdditional.setBounds(200, 50, 600, 40 );
		add(lblAdditional);
		
		lblReligion=new JLabel("Religion:");
	    lblReligion.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblReligion.setBounds(100, 140, 200, 30 );
		add(lblReligion);
		
		String[] religion= {"Hindu","Muslim","Sikh","Christion","others"};
		jcbReligion=new JComboBox(religion);
		jcbReligion.setBackground(Color.white);
		jcbReligion.setFont(new Font("Arial",Font.BOLD,12));
		jcbReligion.setBounds(300, 140, 300, 30);
		add(jcbReligion);
		
		lblCategory=new JLabel("Category:");
		lblCategory.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblCategory.setBounds(100, 180, 200, 30 );
		add(lblCategory);
		

		String[] category= {"General","OBC","SC","ST","others"};
		jcbCategory=new JComboBox(category);
		jcbCategory.setBackground(Color.white);
		jcbCategory.setFont(new Font("Arial",Font.BOLD,12));
		jcbCategory.setBounds(300, 180, 300, 30);
		add(jcbCategory);
		
		
		lblIncome=new JLabel("Income:");
		lblIncome.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblIncome.setBounds(100, 220, 200, 30);
		add(lblIncome);
		
		String[] income= {"Null","<1,50,000","2,50,000","5,00,000","Upto 10,00,000"};
		jcbIncome=new JComboBox(income);
		jcbIncome.setBackground(Color.white);
		jcbIncome.setFont(new Font("Arial",Font.BOLD,12));
		jcbIncome.setBounds(300, 220, 300, 30);
		add(jcbIncome);
		
		lblEducation=new JLabel("Education:");
		lblEducation.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblEducation.setBounds(100, 260, 200, 30 );
		add(lblEducation);
		

		String[] education= {"Non-Graduate","Graduate","post-Graduate","Doctrate","Others"};
		jcbEducation=new JComboBox(education);
		jcbEducation.setBackground(Color.white);
		jcbEducation.setFont(new Font("Arial",Font.BOLD,12));
		jcbEducation.setBounds(300, 260, 300, 30);
		add(jcbEducation);
		
		
		/*lblQualification=new JLabel("Qualification:");
		lblQualification.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblQualification.setBounds(100, 300, 200, 30 );
		add(lblQualification);
		
		String[] qualification= {"Non-Graduate","Graduate","post-Graduate","Doctrate","Others"};
		jcbEducation=new JComboBox(qualification);
		jcbEducation.setBackground(Color.white);
		jcbEducation.setFont(new Font("Arial",Font.BOLD,12));
		jcbEducation.setBounds(300, 300, 300, 30);
		add(jcbEducation);
		*/
		lblOccupation=new JLabel("Occupation:");
		lblOccupation.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblOccupation.setBounds(100, 340, 200, 30 );
		add(lblOccupation);
		
		String[] occupation= {"salaried","Self-Employed","Business","Student","Retired","Others"};
		jcbOccupation=new JComboBox(occupation);
		jcbOccupation.setBackground(Color.white);
		jcbOccupation.setFont(new Font("Arial",Font.BOLD,12));
		jcbOccupation.setBounds(300, 340, 300, 30);
		add(jcbOccupation);
		
		lblPan=new JLabel("Pan Number:");
		lblPan.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblPan.setBounds(100, 380,200, 30 );
		add(lblPan);
		
		txtPan=new JTextField(20);
		txtPan.setFont(new Font("Arial",Font.BOLD,15));
		txtPan.setBounds(300, 380, 300, 30);
		add(txtPan);
		
		lblAadhar=new JLabel("Adhar Number:");
		lblAadhar.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblAadhar.setBounds(100, 420, 200, 30 );
		add(lblAadhar);
		

		txtAadhar=new JTextField(20);
		txtAadhar.setFont(new Font("Arial",Font.BOLD,15));
		txtAadhar.setBounds(300, 420, 300, 30);
		add(txtAadhar);
		
		
		lblCitizen=new JLabel("Senior Citizen:");
		lblCitizen.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblCitizen.setBounds(100, 460, 200, 30 );
		add(lblCitizen);
		
		rbnCitizenYes = new JRadioButton("Yes");
		rbnCitizenYes.setFont(new Font("Tahoma",Font.BOLD,16));
		rbnCitizenYes.setBackground(Color.white);
		rbnCitizenYes.setBounds(300, 460, 100, 30);
		add(rbnCitizenYes);
		
		rbnCitizenNo= new JRadioButton("No");
		rbnCitizenNo.setFont(new Font("Tahoma",Font.BOLD,16));
		rbnCitizenNo.setBackground(Color.white);
		rbnCitizenNo.setBounds(500, 460, 100, 30);
		add(rbnCitizenNo);
		
		ButtonGroup citizen=new ButtonGroup();
		citizen.add(rbnCitizenYes);
		citizen.add(rbnCitizenNo);
		
		lblAccount=new JLabel("Existing Account:");
		lblAccount.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblAccount.setBounds(100, 500, 200, 30 );
		add(lblAccount);
		
		rbnAccountYes = new JRadioButton("Yes");
		rbnAccountYes.setFont(new Font("Tahoma",Font.BOLD,16));
		rbnAccountYes.setBackground(Color.white);
		rbnAccountYes.setBounds(300, 500, 100, 30);
		add(rbnAccountYes);
		
		rbnAccountNo= new JRadioButton("No");
		rbnAccountNo.setFont(new Font("Tahoma",Font.BOLD,16));
		rbnAccountNo.setBackground(Color.white);
		rbnAccountNo.setBounds(500, 500, 100, 30);
		add(rbnAccountNo);
		
		ButtonGroup account=new ButtonGroup();
		account.add(rbnAccountYes);
		account.add(rbnAccountNo);
		lblFormNum=new JLabel("FormNum:");
		lblFormNum.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblFormNum.setBounds(100, 540, 200, 30 );
		add(lblFormNum);
		
		lblFormValue=new JLabel("FormValue");
		lblFormValue.setFont(new Font("Tahoma",Font.BOLD, 18));
		lblFormValue.setBounds(100, 580, 200, 30 );
		add(lblFormValue);
		
		btnNext=new JButton("Submit");
		btnNext.setFont(f);
		btnNext.setBackground(Color.blue);
		btnNext.setForeground(Color.white);
		btnNext.setBounds(320, 620, 150, 40);
		add(btnNext);
		btnNext.addActionListener(this);
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
		
		
	}

	public static void main(String[] args) 
	{
		Signup2 obj=new Signup2("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String religion= (String) jcbReligion.getSelectedItem();
		String category=(String) jcbCategory.getSelectedItem();
		String income=(String) jcbIncome.getSelectedItem();
		String education=(String) jcbEducation.getSelectedItem();
		String occupation=(String) jcbOccupation.getSelectedItem();
		String pan=txtPan.getText();
		String aadhar=txtAadhar.getText();
		String scitizen="";
		if(rbnCitizenYes.isSelected()) {
			scitizen="Yes";
		}
		else if(rbnCitizenNo.isSelected()) {
			scitizen="No";
		}
		String saccount="";
		if(rbnAccountYes.isSelected()) {
			saccount="Yes";
		}
		else if(rbnAccountNo.isSelected()) {
			saccount="No";
		}
		try {
			ConnectionFectory cf=new ConnectionFectory();
			String query="insert into singnup2 values('"+formno+"','"+religion+",'"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+saccount+"')";
			cf.stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Congrates");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
