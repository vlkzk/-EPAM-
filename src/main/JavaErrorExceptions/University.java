import Faculties.FacultiesParameters;

import java.util.List;

public class University {
    private List<? extends FacultiesParameters> facultiesParameters;

    @Override
    public String toString() {
        return "University{" +
                "facultiesParameters=" + facultiesParameters +
                '}';
    }

    public List<? extends FacultiesParameters> getStudents() {
        return facultiesParameters;
    }

    public University(List<? extends FacultiesParameters> facultiesParameters) {
        this.facultiesParameters = facultiesParameters;
    }
}
