/**
 * Created by Администратор on 08.02.2017.
 */
public class StorageCell {

    private double value;

    public StorageCell() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    void clear()
    {
        this.setValue(0);
    }// очистка памяти

    double increaseValue(double value)
    {
        this.setValue(this.getValue()+value);
        return this.getValue();
    }// увеличение значения в памяти
    double reduceValue(double value)
    {
        this.setValue(this.getValue()-value);
        return this.getValue();
    }// уменьшение значения в памяти


}
