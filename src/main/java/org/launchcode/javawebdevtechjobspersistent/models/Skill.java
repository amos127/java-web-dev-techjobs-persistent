package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    public Skill(String description) {
        this.description = description;
    }

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill() { }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void addJob(Job job) {
        this.jobs.add(job);
    }
}