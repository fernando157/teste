
import javax.swing.JFrame;

public class Exemplo08 extends JFrame {

	public Exemplo08() {

		super("Minha primeira janela com Swing");
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new Exemplo08();

	}

}
