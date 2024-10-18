// Giao diện tín hiệu chung
interface signal {
    // Phương thức khởi tạo tín hiệu
    void initialize();
    
    // Phương thức phân tích tín hiệu
    void analyze();
    
    // Phương thức hiển thị thông tin tín hiệu
    void displayInfo();
    }
    
    // Lớp tín hiệu rời rạc kế thừa giao diện Signal
    class DiscreteSignal implements signal {
    private int[] values; // Lưu trữ giá trị rời rạc
    
    // Khởi tạo tín hiệu rời rạc với các giá trị
    public DiscreteSignal(int[] values) {
    this.values = values;
    }
    
    @Override
    public void initialize() {
    System.out.println("Initializing Discrete Signal...");
    // Thực hiện các bước khởi tạo tín hiệu rời rạc
    }
    
    @Override
    public void analyze() {
    System.out.println("Analyzing Discrete Signal...");
    // Phân tích tín hiệu rời rạc
    }
    
    @Override
    public void displayInfo() {
    System.out.print("Discrete Signal Values: ");
    for (int value : values) {
    System.out.print(value + " ");
    }
    System.out.println();
    }
    }
    
    // Lớp tín hiệu liên tục kế thừa giao diện Signal
    class ContinuousSignal implements signal {
    private double frequency; // Tần số tín hiệu
    
    // Khởi tạo tín hiệu liên tục với tần số
    public ContinuousSignal(double frequency) {
    this.frequency = frequency;
    }
    
    @Override
    public void initialize() {
    System.out.println("Initializing Continuous Signal...");
    // Thực hiện các bước khởi tạo tín hiệu liên tục
    }
    
    @Override
    public void analyze() {
    System.out.println("Analyzing Continuous Signal...");
    // Phân tích tín hiệu liên tục
    }
    
    @Override
    public void displayInfo() {
    System.out.println("Continuous Signal Frequency: " + frequency + " Hz");
    }
    }
