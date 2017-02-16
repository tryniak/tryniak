
    public class Array {
        int arr[] = {3, 34, -5, -8, 6};

        private int maxElement() {
            int max = arr[0];
            int imax = 0;
            int i = 0;
            while (i < arr.length) {
                if (arr[i] > max) {
                    max = arr[i];
                    imax = i;
                }
                i++;
            }

            System.out.print("Maximum = " + max);
            System.out.println(" is in " + (imax + 1) + " place");
       return imax;
        }

        private int sumPossitive() {
            int sum = 0;
            int i = 0;
            while (i < arr.length) {
                if (arr[i] > 0){
                    sum +=arr[i];
                }
                    i++;

            }
                System.out.println("Summa positive numbers = " + sum);
                return sum;
            }

        private int amountNegatinAndPositiv() {
            int negative = 0;
            int possitive = 0;
            int i = 0;
            while (i < arr.length) {
                if (arr[i] > 0)
                    possitive++;
                else negative++;

            i++;}
        System.out.println("Amount negative = " + negative +  " \nAmount positive = " + possitive);
            return possitive;
        }

        public static void main(String[] args) {
            Array array = new Array();
            array.maxElement();
            array.sumPossitive();
            System.out.println(array.amountNegatinAndPositiv());
        }
    }

