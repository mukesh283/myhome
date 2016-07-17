package com.flp.ems.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
private static Pattern NamePtrn = Pattern.compile("[a-zA-Z0-9]+");//name pattern
private static Pattern Emailptrn= Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");//Email pattern

public static boolean validateName(String userName){
    Matcher mtch =NamePtrn.matcher(userName);
    if(mtch.matches()){
        return true;
    }
    return false;
}

public static boolean validateEmail(String userEmail){
    Matcher mtch =Emailptrn.matcher(userEmail);
    if(mtch.matches()){
        return true;
    }
    return false;
}
/*public static boolean validatePhnNo(String userPhn){
    Matcher mtch =Emailptrn.matcher(userPhn);
    if(mtch.matches()){
        return true;
    }
    return false;*/


	}


