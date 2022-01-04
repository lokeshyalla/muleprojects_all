package com.proj;
public class sample {public static String welcome(String name) {
return "Welcome to MuleSoft "+ name;
}
public String getBalance(String bankName) {
if(bankName.equals("HDFC")) {
return "1000";
}
else if(bankName.equals("SBI")) {
return "2000";
}
else {
return "Bank doesn't exist";
}
}
}


