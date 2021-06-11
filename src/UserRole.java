import java.util.Objects;

public class UserRole {
       private int age;
       private int money;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRole userRole = (UserRole) o;
        return age == userRole.age &&
                money == userRole.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, money);
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "age=" + age +
                ", money=" + money +
                '}';
    }

    public UserRole(int age, int money) {
        this.age = age;
        this.money = money;
    }

    public UserRole() {
    }
}
