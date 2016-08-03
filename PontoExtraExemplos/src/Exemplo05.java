import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Exemplo05 extends Frame {

	public static void main(String[] args) {

		Exemplo05 ex05 = new Exemplo05();

		ex05.setLayout(new BorderLayout(10, 10));

		ex05.add(new Button("Botão Norte!!!"), BorderLayout.NORTH);
		ex05.add(new Button("Botão Sul!!!"), BorderLayout.SOUTH);
		ex05.add(new Button("Botão Leste!!!"), BorderLayout.EAST);
		ex05.add(new Button("Botão Oste!!!"), BorderLayout.WEST);
		ex05.add(new Button("Botão Centro !!!"), BorderLayout.CENTER);
		ex05.setSize(200, 200);
		ex05.setVisible(true);

	}

}
