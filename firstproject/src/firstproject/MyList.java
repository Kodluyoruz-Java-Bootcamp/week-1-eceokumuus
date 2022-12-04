package firstproject;

public class MyList {

	private String[] arr;
    private int lastIndex = 0;

    public MyList(){
        this.arr = new String[5];
    }

    public void add(String element){
        if(element.startsWith("C")){
            this.arr[lastIndex++] = element;
            if(lastIndex == this.arr.length){
                extend();
            }
        }
    }

    public void print(){
        String word = "";
        for (String s: this. arr){
            if (s != null){
                word += s + ",";
            }
        }

        System.out.println("[" + word.substring(0, word.length()-1) + "]");
    }

    private void extend(){
        String[] newList = new String[this.arr.length + 7];

        for (int i = 0; i<this.arr.length; i++){
            newList[i] = this.arr[i];
        }

        this.arr = newList;
    }

    public int size(){
        return this. arr.length;
    }
    
    public static void main(String[] args) {
    	MyList liste = new MyList();
    	
    	liste.add("Can");
    	liste.add("Ali");
    	liste.add("Cenk");
    	liste.add("Ece");
    	liste.add("Cem");
    	
    	System.out.println(liste.size());
    	liste.print();
    	
    }

}
