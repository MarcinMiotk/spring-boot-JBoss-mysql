package mami.springbootonjboss.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="recordings")
public class Recording {

    @Id
    private Long id;

    @Column(name="VPABX_ID")
    private Long vpabxId;

    @Column(name="NAME")
    private String name;

    @Override
    public String toString() {
        return "Recording: "+id+" "+vpabxId+" "+name;
    }
}
