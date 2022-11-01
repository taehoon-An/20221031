import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PLoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JTextField tfId;
	private JPasswordField tfPassword;
	
	private SLogin sLogin;
	
	public PLoginDialog(Frame parent) {
		super(parent);
		
		this.setLocation(parent.getX()+ 30, parent.getY()+ 30);
		this.setSize(200,300);
		this.setModal(true);
		
		LayoutManager layoutManager = new FlowLayout();
		this.setLayout(layoutManager);
				
		JPanel line1 = new JPanel();
		this.add(line1);
		
			JLabel lbId = new JLabel("���̵�");
			line1.add(lbId);
			
			this.tfId = new JTextField();
			this.tfId.setColumns(10);
			line1.add(this.tfId);
		
		JPanel line2 = new JPanel();
		this.add(line2);
			JLabel lbPassword = new JLabel("��й�ȣ");
			line2.add(lbPassword);
			
			this.tfPassword = new JPasswordField();
			this.tfPassword.setColumns(10);
			line2.add(this.tfPassword);
		
		JPanel line3 = new JPanel();
		this.add(line3);
			JButton btLogin = new JButton("�α���");
			this.add(btLogin);
		
		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);
		
		this.sLogin = new SLogin();
	}
	
	private void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();
		
		VLogin vLogin = sLogin.login(id);
		if (vLogin == null) {
			// ���̵� ���ų� ��й�ȣ�� Ʋ�Ƚ��ϴ�.
		}

	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}		
	}
}
