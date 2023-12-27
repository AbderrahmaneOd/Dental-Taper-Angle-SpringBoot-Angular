package ma.projet.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A StudentPW.
 */
@Entity
@Table(name = "student_pw")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class StudentPW implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Lob
    @Column(name = "image_front")
    private byte[] imageFront;

    @Column(name = "image_front_content_type")
    private String imageFrontContentType;

    @Lob
    @Column(name = "image_side")
    private byte[] imageSide;

    @Column(name = "image_side_content_type")
    private String imageSideContentType;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "angle_interne_1")
    private Double angleInterne1;

    @Column(name = "angle_interne_2")
    private Double angleInterne2;

    @Column(name = "angle_externe_1")
    private Double angleExterne1;

    @Column(name = "angle_externe_2")
    private Double angleExterne2;

    @Column(name = "angledepouille_1")
    private Double angledepouille1;

    @Column(name = "angledepouille_2")
    private Double angledepouille2;

    @Column(name = "angle_convergence")
    private Double angleConvergence;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "user", "groupe" }, allowSetters = true)
    private Student student;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "tooth", "groupes" }, allowSetters = true)
    private PW pw;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public StudentPW id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImageFront() {
        return this.imageFront;
    }

    public StudentPW imageFront(byte[] imageFront) {
        this.setImageFront(imageFront);
        return this;
    }

    public void setImageFront(byte[] imageFront) {
        this.imageFront = imageFront;
    }

    public String getImageFrontContentType() {
        return this.imageFrontContentType;
    }

    public StudentPW imageFrontContentType(String imageFrontContentType) {
        this.imageFrontContentType = imageFrontContentType;
        return this;
    }

    public void setImageFrontContentType(String imageFrontContentType) {
        this.imageFrontContentType = imageFrontContentType;
    }

    public byte[] getImageSide() {
        return this.imageSide;
    }

    public StudentPW imageSide(byte[] imageSide) {
        this.setImageSide(imageSide);
        return this;
    }

    public void setImageSide(byte[] imageSide) {
        this.imageSide = imageSide;
    }

    public String getImageSideContentType() {
        return this.imageSideContentType;
    }

    public StudentPW imageSideContentType(String imageSideContentType) {
        this.imageSideContentType = imageSideContentType;
        return this;
    }

    public void setImageSideContentType(String imageSideContentType) {
        this.imageSideContentType = imageSideContentType;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public StudentPW date(LocalDate date) {
        this.setDate(date);
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAngleInterne1() {
        return this.angleInterne1;
    }

    public StudentPW angleInterne1(Double angleInterne1) {
        this.setAngleInterne1(angleInterne1);
        return this;
    }

    public void setAngleInterne1(Double angleInterne1) {
        this.angleInterne1 = angleInterne1;
    }

    public Double getAngleInterne2() {
        return this.angleInterne2;
    }

    public StudentPW angleInterne2(Double angleInterne2) {
        this.setAngleInterne2(angleInterne2);
        return this;
    }

    public void setAngleInterne2(Double angleInterne2) {
        this.angleInterne2 = angleInterne2;
    }

    public Double getAngleExterne1() {
        return this.angleExterne1;
    }

    public StudentPW angleExterne1(Double angleExterne1) {
        this.setAngleExterne1(angleExterne1);
        return this;
    }

    public void setAngleExterne1(Double angleExterne1) {
        this.angleExterne1 = angleExterne1;
    }

    public Double getAngleExterne2() {
        return this.angleExterne2;
    }

    public StudentPW angleExterne2(Double angleExterne2) {
        this.setAngleExterne2(angleExterne2);
        return this;
    }

    public void setAngleExterne2(Double angleExterne2) {
        this.angleExterne2 = angleExterne2;
    }

    public Double getAngledepouille1() {
        return this.angledepouille1;
    }

    public StudentPW angledepouille1(Double angledepouille1) {
        this.setAngledepouille1(angledepouille1);
        return this;
    }

    public void setAngledepouille1(Double angledepouille1) {
        this.angledepouille1 = angledepouille1;
    }

    public Double getAngledepouille2() {
        return this.angledepouille2;
    }

    public StudentPW angledepouille2(Double angledepouille2) {
        this.setAngledepouille2(angledepouille2);
        return this;
    }

    public void setAngledepouille2(Double angledepouille2) {
        this.angledepouille2 = angledepouille2;
    }

    public Double getAngleConvergence() {
        return this.angleConvergence;
    }

    public StudentPW angleConvergence(Double angleConvergence) {
        this.setAngleConvergence(angleConvergence);
        return this;
    }

    public void setAngleConvergence(Double angleConvergence) {
        this.angleConvergence = angleConvergence;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentPW student(Student student) {
        this.setStudent(student);
        return this;
    }

    public PW getPw() {
        return this.pw;
    }

    public void setPw(PW pW) {
        this.pw = pW;
    }

    public StudentPW pw(PW pW) {
        this.setPw(pW);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StudentPW)) {
            return false;
        }
        return getId() != null && getId().equals(((StudentPW) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "StudentPW{" +
            "id=" + getId() +
            ", imageFront='" + getImageFront() + "'" +
            ", imageFrontContentType='" + getImageFrontContentType() + "'" +
            ", imageSide='" + getImageSide() + "'" +
            ", imageSideContentType='" + getImageSideContentType() + "'" +
            ", date='" + getDate() + "'" +
            ", angleInterne1=" + getAngleInterne1() +
            ", angleInterne2=" + getAngleInterne2() +
            ", angleExterne1=" + getAngleExterne1() +
            ", angleExterne2=" + getAngleExterne2() +
            ", angledepouille1=" + getAngledepouille1() +
            ", angledepouille2=" + getAngledepouille2() +
            ", angleConvergence=" + getAngleConvergence() +
            "}";
    }
}
