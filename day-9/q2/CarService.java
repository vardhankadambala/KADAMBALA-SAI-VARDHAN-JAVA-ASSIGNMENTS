package com.ey.q2;

import java.util.List;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public interface CarService {
	public double sumOfPrices(List<Car> carList);
	public List<String> getCarNames(List<Car> carList);
	public Set<String> getCarMakers(List<Car> carList);
	//returns price of the car which has highest price
	public double getHighPricedCar(List<Car> carList);
	//returns Car which has lowest price
	public Car getCarWithLowPricedCar(List<Car> carList);

}
class CarServiceimp implements CarService{

	@Override
	public double sumOfPrices(List<Car> carList) {
		// TODO Auto-generated method stub
		return carList.stream().mapToDouble(Car::getPrice).sum();
	}

	@Override
	public List<String> getCarNames(List<Car> carList) {
		// TODO Auto-generated method stub
		return carList.stream().map(Car::getCarName).collect(Collectors.toList());
	}

	@Override
	public Set<String> getCarMakers(List<Car> carList) {
		
		return carList.stream().map(Car::getCareMake).collect(Collectors.toSet());
	}

	@Override
	public double getHighPricedCar(List<Car> carList) {
		// TODO Auto-generated method stub
		return carList.stream().mapToDouble(Car::getPrice).max().orElse(0);
	}

	@Override
	public Car getCarWithLowPricedCar(List<Car> carList) {
		// TODO Auto-generated method stub
		return carList.stream().min((car1,car2)->Double.compare(car1.getPrice(), car2.getPrice())).orElse(null);
	}
	
}
