package de.hhu.thymeleafsqlseq.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import de.hhu.thymeleafsqlseq.ThymeleafSqlSeqApplication;
import org.springframework.stereotype.Repository;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packagesOf = ThymeleafSqlSeqApplication.class)
public class ArchunitDatabaseTest {

    @ArchTest
    static final ArchRule REPOSITORY_IN_DB = classes().
            that()
            .areAnnotatedWith(Repository.class)
            .should()
            .resideInAPackage("..db..");

    @ArchTest
    static final ArchRule DTO_IN_DTO_PACKAGE = classes()
            .that()
            .resideInAPackage("..dto..")
            .should()
            .haveSimpleNameEndingWith("Dto");
}
