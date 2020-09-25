package com.sysoiev.mapping.map;

public class Project {
    private int id;
    private String projectName;
    private String companyName;

    public Project() {
    }

    public Project(int id, String projectName, String companyName) {
        this.id = id;
        this.projectName = projectName;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
