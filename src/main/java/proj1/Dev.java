package proj1;

public class Dev extends Emp {
    private int codeLineCount;
    private boolean isUnitTesting;

    public int codeLineCount(){
        return codeLineCount;
    }

    public boolean isUnitTesting(){
        return isUnitTesting = true;
    }
    public void setCodeLineCount(int codeLineCount) {
        this.codeLineCount = codeLineCount;
    }
    public void setIsUnitTesting(boolean isUnitTesting) {
        this.isUnitTesting = isUnitTesting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

