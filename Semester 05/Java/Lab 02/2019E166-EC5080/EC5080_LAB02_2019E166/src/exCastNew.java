public class exCastNew<EX> {
    //EX is a data type. Constructor only take the EX type objects.
    EX data;
    public exCastNew(EX data){
        this.data = data;
    }
    public EX getData()
    {
        return data;
    }



    public static void main(String[] args) {
        exCastNew<Integer> intCastNew = new exCastNew<Integer>(42);
        int xNew = intCastNew.getData();

        exCastNew<String> strCastNew = new exCastNew<String>("Hi");
        String s = strCastNew.getData();


    }
}
