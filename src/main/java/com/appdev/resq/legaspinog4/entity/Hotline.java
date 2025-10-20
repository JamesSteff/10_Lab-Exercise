package com.appdev.resq.legaspinog4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotlineID;
    private String hotlineName;
    private String hotlineNumber;
    private String hotlineDescription;

    /**
     * Default constructor required by JPA.
     *
     * This constructor is intentionally empty. It is used by the persistence
     * framework (Jakarta Persistence / Hibernate) to instantiate objects via
     * reflection when loading entities from the database.
     */
    public Hotline() {
        // Intentionally empty - required by JPA/Hibernate for entity instantiation via reflection.
    }

    public Long getHotlineID() { return hotlineID; }
    public void setHotlineID(Long hotlineID) { this.hotlineID = hotlineID; }

    public String getHotlineName() { return hotlineName; }
    public void setHotlineName(String hotlineName) { this.hotlineName = hotlineName; }

    public String getHotlineNumber() { return hotlineNumber; }
    public void setHotlineNumber(String hotlineNumber) { this.hotlineNumber = hotlineNumber; }

    public String getHotlineDescription() { return hotlineDescription; }
    public void setHotlineDescription(String hotlineDescription) { this.hotlineDescription = hotlineDescription; }
}
