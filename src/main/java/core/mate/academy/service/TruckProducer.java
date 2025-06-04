package core.mate.academy.service.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        // Повертаємо список з трьох вантажівок
        return Arrays.asList(new Truck(), new Truck(), new Truck());
    }
}
