import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class PMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private PAccountPanel accountPanel;
	private PSugnasincheongPanel sugnasincheongPanel;

	public PMainFrame() {
		// attributes
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width / 2 - this.getWidth()) / 2, 20);

		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// components
		PLoginDialog loginPanel = new PLoginDialog(this);
		loginPanel.setVisible(true);

		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);

		this.accountPanel = new PAccountPanel("Test");
		this.add(accountPanel, BorderLayout.NORTH);

		this.sugnasincheongPanel = new PSugnasincheongPanel();
		this.add(sugnasincheongPanel, BorderLayout.CENTER);

	}
}
