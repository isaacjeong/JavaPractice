class ThisPractice {
    String name;
    public int age;

    public ThisPractice(String argName) {
        name = argName;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        ThisPractice tp = new ThisPractice("IJ");
        tp.setName("AJ");
        System.out.println(tp.getName());
    }
    public void setName(String argName) {
        name = argName;
    }
}