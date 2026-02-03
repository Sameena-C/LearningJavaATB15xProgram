package ex_24_ENUM;

public class Lab200_ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_CODE.RED.getHexcode());
    }
}

//Automation we have to store the hex code - colors

enum HEX_CODE{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    HEX_CODE(String hexcode){
        this.hexcode = hexcode;
    }

    String getHexcode(){
        return this.hexcode;

    }
}
