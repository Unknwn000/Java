public class VariationMethods{
    int value;
    VariationMethods(int val){
        this.value=val;
    }
    void changebyvalue(int val){
        System.out.println("Value Before Call by value : "+val);
        val = val +50;
        System.out.println("Value After Call by value : "+val);

    }
    void changebyreference(VariationMethods vm){
        System.out.println("Value Before Call by Reference : "+vm.value);
        vm.value=vm.value+50;
        System.out.println("Value After Call by Reference : "+vm.value);

    }
    int returnvalue(int value){
        return value+50;

    }
    VariationMethods returnObject(VariationMethods vm){
        vm.value=vm.value+50;
        return vm;
    }
    public static void main(String[] args) {

        VariationMethods vm = new VariationMethods(10);
        vm.changebyvalue(vm.value);
        vm.changebyreference(vm);
        System.out.println("Returned Value : "+vm.returnvalue(vm.value));
        System.out.println("Returned Object : "+vm.returnObject(vm));
        

    }

}