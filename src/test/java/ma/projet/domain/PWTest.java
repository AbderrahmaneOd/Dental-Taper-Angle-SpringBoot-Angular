package ma.projet.domain;

import static ma.projet.domain.GroupeTestSamples.*;
import static ma.projet.domain.PWTestSamples.*;
import static ma.projet.domain.ToothTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import ma.projet.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class PWTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(PW.class);
        PW pW1 = getPWSample1();
        PW pW2 = new PW();
        assertThat(pW1).isNotEqualTo(pW2);

        pW2.setId(pW1.getId());
        assertThat(pW1).isEqualTo(pW2);

        pW2 = getPWSample2();
        assertThat(pW1).isNotEqualTo(pW2);
    }

    @Test
    void toothTest() throws Exception {
        PW pW = getPWRandomSampleGenerator();
        Tooth toothBack = getToothRandomSampleGenerator();

        pW.setTooth(toothBack);
        assertThat(pW.getTooth()).isEqualTo(toothBack);

        pW.tooth(null);
        assertThat(pW.getTooth()).isNull();
    }

    @Test
    void groupeTest() throws Exception {
        PW pW = getPWRandomSampleGenerator();
        Groupe groupeBack = getGroupeRandomSampleGenerator();

        pW.addGroupe(groupeBack);
        assertThat(pW.getGroupes()).containsOnly(groupeBack);

        pW.removeGroupe(groupeBack);
        assertThat(pW.getGroupes()).doesNotContain(groupeBack);

        pW.groupes(new HashSet<>(Set.of(groupeBack)));
        assertThat(pW.getGroupes()).containsOnly(groupeBack);

        pW.setGroupes(new HashSet<>());
        assertThat(pW.getGroupes()).doesNotContain(groupeBack);
    }
}
