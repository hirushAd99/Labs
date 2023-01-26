public class exCast {
    Object data;
    public exCast(Object data)
    {
        this.data = data;
    }
    public Object getData(){
        return data;
    }

    public static void main(String[] args) {
        exCast intCast = new exCast(42);
        exCast strCast = new exCast("hi");
        int x = (Integer) strCast.getData();
        intCast = strCast;
        // Equalising the intCast variable to strCast then the error occur at compile time.
    }
}

