public class main {
    public static void main(String[] args) {
        // Tạo tài khoản mới với số dư ban đầu hợp lệ
        BankAccount myAccount = new BankAccount("STK123456", "Nguyen Van A", 1000.0);

        // Nạp tiền
        myAccount.deposit(500.0);

        // Rút tiền hợp lệ
        myAccount.withdraw(200.0);

        // Rút tiền vượt quá số dư
        myAccount.withdraw(2000.0);

        // Sử dụng Getter/Setter
        System.out.println("Chủ tài khoản mới: " + myAccount.getOwnerName());
        myAccount.setOwnerName("Tran Thi B");
        System.out.println("Cập nhật chủ tài khoản thành: " + myAccount.getOwnerName());
        
        // Kiểm tra số dư qua Getter
        System.out.println("Số dư cuối cùng: " + myAccount.getBalance());
    }
}