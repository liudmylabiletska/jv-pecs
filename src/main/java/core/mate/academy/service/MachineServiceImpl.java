package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<T> type) {
        List<U> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            result.add(type.cast(new Bulldozer()));
        } else if (type == Excavator.class) {
            result.add(type.cast(new Excavator()));
        } else if (type == Truck.class) {
            result.add(type.cast(new Truck()));
        }
        return result;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        machines.forEach(machine -> machine.doWork());
    }
}
