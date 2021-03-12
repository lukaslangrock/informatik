package morsecode;

public class Worker {
    BinaryTree<String> morsetree = new BinaryTree<String>();

    public String translate(String input) {
        String output = null;



        return output;
    }

    private void buildTree() {
        // left tree: -
        // right tree: .
        
        morsetree.setContent("");

        morsetree.getLeftTree().setContent("T");
        morsetree.getRightTree().setContent("E");

        morsetree.getLeftTree().getLeftTree().setContent("M");
        morsetree.getLeftTree().getRightTree().setContent("N");
        morsetree.getRightTree().getLeftTree().setContent("A");
        morsetree.getRightTree().getRightTree().setContent("I");

        morsetree.getLeftTree().getLeftTree().getLeftTree().setContent("O");
        morsetree.getLeftTree().getLeftTree().getRightTree().setContent("G");
        morsetree.getLeftTree().getRightTree().getLeftTree().setContent("K");
        morsetree.getLeftTree().getRightTree().getRightTree().setContent("D");
        morsetree.getRightTree().getLeftTree().getLeftTree().setContent("W");
        morsetree.getRightTree().getLeftTree().getRightTree().setContent("R");
        morsetree.getRightTree().getRightTree().getLeftTree().setContent("U");
        morsetree.getRightTree().getRightTree().getRightTree().setContent("S");

        morsetree.getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("CH");
        morsetree.getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("Ö");
        morsetree.getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("Q");
        morsetree.getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("Z");
        morsetree.getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("Y");
        morsetree.getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("C");
        morsetree.getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("X");
        morsetree.getLeftTree().getRightTree().getRightTree().getRightTree().setContent("B");
        morsetree.getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("J");
        morsetree.getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("P");
        morsetree.getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("Ä");
        morsetree.getRightTree().getLeftTree().getRightTree().getRightTree().setContent("L");
        morsetree.getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("Ü");
        morsetree.getRightTree().getRightTree().getLeftTree().getRightTree().setContent("F");
        morsetree.getRightTree().getRightTree().getRightTree().getLeftTree().setContent("V");
        morsetree.getRightTree().getRightTree().getRightTree().getRightTree().setContent("H");

        morsetree.getLeftTree().getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("0");
        morsetree.getLeftTree().getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("9");
        morsetree.getLeftTree().getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("");
        morsetree.getLeftTree().getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("8");
        morsetree.getLeftTree().getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("Ñ");
        morsetree.getLeftTree().getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("");
        morsetree.getLeftTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("[n. b.]");
        morsetree.getLeftTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("7");
        morsetree.getLeftTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("");
        morsetree.getLeftTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("(");
        morsetree.getLeftTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("[Spruchanfang]");
        morsetree.getLeftTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("");
        morsetree.getLeftTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        morsetree.getLeftTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("/");
        morsetree.getLeftTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("[]=/Pause]");
        morsetree.getLeftTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("6");
        morsetree.getRightTree().getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("1");
        morsetree.getRightTree().getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("");
        morsetree.getRightTree().getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("[Å/À]");
        morsetree.getRightTree().getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("");
        morsetree.getRightTree().getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        morsetree.getRightTree().getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("[+/Spruchende]");
        morsetree.getRightTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("È");
        morsetree.getRightTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("&");
        morsetree.getRightTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("2");
        morsetree.getRightTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("[n. b.]");
        morsetree.getRightTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("¿");
        morsetree.getRightTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("É");
        morsetree.getRightTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("3");
        morsetree.getRightTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("[Verstanden]");
        morsetree.getRightTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("4");
        morsetree.getRightTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("5");

        morsetree.getLeftTree().getLeftTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent(":");
        morsetree.getLeftTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("[n. b.]");//working currently
        morsetree.getLeftTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("7");
        morsetree.getLeftTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("");
        morsetree.getLeftTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("(");
        morsetree.getLeftTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("[Spruchanfang]");
        morsetree.getLeftTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("");
        morsetree.getLeftTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        morsetree.getLeftTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("/");
        morsetree.getLeftTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("[]=/Pause]");
        morsetree.getLeftTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("6");
        morsetree.getRightTree().getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("1");
        morsetree.getRightTree().getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("");
        morsetree.getRightTree().getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("[Å/À]");
        morsetree.getRightTree().getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("");
        morsetree.getRightTree().getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        morsetree.getRightTree().getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("[+/Spruchende]");
        morsetree.getRightTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("È");
        morsetree.getRightTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("&");
        morsetree.getRightTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("2");
        morsetree.getRightTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("[n. b.]");
        morsetree.getRightTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("¿");
        morsetree.getRightTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("É");
        morsetree.getRightTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("3");
        morsetree.getRightTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("[Verstanden]");
        morsetree.getRightTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("4");
        morsetree.getRightTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("5");
    }
}
