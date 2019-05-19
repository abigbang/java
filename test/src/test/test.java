package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame {
//定义组件
	public static void main(String[] args) {
	test ts=new test();

}
JPanel jp1,jp2,jp3;
JLabel jlb1,jlb2,linklabel;
JButton jb1,jb2;
JTextField txtName;
JPasswordField txtkey;
int chance=2;

//构造函数
public test(){
super("登陆");
jp1 = new JPanel();
jp2 = new JPanel();
jp3 = new JPanel();

jlb1 = new JLabel("用户名");
jlb2 = new JLabel("密    码");
jb1 = new JButton("登陆");
jb2 =new JButton("取消");
//ButtonListener listener =new ButtonLis
txtName = new JTextField(10);
txtkey = new JPasswordField(10);

//设置布局管理器
this.setLayout(new GridLayout(3,1));
//加入各个组件
jp1.add(jlb1);
jp1.add(txtName);

jp2.add(jlb2);
jp2.add(txtkey);

jp3.add(jb1);
jp3.add(jb2);

//加入到JFrame
this.add(jp1);
this.add(jp2);
this.add(jp3);

this.setSize(300,150);
this.setLocation(200,200);
this.setResizable(false);//false表示不能随意改变显示框的大小
this.setVisible(true);
jb1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sreaccount = txtName.getText();
		String srekey = new String (txtkey.getPassword());
		
		String account="admin",key="admin";		
		if(account.equals(sreaccount)&&key.equals(srekey)) {

		JOptionPane.showMessageDialog(null, "登陆成功", "提示窗口", JOptionPane.PLAIN_MESSAGE);

		        try {
		            Runtime.getRuntime().exec("cmd.exe /c start " + "https://user.qzone.qq.com/1139774009/infocenter");
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		}
		else {
			if(chance==0) {
		JOptionPane.showMessageDialog(null, "禁止登陆╮(╯▽╰)╭", "提示窗口", JOptionPane.OK_OPTION);
		System.exit(0);  

			}
			else
				JOptionPane.showMessageDialog(null, "账户或密码错误，还有"+chance+"次机会", "提示窗口", JOptionPane.INFORMATION_MESSAGE);
		chance--;
		}
	}
});
jb2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0); 
	}
});
}
}