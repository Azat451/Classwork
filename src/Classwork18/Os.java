package Classwork18;
public class Os {
    private String name;
    private String version;

    public Os(String name, String version) {
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
        return "Os{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
