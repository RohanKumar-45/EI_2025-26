package grid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TerrainComposite implements TerrainComponent {
    private final List<TerrainComponent> components = new ArrayList<>();

    public TerrainComposite add(TerrainComponent component) {
        components.add(component);
        return this;
    }

    public List<TerrainComponent> getComponents() {
        return Collections.unmodifiableList(components);
    }

    @Override
    public boolean blocks(int x, int y) {
        for (TerrainComponent component : components) {
            if (component.blocks(x, y)) {
                return true;
            }
        }
        return false;
    }
}


