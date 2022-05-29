package pl.edu.uj.javaframe;

public class ImaginaryInt extends Int{
    Int imaginaryPart;
    @Override
    public Value create(String val) { // 126i666i34 12 5
        String[] reim = val.split("i");
        this.value = super.create((reim[0])).value;
        if(reim.length == 2){
            imaginaryPart = (Int) new Int().create(reim[1]);
        }
        else{
            imaginaryPart = (Int) new Int().create("0");

        }
        return this;

    }
    @Override
    public Value add(Value v) {
        ImaginaryInt result = new ImaginaryInt();
        ImaginaryInt other = (ImaginaryInt) new ImaginaryInt().create(v.toString());
        result.value = (Integer)this.value + Integer.valueOf(v.value.toString());
        result.imaginaryPart = (Int) imaginaryPart.add(other.imaginaryPart);

        return result;
    }
    @Override
    public String toString()
    {
        String string = this.value.toString() + "i" + this.imaginaryPart.toString();
        return string;
    }
}
