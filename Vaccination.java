
/**
 * Write a description of class Vaccination here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vaccination
{
    private String name;
    private String mysejID;
    private String vaccineType;
    private boolean completeDose;

    public Vaccination(String n,String id,String vacc,boolean dose)
    {
        name = n;
        mysejID = id;
        vaccineType = vacc;
        completeDose = dose;
    }

    public String getName(){return name;}

    public String getMysejID(){return mysejID;}

    public String getVaccineType(){return vaccineType;}

    public boolean getCompleteDose(){return completeDose;}

    public String displayDose()
    {
        if(getCompleteDose())
            return "Complete";
        else
            return "Not Complete";
    }

    public String toString()
    {
        return name +"\t"+mysejID+"\t"+vaccineType+"\t"+displayDose();
    }
}
