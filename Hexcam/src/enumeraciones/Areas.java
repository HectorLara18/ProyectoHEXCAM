package enumeraciones;

public enum Areas {
    DEVELOPMENT("New Projects"),
    QA("Testing"),
    DEVOPS("Production");

    private final String gitHUB;

    Areas(String gitHUB){
        this.gitHUB = gitHUB;
    }

    public String getGitHUB() {
        return gitHUB;
    }
}
