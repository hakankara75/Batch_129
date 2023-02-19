package main.batch_129.projects.hospital;

public class PatienceAndDoctor {
    private String title;
    private String cases;
    private boolean urgency;
    
    public void PatDoc(){
       this.title=title;
       this.cases=cases;
       this.urgency=urgency;
    }
    public void PathDoc(){
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public boolean isUrgency() {
        return urgency;
    }

    public void setUrgency(boolean urgency) {
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "PatienceAndDoctor{" +
                "title='" + title + '\'' +
                ", cases='" + cases + '\'' +
                ", urgency=" + urgency +
                '}';
    }
}
