package ro.usv;

import java.util.ArrayList;
import java.util.List;

public class Admitere {
    private static Admitere instance = null;

    Private Map<Integer,Student>();

    private Admitere() {

    }

    public static Admitere getInstance() {
        if (instance == null)
            instance = new Admitere();

        return single_instance;
    }

    public int inmatriculeaza(int n){
        for (int i=0;i<=n;i++){
            Student s = new Student();
            System.out.println(s);
            RegistruM.put(nrMatricol++,s);
            if(!registruF.contains.getFacultate()))
            {
                List<Student> studList = new ArrayList<Student>();
                studList.add(s);
                registruF.put(s.getFacultate(),studList);
            }
            else
            {

            }
        }
        return n;
    }

    public void afiseazaStudFacultate(){

    }

    public Map<Integer,Student> getRegistruM()
    {
        return registruM;
    }
    public Map<Integer,Student> getRegistruF()
    {
        return registruF;
    }
    public Map<Integer,Student> getRegistruG()
    {
        return registruG;
    }

    public static void main(String[] args) {
        Admitere adm = Admitere.getInstance();
        adm.inmatriculeaza(10);

        Student Snew = new Student(adm.genRegistruN().get(4).getNume());
        adm.genRegistruN().get(4).getGen();
        adm.genRegistruN().get(4).getMediaAdmitere();
        adm.genRegistruN().get(4).getFacultate();

        System.out.println(adm.getRegistruM().containsValue(sNew));
    }
}
