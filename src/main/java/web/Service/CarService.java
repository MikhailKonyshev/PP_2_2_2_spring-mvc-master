package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCarsList();
    public List<Car> getCars(List<Car> cars,Integer count);
}
