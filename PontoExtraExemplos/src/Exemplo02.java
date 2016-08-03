
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Exemplo02 extends Panel {
	Exemplo02() {

		setBackground(Color.BLUE);
	}

	public void paint(Graphics g) {

		g.setColor(new Color(255, 0, 0));
		g.setFont(new Font("Arial", Font.BOLD, 16));
		g.drawString("Primeiro Exemplo com Graphics", 30, 100);
		g.setColor(new Color(0, 1.0f, 0));
		g.fillRect(30, 100, 150, 10);

	}

	public static void main(String[] args) {

		Frame f = new Frame("Testando a classe Graphics!!!");
		Exemplo02 ex02 = new Exemplo02();
		f.add(ex02);
		f.setSize(400, 200);
		f.setVisible(true);

	}

}
