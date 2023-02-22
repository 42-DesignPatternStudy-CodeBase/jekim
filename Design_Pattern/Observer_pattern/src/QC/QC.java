public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        // ToDo
    }
    public abstract int getNumber();
    public abstract void execute();
}

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    
    public int getNumber() {
        return number;
    }
    
    public void execute() {
           //ToDo
    }
}

public interface Observer {
    public abstract void update(NumberGenerator generator);
}

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
    // ToDo
    }
}