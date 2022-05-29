package pl.edu.uj.javaframe;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class ImaginaryDouble extends MyDouble{

    MyDouble imaginaryPart;
    @Override
    public Value create(String val) { // 126i666i34 12 5
        String[] reim = val.split("i");
        this.value = super.create((reim[0])).value;
        if(reim.length == 2){
            imaginaryPart = (MyDouble) new MyDouble().create(reim[1]);
        }
        else{
            imaginaryPart = (MyDouble) new MyDouble().create("0");

        }
        return this;

    }
    @Override
    public Value add(Value v) {
        ImaginaryDouble result = new ImaginaryDouble();
        ImaginaryDouble other = (ImaginaryDouble) new ImaginaryDouble().create(v.toString());
        result.value = (Double)this.value + Double.valueOf(v.value.toString());
        result.imaginaryPart = (MyDouble) imaginaryPart.add(other.imaginaryPart);

        return result;
    }
    @Override
    public String toString()
    {
     String string = this.value.toString() + "i" + this.imaginaryPart.toString();
     return string;
    }

}
