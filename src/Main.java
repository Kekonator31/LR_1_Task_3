class UserAccount{
    private String password = "password";

    void changePassword(String oldPassword, String newPassword){
        if(oldPassword.equals(password)){
            password = newPassword;
            System.out.println("Password changed");
        }
        else{
            System.out.println("Wrong old password");
        }
    }

    void validatePassword(String password){
        if(password.equals(this.password)){
            System.out.println("Password \"" + password + "\" valid");
        }
        else{
            System.out.println("Entered wrong password");
        }
    }

}


public class Main {
    public static void main(String[] args) {

        UserAccount user = new UserAccount();

        user.validatePassword("password");
        user.changePassword("Password", "THEPassword");
        user.password = "NewPass";
        user.changePassword("password", "THEPassword");
        user.validatePassword("tHEPassword");

    }
}