import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.*;
class MyProject extends JFrame implements ActionListener
{
int count=0,p=0;
JLabel l=new JLabel();
JButton b1=new JButton("next");
JButton b2=new JButton();
JRadioButton rb[]=new JRadioButton[4];
ButtonGroup g=new ButtonGroup();
MyProject(String s)
{
super(s);


add(l);
for(int i=0;i<4;i++)
{
rb[i]=new JRadioButton();
add(rb[i]);
g.add(rb[i]);
}
l.setBounds(30,40,400,30);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
rb[0].setBounds(50,100,140,30);
rb[1].setBounds(50,160,140,30);
rb[2].setBounds(50,220,140,30);
rb[3].setBounds(50,280,140,30);
//rb[4].setBounds(50,340,140,30);
b1.setBounds(40,380,100,60);
b2.setBounds(160,380,100,60);

set();
setSize(500,300);
setLayout(null);
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}




public void actionPerformed(ActionEvent e)
{

    if(e.getSource()==b1)
     {

           if(check())
                count=count+1;
                         p++;
                   set();
                        if(p==3)
      {
                     b1.setEnabled(false);
                              b2.setText("result");
                        b2.setVisible(true);
       }
    }


if(e.getActionCommand().equals("result"))
{

          if(check())
               count=count+1;
                       p++;
                        JOptionPane.showMessageDialog(this," your score is "+count);
               System.exit(0);
}

}


void set()
{
if (p==0)
{
l.setText("Q.1- which girl of nith has big tits?");
rb[0].setText("1.prerna");rb[1].setText("2.ankita mehra");rb[2].setText("3.both 1 & 2");rb[3].setText("N.O.T");
}
if(p==1)
{
l.setText("Q.2- which girl is famous for 420 ?");
rb[0].setText("1.neha");rb[1].setText("2.astha");rb[2].setText("3.bakri");rb[3].setText(" both 1 & 3");
}
if(p==2)
{
l.setText("Q.3- stud of 3rd year in cse branch ?");
rb[0].setText("1.shan rasila");rb[1].setText("2.prashant shukla");rb[2].setText("3.mama");rb[3].setText("1 & 2");
}
if(p==3)
{
l.setText("Q.4- shivam chaudary is famous for ?");
rb[0].setText("1.his name buboo");rb[1].setText("2.swag");rb[2].setText("teeth");rb[3].setText("1 & 2");
}


}
boolean check()
{
//rb[4].isSelected(true);

if(p==0)
return(rb[0].isSelected());

if(p==1)
return(rb[3].isSelected());

if(p==2)
return(rb[0].isSelected());

if(p==3)
return(rb[3].isSelected());

return false;


}
public static void main(String s[])
{
MyProject mp=new MyProject("online test");
}


}





