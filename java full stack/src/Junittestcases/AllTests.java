package Junittestcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testcaseadd.class, testcasemul.class, testcasesub.class })
public class AllTests
{

}
