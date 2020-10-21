package model;

/**
 *
 * @author admin
 */
public class DaySo {
    private int[] daySo = null;
    private int length;
//    ArrayList 

    public int[] getDaySo() {
        return daySo;
    }

    public void setDaySo(int[] daySo) {
        this.daySo = daySo;
    }

    public DaySo() {
    }
    
    public DaySo(int ...a){
        this.daySo = a;
    }
    
    public long getGiaTriDaThuc(long x)
    {
        long Px = daySo[0];
        for(int i=1;i<daySo.length;i++)
        {
            int name = daySo[i];
            Px = Px*x + daySo[i];
        }
        return Px;
    }
    
    public void DungThuTuKhongDoiCho()
    {
        int minn = Integer.MAX_VALUE;
        int limit = 0;
        int pos = -1;
        int size = daySo.length;
        int[] daySoFake = null;
        daySoFake = daySo;
        while(size-- > 0)
        {
            for(int i=0;i<daySo.length;i++)
            {
                if(i<minn && i >= limit)
                {
                    minn = i;
                    
                }
            }
        }
    }
}
