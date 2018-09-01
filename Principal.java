import javax.swing.JOptionPane;

public class Principal {

    public static void main(String []args) {

        String teste = JOptionPane.showInputDialog(null, "Qual o animal?");

         Gato gato1 = new Gato();

          if(teste.equalsIgnoreCase("GATO")) {
            gato1.setName(JOptionPane.showInputDialog(null, "Nome do Animal"));
            gato1.setColor(JOptionPane.showInputDialog(null, "Cor do Animal"));
            gato1.setSize(Integer.parseInt(JOptionPane.showInputDialog(null, "Tamanho do Animal")));
            gato1.setCutenessLevel(Integer.parseInt(JOptionPane.showInputDialog(null, "Nível de fofura do Animal")));
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}