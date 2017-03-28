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
l.setText("Q.1- who is the director of nith");
rb[0].setText("1.susheel chauhan");rb[1].setText("2.ajay k.sharma");rb[2].setText("3.rajneesh srivastava");rb[3].setText("N.O.T");
}
if(p==1)
{
l.setText("Q.2- freecode camp site is famous for what?");
rb[0].setText("1.open source");rb[1].setText("2.web development");rb[2].setText("3.competitive");rb[3].setText(" both 1 & 3");
}
if(p==2)
{
l.setText("Q.3- is java is object oriented language ?");
rb[0].setText("1.yes");rb[1].setText("2.no");rb[2].setText("3.may be");rb[3].setText("NOT");
}
if(p==3)
{
l.setText("Q.4- which company is most popular now a days for processor ?");
rb[0].setText("1.intel ");rb[1].setText("2.AMD");rb[2].setText("samsung");rb[3].setText("1 & 2");
}


}
boolean check()
{
//rb[4].isSelected(true);

if(p==0)
return(rb[1].isSelected());

if(p==1)
return(rb[1].isSelected());

if(p==2)
return(rb[0].isSelected());

if(p==3)
return(rb[0].isSelected());

return false;


}
public static void main(String s[])
{
MyProject mp=new MyProject("online test");
}


}





