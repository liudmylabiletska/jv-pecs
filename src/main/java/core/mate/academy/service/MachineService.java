package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService<T extends Machine> {
    <U extends T> List<U> getAll(Class<U> type);

    void fill(List<? super T> machines, T value);

    void startWorking(List<? extends T> machines);
}




