package org.launchcode.javawebdevtechjobspersistent.models;

import org.launchcode.javawebdevtechjobspersistent.models.data.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, Skill someSkill) {
        super();
        this.employer = anEmployer;
        this.skills.add(someSkill);
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
