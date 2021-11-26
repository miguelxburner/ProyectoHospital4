package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerfilAdmin extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtadminnomb;
	private JTextField txtadminpuestolab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PerfilAdmin dialog = new PerfilAdmin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PerfilAdmin() {
		setResizable(false);
		setTitle("Perfil del Administrador");
		setBounds(100, 100, 544, 429);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(PerfilAdmin.class.getResource("/pictures/admin.png")));
			lblNewLabel.setBounds(23, 25, 190, 207);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Men\u00FA:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(283, 25, 204, 309);
			contentPanel.add(panel);
			{
				JButton button = new JButton("Listado de  pacientes");
				button.setBounds(10, 34, 184, 34);
				panel.add(button);
			}
			{
				JButton button = new JButton("Listado de enfermedades");
				button.setBounds(10, 102, 184, 34);
				panel.add(button);
			}
			{
				JButton button = new JButton("Listado de vacunas");
				button.setBounds(10, 170, 184, 34);
				panel.add(button);
			}
			{
				JButton btnListadoDeUsuarios = new JButton("Listado de usuarios");
				btnListadoDeUsuarios.setBounds(10, 238, 184, 34);
				panel.add(btnListadoDeUsuarios);
			}
		}
		{
			txtadminnomb = new JTextField();
			txtadminnomb.setEditable(false);
			txtadminnomb.setBounds(23, 257, 190, 26);
			contentPanel.add(txtadminnomb);
			txtadminnomb.setColumns(10);
		}
		{
			txtadminpuestolab = new JTextField();
			txtadminpuestolab.setEditable(false);
			txtadminpuestolab.setColumns(10);
			txtadminpuestolab.setBounds(23, 308, 190, 26);
			contentPanel.add(txtadminpuestolab);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}