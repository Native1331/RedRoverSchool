package ПройденныеУроки;

import java.lang.module.ModuleDescriptor;

public class Uravnenie {
    int param;
    int param1;
    String  param2;
    int param3;
    Double param4;

    public Uravnenie(int param, int param1, String param2, int param3, Double param4) {
        this.param = param;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    public ModuleDescriptor.Builder setParam(int param) {
        this.param = param;
    }
    public ModuleDescriptor.Builder setStringParam(String param2) {
        this.param2 = param;
        return this;
    }
    public Builder setIntParam(int param) {
        this.param3 = param;
        return this;
    }
    public Builder setDoubleParam(Double param) {
        this.param4 = param;
        return this;
    }
    public  Uravnenie build(){
        if (param2 == null)
            return new Uravnenie(param, param2:"aaaaaaa", param3, param4);
        return  new Uravnenie(param, param2, param3, param4);
    }
    @Override;
    public String toString() {
        return "Uravnenie {" +
                "param" +param+
                ", param2 = "+param2 +'\"+
                ", param3 = "+param3 +
                ", param4 = "+param4 +
                '}' ;
    }



}
