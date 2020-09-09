package com.company;

public class Ring {
    public int[] Ring_;
    public Ring(int N)
    {
        this.Ring_ = new int[N];
        for(int i = 0; i<N; i++)
        {
            this.Ring_[i] = 0;
        }
    }
    public void Add(int count, int N)
    {
        this.Ring_[count % this.Ring_.length] = N;
    }
    public String toString()
    {
        String Res = "";
        for(int i = 0; i<Ring_.length; i++)
        {
            Res = Res + this.Ring_[i]+" ";
        }
        return Res;

    }


}
