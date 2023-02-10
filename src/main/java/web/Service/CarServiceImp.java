package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private static int idCount;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++idCount, "BMW1", "black"));
        cars.add(new Car(++idCount, "BMW2", "yellow"));
        cars.add(new Car(++idCount, "BMW3", "blue"));
        cars.add(new Car(++idCount, "BMW4", "white"));
        cars.add(new Car(++idCount, "BMW5", "green"));

    }

    public List<Car> getCarsList() {
        return cars;
    }

    @Override
    public List<Car> getCars(List<Car> cars, Integer count) {
        if (count <= 0 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
