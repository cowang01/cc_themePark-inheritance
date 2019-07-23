package behaviours;

import people.Visitor;

public interface ISecurity {

    boolean idAllowedTo(Visitor visitor);
}
