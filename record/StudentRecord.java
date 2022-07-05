package record;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Objects;

public record StudentRecord(@Size(min = 2, max = 20) String name, @Min(18) int age) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentRecord that = (StudentRecord) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
