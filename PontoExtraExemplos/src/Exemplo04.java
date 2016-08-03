import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Exemplo04 extends Frame {

	public static void main(String[] args) {

		Exemplo04 ex04 = new Exemplo04();
		ex04.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
		ex04.add(new Button("Botão 1"));
		ex04.add(new Button("Botão 2"));
		ex04.add(new Button("Botão 3"));
		ex04.setSize(150, 110);
		ex04.setVisible(true);

	}

}
