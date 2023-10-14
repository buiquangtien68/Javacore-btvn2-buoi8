public class SKT {
    private String name;
    private String position;

    public SKT(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
