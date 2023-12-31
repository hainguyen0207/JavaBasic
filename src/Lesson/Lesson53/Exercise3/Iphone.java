package Lesson.Lesson53.Exercise3;

public class Iphone extends Smartphone {
    private String os;
    private String madeIn;
    private int waranty;
    private String emei;
    private String modelNumber;

    protected Iphone() {
        os = "";
        madeIn = "";
        waranty = 0;
        emei = "";
        modelNumber = "";
    }

    public Iphone(String os, String madeIn, int waranty, String emei, String modelNumber) {
        this.os = os;
        this.madeIn = madeIn;
        this.waranty = waranty;
        this.emei = emei;
        this.modelNumber = modelNumber;
    }

    public Iphone(String name, String os, String madeIn, int waranty, String emei, String modelNumber) {
        super(name);
        this.os = os;
        this.madeIn = madeIn;
        this.waranty = waranty;
        this.emei = emei;
        this.modelNumber = modelNumber;
    }

    public Iphone(int serialNumber, String brand, String name, float weight, float batteryCapacity, float screenSize, String os, String madeIn, int waranty, String emei, String modelNumber) {
        super(serialNumber, brand, name, weight, batteryCapacity, screenSize);
        this.os = os;
        this.madeIn = madeIn;
        this.waranty = waranty;
        this.emei = emei;
        this.modelNumber = modelNumber;
    }

    public final String getOs() {
        return os;
    }

    public final void setOs(String os) {
        this.os = os;
    }

    public final String getMadeIn() {
        return madeIn;
    }

    public final void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public final int getWaranty() {
        return waranty;
    }

    public final void setWaranty(int waranty) {
        this.waranty = waranty;
    }

    public final String getEmei() {
        return emei;
    }

    public final void setEmei(String emei) {
        this.emei = emei;
    }

    public final String getModelNumber() {
        return modelNumber;
    }

    public final void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public void offScreen(boolean activated) {
        System.out.println(activated ? "iPhone đã tắt màn hình"
                : "iPhone hủy tắt màn hình");
    }

    @Override
    public void changeVolume(int amount) {
        var action = (amount < 0) ? "giảm" : "tăng";
        System.out.println("iPhone " + action + " âm lượng " + amount + "%");
    }

    @Override
    public void changeBrightness(int amount) {
        var action = (amount < 0) ? "giảm" : "tăng";
        System.out.println("iPhone " + action + " độ sáng " + amount + "%");
    }

    @Override
    public void connectPeripheral(String peripheral) {
        System.out.println("iPhone đang kết nối với " + peripheral);
    }

    @Override
    public void unlock(String method) {
        System.out.println("iPhone mở khóa bằng vân tay, mật khẩu và " + method);
    }

}
