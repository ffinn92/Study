package adapterPatternWorkOut;

public class PowerRack implements LowerBody {

    @Override
    public void workOut(Integer Height, String WorkOutType) {
        if(Height == 4){
            System.out.println(Height+"칸으로"+" "+"변경하면"+" "+WorkOutType+"를 할수 있어!");
        }else if(Height == 10){
            System.out.println(Height+"칸으로"+" "+"변경하면"+" "+WorkOutType+"를 할수 있어!");
        }else if(Height == 13){
            System.out.println(Height+"칸으로"+" "+"변경하면"+" "+WorkOutType+"를 할수 있어!");
        }
    }
}
