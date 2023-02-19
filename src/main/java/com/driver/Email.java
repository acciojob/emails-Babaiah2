package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){

        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(password)){
            if(isValid(newPassword)){
                System.out.println("Password changed successfully");
                this.password = newPassword;
            }
            else{
                System.out.println("The new password is not valid");
            }
        }
        else{
            System.out.println("The old password and current password are not same");
        }

    }
    private boolean isValid(String password){
        boolean lowerCase = false;
        boolean upperCase = false;
        //boolean length=false;
        boolean digit = false;
        boolean special =false;

        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);

            if(ch>='a' && ch <='z'){
                lowerCase= true;
            }

            else if(ch>='A' && ch <= 'Z'){
                upperCase=true;
            }
            else if(ch>='0' && ch<= '9'){
                digit = true;
            }
            else{
                special = true;
            }
        }
        if(lowerCase && upperCase && digit && special && (password.length()>=8)){
            return true;
        }
        return false;

    }
}
