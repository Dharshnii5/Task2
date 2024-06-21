
    public static void main(String[] args){
        class Accountbalance {
        private double balance;

    public Accountbalance() {
            this.balance =0;
        }

    public Accountbalance(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            this.balance+= amount;
        }

        public void withdraw(double amount) {
            if (this.balance >= amount ) {
                this.balance-=amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }

        public double getBalance() {
            return balance;

        }

    }
Accountbalance account= new Accountbalance(1000);
        account.deposit(500); // deposit amount
        account.withdraw(300); // withdraw amount
        System.out.println("Current balance:"+ account.getBalance());//display balance
}


