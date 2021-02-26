package lalelu;

public class Scanner {
    public boolean scan(String pInput) {
        Character buffer = null;
        boolean inputTrueSoFar = false;
        int stateCount = 0;
        for (char i : pInput.toCharArray()) {
            if (!inputTrueSoFar) {
                if (buffer == null) {
                    buffer = i;
                } else {
                    if (stateCount < 2) {
                        if (!check1(buffer, i)) { return false; } // check if "la", "le", or "lu"
                        else { stateCount++; buffer = null; } // uptime state counter (this will assure we only check for check1 twice)
                    } else {
                        if (!check2(buffer, i)) { return false; } // check for ending "lu"
                        else { inputTrueSoFar = true; } // input so far is equal to lalelu-langauge
                    }
                }
            } else {
                return false; // input was true and equal to lalelu-lang but the input had more characters which makes it unequal to lalelu-lang
            }
        }
        if (inputTrueSoFar) { return true; }
        else { return false; } // something went wrong
    }

    private boolean check1(Character char1, Character char2) {
        if (!char1.equals('l')) { return false; }
        if (!char2.equals('a') && !char2.equals('e') && !char2.equals('u')) { return false; }
        return true;
    }

    private boolean check2(Character char1, Character char2) {
        if (!char1.equals('l')) { return false; }
        if (!char2.equals('u')) { return false; }
        return true;
    }
}
