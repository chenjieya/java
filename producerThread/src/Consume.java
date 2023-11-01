    /**
     * 消费者
     */
    public class Consume extends Thread {

        private Warehouse house;
        public  Consume(Warehouse house) {
            this.house = house;
        }

        public void run() {
            while(true) {
                house.get();
                System.out.println("消费者拿出来一个元素");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
