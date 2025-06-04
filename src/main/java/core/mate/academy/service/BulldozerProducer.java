package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.Arrays;
import java.util.List;

public class git add src/main/java/core/mate/academy/service/producer/BulldozerProducer.java
BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(new Bulldozer(), new Bulldozer(), new Bulldozer());
    }
}
