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

    @Column(name = "angle_interne_g")
    private Double angleInterneG;

    @Column(name = "angle_interne_d")
    private Double angleInterneD;

    @Column(name = "angle_externe_g")
    private Double angleExterneG;

    @Column(name = "angle_externe_d")
    private Double angleExterneD;

    @Column(name = "angledepouille_g")
    private Double angledepouilleG;

    @Column(name = "angledepouille_d")
    private Double angledepouilleD;

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

    public Double getAngleInterneG() {
        return this.angleInterneG;
    }

    public StudentPW angleInterneG(Double angleInterneG) {
        this.setAngleInterneG(angleInterneG);
        return this;
    }

    public void setAngleInterneG(Double angleInterneG) {
        this.angleInterneG = angleInterneG;
    }

    public Double getAngleInterneD() {
        return this.angleInterneD;
    }

    public StudentPW angleInterneD(Double angleInterneD) {
        this.setAngleInterneD(angleInterneD);
        return this;
    }

    public void setAngleInterneD(Double angleInterneD) {
        this.angleInterneD = angleInterneD;
    }

    public Double getAngleExterneG() {
        return this.angleExterneG;
    }

    public StudentPW angleExterneG(Double angleExterneG) {
        this.setAngleExterneG(angleExterneG);
        return this;
    }

    public void setAngleExterneG(Double angleExterneG) {
        this.angleExterneG = angleExterneG;
    }

    public Double getAngleExterneD() {
        return this.angleExterneD;
    }

    public StudentPW angleExterneD(Double angleExterneD) {
        this.setAngleExterneD(angleExterneD);
        return this;
    }

    public void setAngleExterneD(Double angleExterneD) {
        this.angleExterneD = angleExterneD;
    }

    public Double getAngledepouilleG() {
        return this.angledepouilleG;
    }

    public StudentPW angledepouilleG(Double angledepouilleG) {
        this.setAngledepouilleG(angledepouilleG);
        return this;
    }

    public void setAngledepouilleG(Double angledepouilleG) {
        this.angledepouilleG = angledepouilleG;
    }

    public Double getAngledepouilleD() {
        return this.angledepouilleD;
    }

    public StudentPW angledepouilleD(Double angledepouilleD) {
        this.setAngledepouilleD(angledepouilleD);
        return this;
    }

    public void setAngledepouilleD(Double angledepouilleD) {
        this.angledepouilleD = angledepouilleD;
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
            ", angleInterneG=" + getAngleInterneG() +
            ", angleInterneD=" + getAngleInterneD() +
            ", angleExterneG=" + getAngleExterneG() +
            ", angleExterneD=" + getAngleExterneD() +
            ", angledepouilleG=" + getAngledepouilleG() +
            ", angledepouilleD=" + getAngledepouilleD() +
            ", angleConvergence=" + getAngleConvergence() +
            "}";
    }
}
