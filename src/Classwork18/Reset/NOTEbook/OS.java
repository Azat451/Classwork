package Classwork18.Reset.NOTEbook;

public class OS {
    String name;
    String version;

    public OS(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
