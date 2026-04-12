package Tema8.Exercise10;

public class TestRunnerMain {
    public static void main(String[] args) {
        TestCase[] tests = {
                new LoginTest("Login with valid credentials"),
                new LoginTest("Login with invalid password"),
                new SearchTest("Search for existing product"),
                new SearchTest("Search for missing product")
        };
        for (TestCase test : tests) {
            test.runTest();
            System.out.println("**********");
        }
    }
}
