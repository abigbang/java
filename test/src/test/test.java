package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame {
//�������
	public static void main(String[] args) {
	test ts=new test();

}
JPanel jp1,jp2,jp3;
JLabel jlb1,jlb2,linklabel;
JButton jb1,jb2;
JTextField txtName;
JPasswordField txtkey;
int chance=2;

//���캯��
public test(){
super("��½");
jp1 = new JPanel();
jp2 = new JPanel();
jp3 = new JPanel();

jlb1 = new JLabel("�û���");
jlb2 = new JLabel("��    ��");
jb1 = new JButton("��½");
jb2 =new JButton("ȡ��");
//ButtonListener listener =new ButtonLis
txtName = new JTextField(10);
txtkey = new JPasswordField(10);

//���ò��ֹ�����
this.setLayout(new GridLayout(3,1));
//����������
jp1.add(jlb1);
jp1.add(txtName);

jp2.add(jlb2);
jp2.add(txtkey);

jp3.add(jb1);
jp3.add(jb2);

//���뵽JFrame
this.add(jp1);
this.add(jp2);
this.add(jp3);

this.setSize(300,150);
this.setLocation(200,200);
this.setResizable(false);//false��ʾ��������ı���ʾ��Ĵ�С
this.setVisible(true);
jb1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sreaccount = txtName.getText();
		String srekey = new String (txtkey.getPassword());
		
		String account="admin",key="admin";		
		if(account.equals(sreaccount)&&key.equals(srekey)) {

		JOptionPane.showMessageDialog(null, "��½�ɹ�", "��ʾ����", JOptionPane.PLAIN_MESSAGE);

		        try {
		            Runtime.getRuntime().exec("cmd.exe /c start " + "https://user.qzone.qq.com/1139774009/infocenter");
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		}
		else {
			if(chance==0) {
		JOptionPane.showMessageDialog(null, "��ֹ��½�r(�s���t)�q", "��ʾ����", JOptionPane.OK_OPTION);
		System.exit(0);  

			}
			else
				JOptionPane.showMessageDialog(null, "�˻���������󣬻���"+chance+"�λ���", "��ʾ����", JOptionPane.INFORMATION_MESSAGE);
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