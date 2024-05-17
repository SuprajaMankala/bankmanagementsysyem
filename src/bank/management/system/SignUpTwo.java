
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener
{
   
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,income,education;
    String formno;
    SignUpTwo(String formno){
        
        this.formno=formno;        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATON FORM - PAGE 2");
        
        JLabel aditionalDetails=new JLabel("Page 2: Additional Details");
        aditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        aditionalDetails.setBounds(290,80,400,30);
        add(aditionalDetails);
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valRegion[]={"Hindu","Muslim","Christian","Sikh","Other"};
        religion =new JComboBox(valRegion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[]={"General","OBC","SC","ST","Other"}; 
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel jincome=new JLabel("Income:");
        jincome.setFont(new Font("Raleway",Font.BOLD,22));
        jincome.setBounds(100,240,200,30);
        add(jincome);
        
        String incomeCategory[]={"Null","< 1,50,000","<2,50,5000","<5,00,000","upto 10,00,000"};
        income=new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel jeducational=new JLabel("Educational");
        jeducational.setFont(new Font("Raleway",Font.BOLD,22));
        jeducational.setBounds(100,290,200,30);
        add(jeducational);
        
        JLabel jqualification=new JLabel("Qualification:");
        jqualification.setFont(new Font("Raleway",Font.BOLD,22));
        jqualification.setBounds(100,315,200,30);
        add(jqualification);
        
        String educationValue[]={"Non-Graduation","Gradute","Post-Graduation","Doctrate","Others"};
        education=new JComboBox(educationValue);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
                
        
        JLabel joccupation=new JLabel("Occupation:");
        joccupation.setFont(new Font("Raleway",Font.BOLD,22));
        joccupation.setBounds(100,390,200,30);
        add(joccupation);
        
        String OccupationValue[]={"Salaried","Self Employed","Bussiness","Student","Retires","Others"};
        occupation=new JComboBox(OccupationValue);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        JLabel jpan=new JLabel("PAN Number:");
        jpan.setFont(new Font("Raleway",Font.BOLD,22));
        jpan.setBounds(100,440,200,30);
        add(jpan);
        
        pan =new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel jaadhar=new JLabel("Aadhar Number:");
        jaadhar.setFont(new Font("Raleway",Font.BOLD,22));
        jaadhar.setBounds(100,490,200,30);
        add(jaadhar);
        
        aadhar =new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel jsenior=new JLabel("Senior Citizen:");
        jsenior.setFont(new Font("Raleway",Font.BOLD,22));
        jsenior.setBounds(100,540,200,30);
        add(jsenior);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
       
        
        ButtonGroup bsenoircitizen=new ButtonGroup();
        bsenoircitizen.add(syes);
        bsenoircitizen.add(sno);
       
        
        JLabel jexisitingaccount=new JLabel("Existing Account:");
        jexisitingaccount.setFont(new Font("Raleway",Font.BOLD,22));
        jexisitingaccount.setBounds(100,590,200,30);
        add(jexisitingaccount);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
       
        
        ButtonGroup existingAcc=new ButtonGroup();
        existingAcc.add(eyes);
        existingAcc.add(eno);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        
        String seniorcitizen=null;
        if(syes.isSelected())
        {
            seniorcitizen="Yes";
        }
        else if(sno.isSelected())
        {
            seniorcitizen="No";
        }
        
        String exisitingaccount=null;
        if(eyes.isSelected())
        {
           exisitingaccount="Yes";
        }
        else if(eno.isSelected())
        {
            exisitingaccount="No";
        }
        
        String span=pan.getText();
        String saadhar=aadhar.getText();
               
        try{
            
            Conn c=new Conn();
            String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+exisitingaccount+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignUpThree(formno).setVisible(true);
        }           
        catch (Exception e)
        {
            System.out.println(e);
        }
            
            
    }
    public static void main(String args[]) {
        new SignUpTwo("");
    }
}
