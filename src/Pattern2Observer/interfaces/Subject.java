package Pattern2Observer.interfaces;

public interface Subject {
    void registerObserver(Observer o);  //Регистрация наблюдателей
    void deleteObserver(Observer o);    //Удаление наблюдателей
    void notifyObservers();             //Обновление наблюдателей
}
