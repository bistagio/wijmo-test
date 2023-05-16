package pjh.domain;

import java.util.*;
import lombok.*;
import pjh.domain.*;
import pjh.infra.AbstractEvent;

@Data
@ToString
public class DepartmentAdd extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmentAdd(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdd() {
        super();
    }
}
