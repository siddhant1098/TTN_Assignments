package assignment.java2;
    class Q5_OjectCloning implements Cloneable {
        private String dname;

        public Q5_OjectCloning(String dname) {
            this.dname = dname;
        }

        public String getName() {

            return dname;
        }
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        public static void main(String[] args)
            {
                Q5_OjectCloning obj1 = new Q5_OjectCloning("SIDDHANT SHARMA");
                try {
                    Q5_OjectCloning obj2 = (Q5_OjectCloning) obj1.clone();
                    System.out.println(obj2.getName());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }

