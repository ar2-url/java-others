    // package pl.tomasz.smutek.sda;

public class Person {

     String name;
     int age;
     String surname;
     String sex;
     String idNumber;

     Person mama, tata;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setMama(Person mama) {
        this.mama = mama;
    }

    public void setTata(Person tata) {
        this.tata = tata;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Person getMama() {
        return mama;
    }

    public Person getTata() {
        return tata;
    }

    public Person(String name, String surname, String sex, String idNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.idNumber = idNumber;




    }

     public void innaMetoda() {

     }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mama=" + mama +
                ", tata=" + tata +
                '}';
    }
}

