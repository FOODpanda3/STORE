package ordersystem;


import ordersystem.login;


public class start {

    public static void main(String[] args) {
        // Create an instance of the class and invoke the method to show login form
        start app = new start();
        app.showLoginForm();
    }

    // Method to show the login form
    private void showLoginForm() {
        // Open the login form
        login loginForm = new login();
        loginForm.setVisible(true);
    }}