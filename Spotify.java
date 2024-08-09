package com.xworkz.spotifyapp.spotifylogic;

public class Spotify {

    static String fullName;
    static String email;
    static long phone;
    static String pword;
    static String birth;
    static String gend;

    public static boolean createSpotifyAccount(String name, String emailId, long phoneNumber, String pwd, String dob, String gender) {
        boolean isSpotifyCreated = false;


        isSpotifyCreated = validateSpotifyAccount(name, emailId, phoneNumber, pwd, dob, gender);

        return isSpotifyCreated;

    }

    public static boolean validateSpotifyAccount(String name, String emailId, long phoneNumber, String pwd, String dob, String gender) {
        boolean isNameVaild = false;
        boolean isEmailIdValid = false;
        boolean isPhoneNumberValid = false;
        boolean isPasswordValid = false;
        boolean isdobValid = false;
        boolean isGenderValid = false;
        boolean isSpotifyValidated = false;

        if (name != null) {
            fullName = name;
            isNameVaild = true;
        } else
            System.out.println(" Name is Invalid");

        if (emailId != null) {
            email = emailId;
            isEmailIdValid = true;
        } else
            System.out.println(" Email is Invalid");

        if (phoneNumber != 0) {
            phone = phoneNumber;
            isPhoneNumberValid = true;
        } else
            System.out.println(" Phone number is Invalid");

        if (pwd != null) {
            pword = pwd;
            isPasswordValid = true;
        } else
            System.out.println(" Password is Invalid");

        if (dob != null) {
            birth = dob;
            isdobValid = true;
        } else
            System.out.println(" Birth is Invalid");
        if (gender != null) {
            gend = gender;
            isGenderValid = true;
        }

        if (isNameVaild && isEmailIdValid && isPhoneNumberValid && isPasswordValid && isdobValid && isGenderValid) {
            isSpotifyValidated = true;
        }
        return isSpotifyValidated;
    }

    public static void readSpotifyAccount() {

        System.out.println("Spotify registration");
        System.out.println("Name:" + fullName);
        System.out.println("Email Id:" + email);
        System.out.println("Phone number:" + phone);
        System.out.println("Password:" + pword);
        System.out.println("Date of birth:" + birth);
        System.out.println("Gender:" + gend);

    }
}
