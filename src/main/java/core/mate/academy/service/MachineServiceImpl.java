package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService {
    private final List<Machine> allMachines = new ArrayList<>();

    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        List<Machine> result = new ArrayList<>();
        for (Machine machine : allMachines) {
            if (type.isInstance(machine)) {
                result.add(machine);
            }
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Class<? extends Machine> type) {
        // Додаємо 3 машини заданого типу
        for (int i = 0; i < 3; i++) {
            if (type.equals(Bulldozer.class)) {
                machines.add(new Bulldozer());
            } else if (type.equals(Excavator.class)) {
                machines.add(new Excavator());
            } else if (type.equals(Truck.class)) {
                machines.add(new Truck());
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
