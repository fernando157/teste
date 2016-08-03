
import java.awt.*;

public class Exemplo07 extends Frame {

	public static void main(String[] args) {

		Exemplo07 ex07 = new Exemplo07();

		Panel painelNorte = new Panel();
		Panel painelCentral = new Panel();
		Panel painelSul = new Panel();

		painelNorte.add(new Button("Um"));
		painelNorte.add(new Button("Dois"));
		painelNorte.add(new Button("Três"));

		painelCentral.setLayout(new GridLayout(4, 4));
		painelCentral.add(new TextField("Primeiro"));
		painelCentral.add(new TextField("Segundo"));
		painelCentral.add(new TextField("Terceiro"));
		painelCentral.add(new TextField("Quarto"));

		painelSul.setLayout(new BorderLayout());
		painelSul.add(new Checkbox("Casado"), BorderLayout.CENTER);
		painelSul.add(new Checkbox("Solteiro"), BorderLayout.EAST);
		painelSul.add(new Checkbox("Separado"), BorderLayout.WEST);

		ex07.add(painelNorte, BorderLayout.NORTH);
		ex07.add(painelCentral, BorderLayout.CENTER);
		ex07.add(painelSul, BorderLayout.SOUTH);

		ex07.setSize(300, 300);
		ex07.setVisible(true);

	}

}
