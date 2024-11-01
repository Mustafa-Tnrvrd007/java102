package Gun3.Ders3GenericClasses;

public class Test <T1 , T2 ,T3 >{

    private T1 obje1;
    private T2 obje2;
    private T3 obje3;

    public Test(T1 obje1 , T2 obje2 , T3 obje3){
        this.obje1 = obje1;
        this.obje2=obje2;
        this.obje3=obje3;
    }

    public void showInfo(){
        System.out.println("obje1 = " + obje1+" Type : "+obje1.getClass().getSimpleName());
        System.out.println("obje2 = " + obje2+" Type : "+obje2.getClass().getSimpleName());
        System.out.println("obje3 = " + obje3+" Type : "+obje3.getClass().getSimpleName());
    }





    public T1 getObje1(){
        return this.obje1;
    }
    public void setObje1 (T1 Obje1){
        this.obje1=obje1;
    }
    public T2 getObje2(){
        return this.obje2;
    }
    public void setObje2 (T2 Obje2){
        this.obje2=obje2;
    }
    public T3 getObje3(){
        return this.obje3;
    }
    public void setObje3 (T3 Obje3){
        this.obje3=obje3;
    }

}
