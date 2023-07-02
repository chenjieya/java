public class LinkBox implements LinkInfter {

    private Node first;
    private Node last;
    private int size;



    public boolean add(int element) {
        Node l = last; // 最后的节点
        Node newNode = new Node(l, element, null);

        this.last = newNode;
        // 1. 判断最后得节点是否存在
        // 2. 存在则将新创建的给他的next
        // 3, 不存在，则说明链表是第一次使用，将创建的对象给first和last

        if (l == null) {
            this.first = newNode;
        }else{
            l.next = newNode;
        }
        size++;
        return true;
    }

    private boolean rangCheck(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("index不合法");
            return false;
        }
        return true;
    }

    private Node getObj(int index) {
        Node targetNode;
        if (index < (this.size >> 1)) {
            targetNode = first;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.next;
            }
        } else{
            targetNode = last;
            for (int i = size - 1;  i > index; i--) {
                targetNode = targetNode.prev;
            }
        }

        return targetNode;
    }

    public int get(int index) {
        // 1. 检查传递进来的index是否合法
        boolean flag = this.rangCheck(index);

        if (!flag) return 0;


        Node target = this.getObj(index);

        return target.item;
    }

    private int unLink(Node targetNode) {
        int oldVal = targetNode.item;

        Node prev = targetNode.prev;
        Node next = targetNode.next;

       if (prev == null) {
           first = next;
       } else if (next == null) {
           last = prev;
       } else {
           prev.next = next;
           next.prev = prev;

           targetNode.next = null;
           targetNode.prev = null;
       }

       size--;

        return oldVal;
    }

    public int remove(int index) {
        boolean flage = this.rangCheck(index);

        if (!flage) return 0;

        Node currentNode = this.getObj(index);

        int removeInt = this.unLink(currentNode);

        return removeInt;
    }

    public int size() {
        return 0;
    }
}
