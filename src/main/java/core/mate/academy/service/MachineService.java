package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService {
    List<? extends Machine> getAll(Class<? extends Machine> type);

    void fill(List<? super Machine> machines, Class<? extends Machine> type);

    void startWorking(List<? extends Machine> machines);
}
