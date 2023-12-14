package Package1;
import java.util.Random;

public class Ciudad {
    
    private int cityid;
    private String namec;

    public Ciudad() {
    }

    public Ciudad(int cityid, String namec) {
        this.cityid = cityid;
        this.namec = namec;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        if (cityid >= 1 && cityid <= 99) {
            this.cityid = cityid;
        }
    }

    public String getNamec() {
        return namec;
    }

    public void setNamec(String namec) {
        if (namec.length() <= 30) {
            this.namec = namec;
        }
    }
    
}