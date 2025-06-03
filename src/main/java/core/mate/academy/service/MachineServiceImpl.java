package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        List<Machine> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            result.add(new Bulldozer());
        } else if (type == Excavator.class) {
            result.add(new Excavator());
        } else if (type == Truck.class) {
            result.add(new Truck());
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
