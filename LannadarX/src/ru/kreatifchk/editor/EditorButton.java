package ru.kreatifchk.editor;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JButton;

import ru.kreatifchk.main.Main;
import ru.kreatifchk.tools.Img;

/** Кнопки для редактора (сверху) */
@SuppressWarnings("serial")
public class EditorButton extends JButton {
	
	boolean selected, pressed;
	int type;
	
	Image buttEd = Img.Image(Main.class.getResource("/ru/kreatifchk/res/image/editor/buttEd.png"));
	Image buttEdEntered = Img.Image(Main.class.getResource("/ru/kreatifchk/res/image/editor/buttEdEntered.png"));
	Image buttEdActivated = Img.Image(Main.class.getResource("/ru/kreatifchk/res/image/editor/buttEdActivated.png"));
	
	Image createT = Img.Image(Main.class.getResource("/ru/kreatifchk/res/image/editor/createT.png"));
	Image openT = Img.Image(Main.class.getResource("/ru/kreatifchk/res/image/editor/openT.png"));
	Image saveT = Img.Image(Main.class.getResource("/ru/kreatifchk/res/image/editor/saveT.png"));
	Image closeT = Img.Image(Main.class.getResource("/ru/kreatifchk/res/image/editor/closeT.png"));
	
	public EditorButton(int type, int width, int height) {
		setSize(width, height);
		setContentAreaFilled(false);
		setBorderPainted(false);
		
		this.type = type;
	}
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if (pressed == true) {
			g2d.drawImage(buttEdActivated, 0, 0, null);
		}
		else if (selected == true) {
			g2d.drawImage(buttEdEntered, 0, 0, null);
		} else {
			g2d.drawImage(buttEd, 0, 0, null);
		}
		
		if (type == 0) {
			g2d.drawImage(createT, 0, 0, null);
		} else if (type == 1) {
			g2d.drawImage(openT, 0, 0, null);
		}
		else if (type == 2) {
			g2d.drawImage(saveT, 0, 0, null);
		}
		else if (type == 3) {
			g2d.drawImage(closeT, 0, 0, null);
		}
	}

}
