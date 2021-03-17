package morsecode;

public class Worker {
    private final BinaryTree<String> morsetree;

    public Worker() {
        morsetree = buildTree();
    }

    public String translateToChar (String pInput) {
        BinaryTree<String> temp;
        String output = "";

        for (String i : pInput.split(" ")) {
            temp = morsetree;
            for (Character j : i.toCharArray()) {
                if (j.equals('.')) {
                    temp = temp.getRightTree();
                } else if (j.equals('-')) {
                    temp = temp.getLeftTree();
                }
            }
            output += temp.getContent().charAt(0);
        }

        return output;
    }

    public String translateCharToMorse(String pInput, BinaryTree<String> pEntrypoint) {
        if (pEntrypoint.getContent().equals(pInput)) {
            return "";
        } else {
            // recursion
            if (pEntrypoint.getLeftTree() != null) {
                String temp = translateCharToMorse(pInput, pEntrypoint.getLeftTree());
                if (temp != null) { return "-" + temp; }
            }
            if (pEntrypoint.getRightTree() != null) {
                String temp = translateCharToMorse(pInput, pEntrypoint.getRightTree());
                if (temp != null) { return "." + temp; }
            }
            return null;
        }
    }

    private BinaryTree<String> buildTree() {
        // left tree: -
        // right tree: .
        
        BinaryTree<String> temp = new BinaryTree<String>();

        temp.setContent("");

        temp.getLeftTree().setContent("T");
        temp.getRightTree().setContent("E");

        temp.getLeftTree().getLeftTree().setContent("M");
        temp.getLeftTree().getRightTree().setContent("N");
        temp.getRightTree().getLeftTree().setContent("A");
        temp.getRightTree().getRightTree().setContent("I");

        temp.getLeftTree().getLeftTree().getLeftTree().setContent("O");
        temp.getLeftTree().getLeftTree().getRightTree().setContent("G");
        temp.getLeftTree().getRightTree().getLeftTree().setContent("K");
        temp.getLeftTree().getRightTree().getRightTree().setContent("D");
        temp.getRightTree().getLeftTree().getLeftTree().setContent("W");
        temp.getRightTree().getLeftTree().getRightTree().setContent("R");
        temp.getRightTree().getRightTree().getLeftTree().setContent("U");
        temp.getRightTree().getRightTree().getRightTree().setContent("S");

        temp.getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("CH");
        temp.getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("Ö");
        temp.getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("Q");
        temp.getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("Z");
        temp.getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("Y");
        temp.getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("C");
        temp.getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("X");
        temp.getLeftTree().getRightTree().getRightTree().getRightTree().setContent("B");
        temp.getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("J");
        temp.getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("P");
        temp.getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("Ä");
        temp.getRightTree().getLeftTree().getRightTree().getRightTree().setContent("L");
        temp.getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("Ü");
        temp.getRightTree().getRightTree().getLeftTree().getRightTree().setContent("F");
        temp.getRightTree().getRightTree().getRightTree().getLeftTree().setContent("V");
        temp.getRightTree().getRightTree().getRightTree().getRightTree().setContent("H");

        temp.getLeftTree().getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("0");
        temp.getLeftTree().getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("9");
        temp.getLeftTree().getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("");
        temp.getLeftTree().getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("8");
        temp.getLeftTree().getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("Ñ");
        temp.getLeftTree().getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("");
        temp.getLeftTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("[n. b.]");
        temp.getLeftTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("7");
        temp.getLeftTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("");
        temp.getLeftTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("(");
        temp.getLeftTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("[Spruchanfang]");
        temp.getLeftTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("");
        temp.getLeftTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        temp.getLeftTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("/");
        temp.getLeftTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("[]=/Pause]");
        temp.getLeftTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("6");
        temp.getRightTree().getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("1");
        temp.getRightTree().getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("");
        temp.getRightTree().getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("[Å/À]");
        temp.getRightTree().getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("");
        temp.getRightTree().getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        temp.getRightTree().getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("[+/Spruchende]");
        temp.getRightTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("È");
        temp.getRightTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("&");
        temp.getRightTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("2");
        temp.getRightTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("[n. b.]");
        temp.getRightTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("¿");
        temp.getRightTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("É");
        temp.getRightTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("3");
        temp.getRightTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("[Verstanden]");
        temp.getRightTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("4");
        temp.getRightTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("5");

        temp.getLeftTree().getLeftTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent(":");
        temp.getLeftTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("[n. b.]");//working currently
        temp.getLeftTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("7");
        temp.getLeftTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("");
        temp.getLeftTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("(");
        temp.getLeftTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("[Spruchanfang]");
        temp.getLeftTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("");
        temp.getLeftTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        temp.getLeftTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("/");
        temp.getLeftTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("[]=/Pause]");
        temp.getLeftTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("6");
        temp.getRightTree().getLeftTree().getLeftTree().getLeftTree().getLeftTree().setContent("1");
        temp.getRightTree().getLeftTree().getLeftTree().getLeftTree().getRightTree().setContent("");
        temp.getRightTree().getLeftTree().getLeftTree().getRightTree().getLeftTree().setContent("[Å/À]");
        temp.getRightTree().getLeftTree().getLeftTree().getRightTree().getRightTree().setContent("");
        temp.getRightTree().getLeftTree().getRightTree().getLeftTree().getLeftTree().setContent("");
        temp.getRightTree().getLeftTree().getRightTree().getLeftTree().getRightTree().setContent("[+/Spruchende]");
        temp.getRightTree().getLeftTree().getRightTree().getRightTree().getLeftTree().setContent("È");
        temp.getRightTree().getLeftTree().getRightTree().getRightTree().getRightTree().setContent("&");
        temp.getRightTree().getRightTree().getLeftTree().getLeftTree().getLeftTree().setContent("2");
        temp.getRightTree().getRightTree().getLeftTree().getLeftTree().getRightTree().setContent("[n. b.]");
        temp.getRightTree().getRightTree().getLeftTree().getRightTree().getLeftTree().setContent("¿");
        temp.getRightTree().getRightTree().getLeftTree().getRightTree().getRightTree().setContent("É");
        temp.getRightTree().getRightTree().getRightTree().getLeftTree().getLeftTree().setContent("3");
        temp.getRightTree().getRightTree().getRightTree().getLeftTree().getRightTree().setContent("[Verstanden]");
        temp.getRightTree().getRightTree().getRightTree().getRightTree().getLeftTree().setContent("4");
        temp.getRightTree().getRightTree().getRightTree().getRightTree().getRightTree().setContent("5");

        return temp;
    }
}
