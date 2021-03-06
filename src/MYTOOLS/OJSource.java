package MYTOOLS;

public class OJSource {
    String name;
    String link;
    String profile;
    int totalFile;
    int accepted;

    public OJSource() {
        this.name = "";
        this.link = "";
        this.profile = "";
        this.totalFile = 0;
        this.accepted = 0;
    }

    public OJSource(String name) {
        this.name = name;
        this.link = "";
        this.profile = "";
        this.totalFile = 0;
        this.accepted = 0;
    }

    public OJSource(String name, String link) {
        this.name = name;
        this.link = link;
        this.profile = "";
        this.totalFile = 0;
        this.accepted = 0;
    }

    public OJSource(String name, String link, String profile) {
        this.name = name;
        this.link = link;
        this.profile = profile;
        this.totalFile = 0;
        this.accepted = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getTotalFile() {
        return totalFile;
    }

    public void setTotalFile(int totalFile) {
        this.totalFile = totalFile;
    }

    public int getAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    public void addAccepted() {
        this.accepted++;
    }

    public void addTotalFile() {
        this.totalFile++;
    }

    public String getResult() {
        return this.getName() + " => [totalFile:" + this.totalFile + ", accepted:" + this.accepted + "]";
    }
}
