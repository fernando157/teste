import java.awt.*;

public class Exemplo03 extends Frame {
	public static void main(String[] args) {
		Exemplo03 ex03 = new Exemplo03();
		ex03.setLayout(new FlowLayout());
		ex03.setSize(600, 100);
		ex03.add(new Button("Click aqui!!!"));
		ex03.add(new Label("Texto de etiqueta!"));
		ex03.add(new TextField());
		CheckboxGroup cbg = new CheckboxGroup();
		ex03.add(new Checkbox("homem", cbg, true));
		ex03.add(new Checkbox("mulher", cbg, true));
		List list = new List(3, false);
		list.add("Java");
		list.add("C");
		list.add("C++");
		ex03.add(list);
		Choice chooser = new Choice();
		chooser.add("João");
		chooser.add("Maria");
		chooser.add("José");
		ex03.add(chooser);
		ex03.add(new Scrollbar());
		ex03.setVisible(true);

	}

}
