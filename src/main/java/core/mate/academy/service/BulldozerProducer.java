package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import java.util.List;
import java.util.ArrayList;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        // Provide dummy data or fetch actual data
        return new ArrayList<>();
    }
}