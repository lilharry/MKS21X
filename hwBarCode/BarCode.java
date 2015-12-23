public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static final String[]arr = {"||:::",":::||","::|:|","::||:",
					":|::|",":|:|:",":||::","|:::|",
					"|::|:","|:|::"};
    
    //constructors
    public BarCode(String zip){
	try{
	    Integer.parseInt(zip);
	    
	    if (zip.length() != 5){
		throw new RuntimeException("Zip needs 5 digits");
	    }
	}catch (NumberFormatException e){
	    throw new NumberFormatException("Please use a valid int");
	}
	_zip = zip;
	_checkDigit = checkSum();
    }
    public BarCode(BarCode x){
        _zip = x._zip;
	_checkDigit = x._checkDigit;
    }

    private int checkSum(){
	int sum = 0;
	for (int i = 0; i < _zip.length(); i++){
	    sum += Integer.parseInt(_zip.charAt(i) + "");
	}
	return sum % 10;
    }

    public String toString(){
	String intcode = _zip + _checkDigit;
	String ans = "";
	for (int i = 0; i < intcode.length(); i++){
	    ans += arr[Integer.parseInt(intcode.charAt(i) + "")];
	}
	return "|" + ans + "|";
	
    }

    public boolean equals(Object other){
	return this == other || other instanceof BarCode && _zip.equals(((BarCode)other)._zip);
    }
    

    public int compareTo(Object other){
	if (other instanceof BarCode) {
	    (_zip+_checkDigit).compareTo(((BarCode)other)._zip+
					 ((BarCode)other)._checkDigit);
	}
	return toString().compareTo(other.toString());
    }
}
	
    

    
		
	
