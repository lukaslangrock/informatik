package Arztpraxis;

public class Patient
{
    // final because patients usually don't change their names
    // or insurance company while in the waiting room.
    private final String name;
    private final String versicherung;

    public Patient(String pName, String pVersicherung)
    {
        name = pName;
        versicherung = pVersicherung;
    }

    public String getName() { return name; }

    public String getVersicherung() { return versicherung; }
}
