package de.hhu.thymeleafsqlseq.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.GeneralCodingRules;
import de.hhu.thymeleafsqlseq.ThymeleafSqlSeqApplication;
import org.springframework.stereotype.Controller;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packagesOf = ThymeleafSqlSeqApplication.class )
public class ArchLawsTest {

    @ArchTest
    static final ArchRule ALL_CONTROLLERS_SHOULD_RESIDE_IN_CONTROLLERS_PACKAGE = classes()
            .that()
            .resideOutsideOfPackages("..controllers..")
            .should()
            .notBeAnnotatedWith(Controller.class);

}
