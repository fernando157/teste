
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Exemplo06 extends Frame {
	public static void main(String[] args) {
		Exemplo06 ex06 = new Exemplo06();
		ex06.setLayout(new GridLayout(2, 3));
		ex06.add(new Button("Um"));
		ex06.add(new Button("Dois"));
		ex06.add(new Button("Três"));
		ex06.add(new Button("Quatro"));
		ex06.add(new Button("Cinco"));
		ex06.setSize(200, 200);
		ex06.setVisible(true);

	}

}
