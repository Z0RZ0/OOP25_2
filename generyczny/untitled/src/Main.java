public class Main {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();

        //list.getFirst()
        //list.getLast();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(0);
        list.add(3);

        list.addFirst(1000);
        list.addLast(-10);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("Usuwam: "+list.removeFirst());
        System.out.println("Usuwam: "+list.removeLast());

        System.out.println("First: "+list.getFirst());
        System.out.println("Last: "+list.getLast());
        System.out.println("Rozmiar listy: "+list.size());

        System.out.println("List[0]: "+list.get(0));
        System.out.println("List[3]: "+list.get(3));
        System.out.println("List[2]: "+list.get(2));

        for(Integer i : list){
            System.out.println(i);
        }

    }
}