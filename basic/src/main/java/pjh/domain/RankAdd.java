package pjh.domain;

import java.util.*;
import lombok.*;
import pjh.domain.*;
import pjh.infra.AbstractEvent;

@Data
@ToString
public class RankAdd extends AbstractEvent {

    private Long id;
    private String name;

    public RankAdd(Rank aggregate) {
        super(aggregate);
    }

    public RankAdd() {
        super();
    }
}
