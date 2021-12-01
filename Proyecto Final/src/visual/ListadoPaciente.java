package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JPanel panel;
	private JLabel lblCedula;
	private JTextField txtpaccedregis;
	private JLabel label_1;
	private JTextField txtpacnomb;
	private JLabel lblCedula_1;
	private JTextField txtpacced;
	private JLabel lblGenero;
	private JTextField txtpacdirecc;
	private JTextField txtpactel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoPaciente dialog = new ListadoPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoPaciente() {
		setResizable(false);
		setTitle("Listado de pacientes");
		setBounds(100, 100, 600, 660);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 228, 550, 335);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Cedula", "Genero", "Fecha de Nacimiento", "Direccion", "Telefono"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(122);
		scrollPane.setViewportView(table);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Buscador:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 550, 196);
		contentPanel.add(panel);
		
		lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 24, 58, 14);
		panel.add(lblCedula);
		
		txtpaccedregis = new JTextField();
		txtpaccedregis.setColumns(10);
		txtpaccedregis.setBounds(66, 21, 93, 20);
		panel.add(txtpaccedregis);
		
		label_1 = new JLabel("Nombre:");
		label_1.setBounds(41, 49, 66, 14);
		panel.add(label_1);
		
		txtpacnomb = new JTextField();
		txtpacnomb.setEditable(false);
		txtpacnomb.setColumns(10);
		txtpacnomb.setBounds(41, 74, 93, 20);
		panel.add(txtpacnomb);
		
		lblCedula_1 = new JLabel("Cedula:");
		lblCedula_1.setBounds(175, 49, 66, 14);
		panel.add(lblCedula_1);
		
		txtpacced = new JTextField();
		txtpacced.setEditable(false);
		txtpacced.setColumns(10);
		txtpacced.setBounds(175, 74, 93, 20);
		panel.add(txtpacced);
		
		lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(309, 49, 93, 14);
		panel.add(lblGenero);
		
		JComboBox cmbpacgen = new JComboBox();
		cmbpacgen.setEnabled(false);
		cmbpacgen.setModel(new DefaultComboBoxModel(new String[] {"<< Seleccione >>", "Hombre", "Mujer"}));
		cmbpacgen.setBounds(309, 74, 132, 20);
		panel.add(cmbpacgen);
		
		JLabel lblNewLabel = new JLabel("Fecha de Nacimiento:");
		lblNewLabel.setBounds(41, 112, 118, 14);
		panel.add(lblNewLabel);
		
		JSpinner spnpacfechna = new JSpinner();
		spnpacfechna.setEnabled(false);
		spnpacfechna.setModel(new SpinnerDateModel(new Date(1637899200000L), null, null, Calendar.DAY_OF_YEAR));
		spnpacfechna.setBounds(39, 137, 120, 20);
		panel.add(spnpacfechna);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(175, 112, 118, 14);
		panel.add(lblDireccion);
		
		txtpacdirecc = new JTextField();
		txtpacdirecc.setEditable(false);
		txtpacdirecc.setColumns(10);
		txtpacdirecc.setBounds(175, 137, 93, 20);
		panel.add(txtpacdirecc);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(309, 112, 118, 14);
		panel.add(lblTelefono);
		
		txtpactel = new JTextField();
		txtpactel.setEditable(false);
		txtpactel.setColumns(10);
		txtpactel.setBounds(309, 137, 132, 20);
		panel.add(txtpactel);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(179, 20, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnHistorialClinico = new JButton("Historial clinico");
		btnHistorialClinico.setBounds(309, 20, 132, 23);
		panel.add(btnHistorialClinico);
		
		JPanel buttonpane = new JPanel();
		buttonpane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		buttonpane.setBounds(0, 574, 594, 57);
		contentPanel.add(buttonpane);
		buttonpane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBounds(374, 11, 89, 23);
		buttonpane.add(btnNewButton_1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(477, 11, 89, 23);
		buttonpane.add(btnSalir);
		setLocationRelativeTo(null);
	}
}