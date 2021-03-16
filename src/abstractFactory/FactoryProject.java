package abstractFactory;

import banking.BankingTeamFactory;
import website.WebsiteTeamFactory;

public class FactoryProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        ProjectTeamFactory projectTeamFactory1 = new WebsiteTeamFactory();
        Developer developer1 = projectTeamFactory1.getDeveloper();
        Tester tester1 = projectTeamFactory1.getTester();
        Manager manager1 = projectTeamFactory1.getManager();

        System.out.println(" Creating bank system");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();

        System.out.println("Create website");
        developer1.writeCode();
        tester1.testCode();
        manager1.manageProject();

    }
}
