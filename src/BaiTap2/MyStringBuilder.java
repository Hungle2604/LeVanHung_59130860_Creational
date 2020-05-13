/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

public class MyStringBuilder 
{
    String chuoi = "";

    public MyStringBuilder() 
    {
    }

    protected MyStringBuilder(Builder builder) 
    {
        this.chuoi = builder.chuoi;
    }

    public  static class Builder
    {
        String chuoi = "";
        
        public Builder addString(String s)
        {
            this.chuoi += s;
            return this;
        }
        
        public Builder addFloat(float s)
        {
            this.chuoi += String.valueOf(s);
            return this;
        }
        
        public Builder addBool(boolean s)
        {
            this.chuoi += String.valueOf(s);
            return this;
        }
        
        public MyStringBuilder Builder()
        {
            return new MyStringBuilder(this);
        }
    } 
    @Override
    public String toString() 
    {
        return "Day La:  MyStringBuilder: "  
                + "\n" + chuoi ;
    }
    

}