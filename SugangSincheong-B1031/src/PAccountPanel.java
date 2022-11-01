import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PAccountPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public PAccountPanel(String name) {
		JLabel lName = new JLabel(name);
		this.add(lName);

		JLabel lInsa = new JLabel("�� �ȿ��ϼ���!");
		this.add(lInsa);

		JLabel lLogin = new JLabel("�α��� �ð���");
		this.add(lLogin);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy�� MM�� dd�� hh�� mm��");
		JLabel lTime = new JLabel(simpleDateFormat.format(new Date()));
		this.add(lTime);

		JLabel lText = new JLabel("�Դϴ�.");
		this.add(lText);
	}
}
