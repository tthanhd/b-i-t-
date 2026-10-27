public class BankAccount {
    // 1. Khai báo thuộc tính với tầm truy cập private (Đảm bảo tính đóng gói)
    private String accountNumber;
    private String ownerName;
    private double balance;

    // 2. Constructor khởi tạo tài khoản
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (initialBalance < 0) {
            this.balance = 0.0;
            System.out.println("Lỗi: Số dư ban đầu không hợp lệ (< 0). Số dư đã được đặt mặc định bằng 0.");
        } else {
            this.balance = initialBalance;
        }
    }

    // 3. Phương thức nạp tiền (deposit)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công! Đã nạp: " + amount + " | Số dư hiện tại: " + balance);
        } else {
            System.out.println("Lỗi: Số tiền nạp phải lớn hơn 0.");
        }
    }

    // 4. Phương thức rút tiền (withdraw)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rút tiền thành công! Đã rút: " + amount + " | Số dư hiện tại: " + balance);
        } else {
            System.out.println("Lỗi: Số tiền rút không hợp lệ hoặc vượt quá số dư hiện tại.");
        }
    }

    // 5. Getter và Setter cho accountNumber (Cho phép đọc và ghi ở khắp mọi nơi)
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 6. Getter và Setter cho ownerName (Cho phép đọc và cập nhật thay đổi)
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // 7. Chỉ cung cấp Getter cho balance (Bảo mật tuyệt đối, không có Setter để tránh sửa đổi trực tiếp)
    public double getBalance() {
        return balance;
    }
}