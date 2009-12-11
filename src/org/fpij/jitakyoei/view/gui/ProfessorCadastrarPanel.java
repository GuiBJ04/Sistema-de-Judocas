/*
 * Created by JFormDesigner on Tue Dec 08 21:15:47 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;

/**
 * @author wansoul
 */
public class ProfessorCadastrarPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProfessorCadastrarPanel() {
		initComponents();
	}

	public ProfessorPanel getProfessorPanel() {
		return professorPanel;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		panel2 = new JPanel();
		label1 = new JLabel();
		buscarFiliado = new JButton();
		professorPanel = new ProfessorPanel();
		panel1 = new JPanel();
		cadastrar = new JButton();
		cancelar = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"default:grow",
			"2*(default, $lgap), default"));

		//======== panel2 ========
		{
			panel2.setName("panel2");
			panel2.setLayout(new BorderLayout());

			//---- label1 ----
			label1.setText("Cadastrar Professor");
			label1.setFont(new Font("Tahoma", Font.BOLD, 18));
			label1.setName("label1");
			panel2.add(label1, BorderLayout.WEST);

			//---- buscarFiliado ----
			buscarFiliado.setText("Buscar Filiado");
			buscarFiliado.setName("buscarFiliado");
			panel2.add(buscarFiliado, BorderLayout.EAST);
		}
		add(panel2, cc.xy(1, 1));

		//---- professorPanel ----
		professorPanel.setName("professorPanel");
		add(professorPanel, cc.xy(1, 3));

		//======== panel1 ========
		{
			panel1.setName("panel1");
			panel1.setLayout(new FormLayout(
				"40dlu, 2*($lcgap, default)",
				"default"));

			//---- cadastrar ----
			cadastrar.setText("Cadastrar");
			cadastrar.setName("cadastrar");
			panel1.add(cadastrar, cc.xy(3, 1));

			//---- cancelar ----
			cancelar.setText("Cancelar");
			cancelar.setName("cancelar");
			panel1.add(cancelar, cc.xy(5, 1));
		}
		add(panel1, cc.xy(1, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel panel2;
	private JLabel label1;
	private JButton buscarFiliado;
	private ProfessorPanel professorPanel;
	private JPanel panel1;
	private JButton cadastrar;
	private JButton cancelar;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}