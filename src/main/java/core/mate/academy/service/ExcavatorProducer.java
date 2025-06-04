package core.mate.academy.service.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        // Обираємо варіант із трьома екскаваторами, щоб повернути більше об'єктів
        return Arrays.asList(new Excavator(), new Excavator(), new Excavator());
    }
}
