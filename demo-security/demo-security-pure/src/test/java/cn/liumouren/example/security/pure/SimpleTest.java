package cn.liumouren.example.security.pure;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.junit.jupiter.api.Test;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Daniel Liu
 */
public class SimpleTest {


    class User extends Observable{
        public String name;

        public void setName(String name) {
            this.name = name;
            setChanged();
            notifyObservers();
        }
    }

    class Publisher implements Observer{

        @Override
        public void update(Observable o, Object arg) {
            User user = (User) o;
            System.out.println(user.name);
        }

    }

    @Test
    public void test02() {
        User user = new User();
        user.addObserver(new Publisher());
        user.setName("刘梁文");
    }
}
