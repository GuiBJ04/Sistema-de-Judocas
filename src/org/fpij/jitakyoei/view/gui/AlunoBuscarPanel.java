/*
 * Created by JFormDesigner on Tue Dec 08 21:33:28 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import com.jgoodies.forms.layout.*;

/**
 * @author wansoul
 */
public class AlunoBuscarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public AlunoBuscarPanel() {
		initComponents();
	}

	public BuscaCamposPanel getBuscaCamposPanel() {
		return buscaCamposPanel;
	}

	public JTable getAlunos() {
		return alunos;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		buscaCamposPanel = new BuscaCamposPanel();
		panel1 = new JPanel();
		buscar = new JButton();
		scrollPane1 = new JScrollPane();
		alunos = new JTable();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"default:grow",
			"3*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Buscar Aluno");
		label1.setFont(new Font("Dialog", Font.BOLD, 18));
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- buscaCamposPanel ----
		buscaCamposPanel.setName("buscaCamposPanel");
		add(buscaCamposPanel, cc.xy(1, 3));

		//======== panel1 ========
		{
			panel1.setName("panel1");
			panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

			//---- buscar ----
			buscar.setText("Buscar");
			buscar.setName("buscar");
			panel1.add(buscar);
		}
		add(panel1, cc.xy(1, 5));

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1");

			//---- alunos ----
			alunos.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
					{null, null},
				},
				new String[] {
					"RegistroFPIJ", "Nome"
				}
			));
			alunos.setName("alunos");
			scrollPane1.setViewportView(alunos);
		}
		add(scrollPane1, cc.xy(1, 7));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private BuscaCamposPanel buscaCamposPanel;
	private JPanel panel1;
	private JButton buscar;
	private JScrollPane scrollPane1;
	public JTable alunos;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}