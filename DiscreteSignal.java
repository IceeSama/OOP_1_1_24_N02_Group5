// Lớp tín hiệu rời rạc
class DiscreteSignal {
    private int[] values; // Lưu trữ các giá trị tín hiệu rời rạc
    
    // Khởi tạo tín hiệu rời rạc với mảng giá trị
    public DiscreteSignal(int[] values) {
    this.values = values;
    }
    
    // Tính giá trị tín hiệu x(n) dựa trên định nghĩa [1]
    public int calculate(int n) {
    int sum = 0;
    for (int k = 0; k < values.length; k++) {
    sum += values[k] * delta(n - k);
    }
    return sum;
    }
    
    // Hàm xung đơn vị δ(n)
    private int delta(int n) {
    return n == 0 ? 1 : 0;
    }
    
    // Phương thức hiển thị các giá trị tín hiệu
    public void displaySignal() {
    System.out.print("Discrete Signal Values: ");
    for (int value : values) {
    System.out.print(value + " ");
    }
    System.out.println();
    }
    }
    