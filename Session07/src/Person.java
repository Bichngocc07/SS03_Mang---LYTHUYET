public class Person {
    private String fullName;
    private int age;
    private boolean isSleep;
    private boolean isMarkup;
    private boolean isBeautiful;
    private boolean isHandsome;
    private boolean isProactive;

    public Person(String fullName, int age, boolean isSleep, boolean isMarkup, boolean isBeautiful, boolean isHandsome, boolean isProactive) {
        this.fullName = fullName;
        this.age = age;
        this.isSleep = isSleep;
        this.isMarkup = isMarkup;
        this.isBeautiful = isBeautiful;
        this.isHandsome = isHandsome;
        this.isProactive = isProactive;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }

    public boolean isMarkup() {
        return isMarkup;
    }

    public void setMarkup(boolean markup) {
        isMarkup = markup;
    }

    public boolean isBeautiful() {
        return isBeautiful;
    }

    public void setBeautiful(boolean beautiful) {
        isBeautiful = beautiful;
    }

    public boolean isHandsome() {
        return isHandsome;
    }

    public void setHandsome(boolean handsome) {
        isHandsome = handsome;
    }

    public boolean isProactive() {
        return isProactive;
    }

    public void setProactive(boolean proactive) {
        isProactive = proactive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", isSleep=" + isSleep +
                ", isMarkup=" + isMarkup +
                ", isBeautiful=" + isBeautiful +
                ", isHandsome=" + isHandsome +
                ", isProactive=" + isProactive +
                '}';
    }
}
