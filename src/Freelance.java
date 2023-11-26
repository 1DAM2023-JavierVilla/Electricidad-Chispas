public class Freelance extends Customer{

    private String surname;
    private String dni;

    @Override
    public String getName(){return getName() + " " + this.surname;}
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
