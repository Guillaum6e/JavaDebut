class Wilder {
    String firstname;
    boolean aware;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI() {
        if (aware) {
            return "I am " + firstname + " and I am aware";
        } else {
            return "I am " + firstname + " and I am not aware";
        }
    }

    public static void main(String[] args) {

    }
}